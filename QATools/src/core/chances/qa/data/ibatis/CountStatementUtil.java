package chances.qa.data.ibatis;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.jdbc.exception.NestedSQLException;
import com.ibatis.sqlmap.client.event.RowHandler;
import com.ibatis.sqlmap.engine.impl.ExtendedSqlMapClient;
import com.ibatis.sqlmap.engine.mapping.parameter.ParameterMap;
import com.ibatis.sqlmap.engine.mapping.result.AutoResultMap;
import com.ibatis.sqlmap.engine.mapping.result.ResultMap;
import com.ibatis.sqlmap.engine.mapping.sql.Sql;
import com.ibatis.sqlmap.engine.mapping.statement.CachingStatement;
import com.ibatis.sqlmap.engine.mapping.statement.ExecuteListener;
import com.ibatis.sqlmap.engine.mapping.statement.MappedStatement;
import com.ibatis.sqlmap.engine.mapping.statement.RowHandlerCallback;
import com.ibatis.sqlmap.engine.mapping.statement.SelectStatement;
import com.ibatis.sqlmap.engine.scope.ErrorContext;
import com.ibatis.sqlmap.engine.scope.StatementScope;
/**
 * 查询总数ibatis statement 工具
 * @author zhangxs
 *
 */
public class CountStatementUtil {
	public static MappedStatement createCountStatement(MappedStatement selectStatement) {
		if (selectStatement instanceof CachingStatement) {
			return new CountStatement((MappedStatement) ReflectUtil.getFieldValue(selectStatement, "statement"));
		}

		return new CountStatement(selectStatement);
	}

	public static String getCountStatementId(String selectStatementId) {		
		return "__" + selectStatementId + "Count__";
	}
	
	public static String getCacheCountStatementId(String selectStatementId) {		
		return "__" + selectStatementId + "Count__CM";
	}

}

class CountStatement extends SelectStatement {
	private MappedStatement selectStatement;

	public CountStatement(MappedStatement selectStatement) {
		super();
		setId(CountStatementUtil.getCountStatementId(selectStatement.getId()));
		setResultSetType(selectStatement.getResultSetType());
		setFetchSize(1);
		this.selectStatement = selectStatement;
		setParameterMap(selectStatement.getParameterMap());
		setParameterClass(selectStatement.getParameterClass());
		setSql(selectStatement.getSql());
		setSqlMapClient(selectStatement.getSqlMapClient());
		setTimeout(selectStatement.getTimeout());
		setResource(selectStatement.getResource());

		List executeListeners = (List) ReflectUtil.getFieldValue(
				selectStatement, "executeListeners");
		if (executeListeners != null) {
			for (Object listener : executeListeners) {
				addExecuteListener((ExecuteListener) listener);
			}
		}

		ResultMap resultMap = new AutoResultMap(
				((ExtendedSqlMapClient) getSqlMapClient()).getDelegate(), false);
		resultMap.setId(getId() + "-AutoResultMap");
		resultMap.setResultClass(Long.class);
		resultMap.setResource(getResource());
		setResultMap(resultMap);
	}
	
	public MappedStatement getMyStatement(){
		return selectStatement;
	}

	protected void executeQueryWithCallback(StatementScope request,
			Connection conn, Object parameterObject, Object resultObject,
			RowHandler rowHandler, int skipResults, int maxResults)
			throws SQLException {
		ErrorContext errorContext = request.getErrorContext();
		errorContext
				.setActivity("preparing the mapped statement for execution");
		errorContext.setObjectId(this.getId());
		errorContext.setResource(this.getResource());

		try {
			parameterObject = validateParameter(parameterObject);

			Sql sql = getSql();

			errorContext.setMoreInfo("Check the parameter map.");
			ParameterMap parameterMap = sql.getParameterMap(request,
					parameterObject);

			errorContext.setMoreInfo("Check the result map.");
			ResultMap resultMap = getResultMap();
	//		ResultMap resultMap = getResultMap(request, parameterObject, sql);

			request.setResultMap(resultMap);
			request.setParameterMap(parameterMap);

			errorContext.setMoreInfo("Check the parameter map.");
			Object[] parameters = parameterMap.getParameterObjectValues(
					request, parameterObject);

			errorContext.setMoreInfo("Check the SQL statement.");
			String sqlString = getSqlString(request, parameterObject, sql);

			errorContext.setActivity("executing mapped statement");
			errorContext
					.setMoreInfo("Check the SQL statement or the result map.");
			RowHandlerCallback callback = new RowHandlerCallback(resultMap,
					resultObject, rowHandler);
			sqlExecuteQuery(request, conn, sqlString, parameters, skipResults,
					maxResults, callback);

			errorContext.setMoreInfo("Check the output parameters.");
			if (parameterObject != null) {
				postProcessParameterObject(request, parameterObject, parameters);
			}

			errorContext.reset();
			sql.cleanup(request);
			notifyListeners();
		} catch (SQLException e) {
			errorContext.setCause(e);
			throw new NestedSQLException(errorContext.toString(), e
					.getSQLState(), e.getErrorCode(), e);
		} catch (Exception e) {
			errorContext.setCause(e);
			throw new NestedSQLException(errorContext.toString(), e);
		}
	}

	private String getSqlString(StatementScope request, Object parameterObject,
			Sql sql) {
		String sqlString = sql.getSql(request, parameterObject);

		//System.out.print("动�?SQL �? + request.getDynamicSql());

		/*int start = sqlString.toLowerCase().indexOf("from");
		if (start >= 0) {
			sqlString = "SELECT COUNT(*) AS c " + sqlString.substring(start);
		}*/
		sqlString = "select count(*) as total from ( "+sqlString+" ) as t ";
		return sqlString;
	}

	/*
	private ResultMap getResultMap(StatementScope request,
			Object parameterObject, Sql sql) {
		return getResultMap();
	}*/
}