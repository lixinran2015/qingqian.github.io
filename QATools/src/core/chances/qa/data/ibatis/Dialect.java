package chances.qa.data.ibatis;
/**
 * 分页语法
 * @author zhangxs
 *
 */
public interface Dialect { 
	/**
	 * 是否支持native分页
	 * @return
	 */
	public boolean supportsLimit();  

	/**
	 * 自动产生数据库分页native语句
	 * @param sql
	 * @param offset
	 * @param limit
	 * @return
	 */
	public String getLimitString(String sql, int offset, int limit); 
	} 
