package chances.qa.data.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;



import com.ibatis.sqlmap.client.SqlMapClient;

public abstract class BaseService {
	private static final int MAX_ROW = 500;
	
	@Autowired
	private SqlMapClient sqlMapClient;
	
	
	@Autowired
	protected CountDao countDao;
	
	/**
	 * 
	 * @param queryName
	 * @param paramsMap
	 * @return
	 */
	public Object queryForObject(String statementId,Map<String,Object> paramsMap) {
		try {
			return this.sqlMapClient.queryForObject(statementId,paramsMap);
		} catch (SQLException e) {
			throw new DataException("execute query error,statementId:" + statementId, e);
		}
	}
	
	/**
	 * 
	 * @param statementId
	 * @return
	 */
	public List<?> queryForList(String statementId) {
		try {
			return this.sqlMapClient.queryForList(statementId);
		} catch (SQLException e) {
			throw new DataException("execute query error,statementId:" + statementId, e);
		}
	}
	
	/**
	 * 
	 * @param queryName
	 * @param paramsMap
	 * @return
	 */
	public List<?> queryForList(String statementId,Map<String,Object> paramsMap) {
		try {
			return this.sqlMapClient.queryForList(statementId,paramsMap,0,MAX_ROW);
		} catch (SQLException e) {
			throw new DataException("execute query error,statementId:" + statementId, e);
		}
	}
	
	/**
	 * 
	 * @param queryName
	 * @param paramsMap
	 * @param size
	 * @return
	 */
	public List<?> queryForList(String statementId,Map<String,Object> paramsMap,int start,int size) {
		try {
			return this.sqlMapClient.queryForList(statementId,paramsMap,start,size);
		} catch (SQLException e) {
			throw new DataException("execute query error,statementId:" + statementId, e);
		}
	}
	
	/**
	 * 
	 * @param queryName
	 * @param paramsMap
	 * @param pageBean
	 * @return
	 */
	public List<?> queryForList(String statementId,Map<String,Object> paramsMap,int start,PageBean pageBean) {
		try {
			long recordCount = this.countDao.getObjectTotal(statementId, paramsMap);
			pageBean.setRecordCount(recordCount - start);
			int startRecord = pageBean.getCurrentPageFirstRecord() + start;
			return this.sqlMapClient.queryForList(statementId,paramsMap,startRecord,pageBean.getPageSize());
		} catch (SQLException e) {
			throw new DataException("execute query error,statementId:" + statementId, e);
		}
	}
	
	/**
	 * 
	 * @param statementId
	 * @param paramsMap
	 * @return
	 */
	public Object insert(String statementId,Map<String,Object> paramsMap) {
		try {
			return this.sqlMapClient.insert(statementId, paramsMap);
		} catch (SQLException e) {
			throw new DataException("execute insert error,statementId:" + statementId, e);
		}
	}
	
	
	/**
	 * 
	 * @param statementId
	 * @param paramsMap
	 */
	public void update(String statementId,Map<String,Object> paramsMap){
		try {
			this.sqlMapClient.update(statementId, paramsMap);
		} catch (SQLException e) {
			throw new DataException("execute update error,statementId:" + statementId, e);
		}
	}
	
	/**
	 * 
	 * @param statementId
	 * @param paramsMap
	 */
	public void delete(String statementId,Map<String,Object> paramsMap){
		try {
			this.sqlMapClient.delete(statementId, paramsMap);
		} catch (SQLException e) {
			throw new DataException("execute delete error,statementId:" + statementId, e);
		}
	}
	
		
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}


	public void setCountDao(CountDao countDao) {
		this.countDao = countDao;
	}
}
