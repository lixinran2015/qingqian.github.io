package chances.qa.data.ibatis;

public class MySQLDialect implements Dialect {

	protected static final String SQL_END_DELIMITER = ";";

	public String getLimitString(String sql, boolean hasOffset) {
		return new StringBuffer(sql.length() + 20).append(trim(sql)).append(
				hasOffset ? " limit ?,?" : " limit ?")
				.append(SQL_END_DELIMITER).toString();
	}

	public String getLimitString(String sql, int offset, int limit) {
		/*
		 * oracle sql = trim(sql); StringBuffer sb = new
		 * StringBuffer(sql.length() + 20);
		 * sb.append("select * from ( select sq.*, rownum as rn from (");
		 * sb.append(this.trim(sql));
		 * sb.append(") sq)row_limit where row_limit.rn between ");
		 * sb.append(limit (offset-1) + 1); sb.append(" and "); sb.append(limit
		 * offset);
		 */
		// offset 第几�?limit 每页个数
		sql = trim(sql);
		StringBuffer sb = new StringBuffer(sql.length() + 20);
		sb.append(sql);
		if (offset > 0) {
			sb.append(" limit ").append(offset).append(',')
					.append(limit).append(SQL_END_DELIMITER);
		} else {
			sb.append(" limit ").append(limit).append(SQL_END_DELIMITER);
		}
		return sb.toString();
	}

	public boolean supportsLimit() {
		return true;
	}

	private String trim(String sql) {
		sql = sql.trim();
		if (sql.endsWith(SQL_END_DELIMITER)) {
			sql = sql.substring(0, sql.length() - 1
					- SQL_END_DELIMITER.length());
		}
		return sql;
	}

}
