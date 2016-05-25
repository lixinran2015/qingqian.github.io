package chances.qa.data.ibatis;

import java.util.Collection;
import java.util.HashMap;

import org.slf4j.Logger;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.engine.cache.CacheModel;
import com.ibatis.sqlmap.engine.execution.SqlExecutor;
import com.ibatis.sqlmap.engine.impl.ExtendedSqlMapClient;
import com.ibatis.sqlmap.engine.impl.SqlMapExecutorDelegate;
import com.ibatis.sqlmap.engine.mapping.statement.CachingStatement;
import com.ibatis.sqlmap.engine.mapping.statement.MappedStatement;

import org.springframework.orm.ibatis.*;
import chances.qa.commons.log.QALogFactory;
/**
 * ibatis数据访问
 * 支持自动查询总数,并cache的功能
 * @author zhangxs  
 *  
 */
public class CountDao extends SqlMapClientDaoSupport {
	
	protected static Logger logger = QALogFactory.getSystemLogger();
	
	private SqlExecutor sqlExecutor;

	public SqlExecutor getSqlExecutor() {
		return sqlExecutor;
	}

	public void setSqlExecutor(SqlExecutor sqlExecutor) {
		this.sqlExecutor = sqlExecutor;
	}

	public void setEnableLimit(boolean enableLimit) {
		if (sqlExecutor instanceof LimitSqlExecutor) {
			((LimitSqlExecutor) sqlExecutor).setEnableLimit(enableLimit);
		}
	}

	public void initialize() throws Exception {
		if (sqlExecutor != null) {
			SqlMapClient sqlMapClient = getSqlMapClientTemplate()
					.getSqlMapClient();
			if (sqlMapClient instanceof ExtendedSqlMapClient) {
				ReflectUtil.setFieldValue(((ExtendedSqlMapClient) sqlMapClient)
						.getDelegate(), "sqlExecutor", SqlExecutor.class,
						sqlExecutor);
			}
			//init all count statement
			//在系统初始化时按照ibatis xml配置产生�?��statement的查询�?数statement,已方便在后面使用时直接读取该count statement即可
			//而无�?��实时创建.
			produceAllCountStatement(sqlMapClient);
		}
	}
	
	/**
	 * 产生查询总数的statement,在分页时使用获取总记录数
	 * @param sqlMapClient
	 */
	private void produceAllCountStatement(SqlMapClient sqlMapClient) {
		if (sqlMapClient instanceof ExtendedSqlMapClient) {
			SqlMapExecutorDelegate delegate = ((ExtendedSqlMapClient) sqlMapClient)
					.getDelegate();
			HashMap<String,MappedStatement> ms = (HashMap<String,MappedStatement>) ReflectUtil.getFieldValue(delegate, "mappedStatements");
		     Collection<MappedStatement> cols = ms.values();
		     Object[] objs = cols.toArray();
		     CountStatement cs = null;
		     MappedStatement mapsta = null;
		     for(int i=0;i<objs.length;i++){
		    	 mapsta =  (MappedStatement) objs[i];
		    	 cs = (CountStatement) CountStatementUtil.createCountStatement(mapsta);
		    	if (delegate.isCacheModelsEnabled()){
		    		if (mapsta instanceof CachingStatement){
		    			//System.out.println("cache-----"+mapsta.getId());
		    			delegate.addMappedStatement(createCacheCountStatement(cs,(CachingStatement)mapsta));
		    		}else{
		    			//System.out.println(mapsta.getId());
		    			delegate.addMappedStatement(cs);
		    		}
		    	}else{
		    		delegate.addMappedStatement(cs);
		    	}
		     }		     
		}
	}
	/**
	 * 计数cachemodel 共用原有查询�?
	 * @param countStatement
	 * @param cs
	 * @return
	 */
	public CachingStatement createCacheCountStatement(CountStatement countStatement,CachingStatement cs) {
		//CacheModel cm = new CacheModel();
	    CacheModel cm1 = (CacheModel)ReflectUtil.getFieldValue(cs, "cacheModel");	    
	  /*  LruCacheController cc = (LruCacheController)ReflectUtil.getFieldValue(cm1, "controller");	 
	    cm.setId(countStatement.getId()+"CM");
		try {
			cm.setCacheController(new LruCacheController());
		} catch (Exception e) {
			throw new ServiceCannotFoundException("ibatis cache lib lost");
		}
		cm.setSerialize(false);
		cm.setFlushInterval(cm1.getFlushInterval());
		cm.setReadOnly(true);
		Properties p = new Properties();
		p.put("cache-size", cc.getCacheSize());
		cm.setControllerProperties(p);*/		
		return  new CachingStatement(countStatement,cm1);
	}
	
	

	public long getObjectTotal(String statementId, Object parameterObject) {
	     //prepareCountQuery(selectQuery);
		//produceAllCountStatement(getSqlMapClientTemplate()
		//		.getSqlMapClient());
		return (Long) getSqlMapClientTemplate().queryForObject(
				CountStatementUtil.getCountStatementId(statementId),
				parameterObject);
	}


	public long getObjectTotal(String statementId) {
		//prepareCountQuery(selectQuery);
		return (Long) getSqlMapClientTemplate().queryForObject(
				CountStatementUtil.getCountStatementId(statementId));
	}

	/*protected void prepareCountQuery(String selectQuery) {
		String countQuery = CountStatementUtil.getCountStatementId(selectQuery);
		if (logger.isDebugEnabled()) {
			logger.debug("Convert " + selectQuery + " to " + countQuery);
		}
		SqlMapClient sqlMapClient = getSqlMapClientTemplate().getSqlMapClient();
		if (sqlMapClient instanceof ExtendedSqlMapClient) {
			SqlMapExecutorDelegate delegate = ((ExtendedSqlMapClient) sqlMapClient)
					.getDelegate();
			//synchronized(lock){
				try {
					delegate.getMappedStatement(countQuery);
				} catch (SqlMapException e) {
					try{
						MappedStatement ms = delegate.getMappedStatement(selectQuery);
						CountStatement cs = (CountStatement) CountStatementUtil.createCountStatement(ms);
						delegate.addMappedStatement(cs);
					}catch(Exception e1){
						e1.printStackTrace();
					}
					
				}
			//}

		}
	}*/
}
