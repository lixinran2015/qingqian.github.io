package chances.qa.data.ibatis;

/**
 * oracle 分页语法
 * 
 * @author zhangxs
 * 
 */
public class OracleDialect implements Dialect {

	public static final String SQL_END_DELIMITER = ";";

	/**
	 * 产生oracle 获取某页数据的sql语句
	 */
	public String getLimitString(String sql, int offset, int limit) {
		if (offset == 1) {
			offset = 0;
		}
		StringBuffer pageStr = new StringBuffer();
		pageStr.append("select * from ( select row_limit.*, rownum rownum_ from (");
		pageStr.append(this.trim(sql));
		pageStr.append(" ) row_limit where rownum <= ");
		pageStr.append(limit + offset);
		pageStr.append(" ) where rownum_ >");
		pageStr.append(offset);
		return pageStr.toString();
	}

	/**
	 * 去掉当前SQL 后分�?
	 * 
	 * @param sql
	 * @return
	 */
	private String trim(String sql) {
		sql = sql.trim();
		if (sql.endsWith(SQL_END_DELIMITER)) {
			sql = sql.substring(0,
					sql.length() - 1 - SQL_END_DELIMITER.length());
		}
		return sql;
	}

	public boolean supportsLimit() {
		return true;
	}
}
