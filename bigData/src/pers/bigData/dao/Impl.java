package pers.bigData.dao;

import java.util.Collection;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import pers.bigData.vo.UserModel;
import pers.bigData.vo.UserQueryModel;

public class Impl extends SqlMapClientDaoSupport  implements Dao {

	public boolean create(UserModel um)  {
		this.getSqlMapClientTemplate().insert("create", um);
		return false;
	}

	public boolean delete(String id) { 
		this.getSqlMapClientTemplate().delete("delete",id);
		return false;
	}

	public Collection getAll() {
		UserQueryModel uqm=new UserQueryModel();
		uqm.setFromNum(0);
		uqm.setToNum(10);
		return this.getSqlMapClientTemplate().queryForList("getAll",uqm);
	}

	public UserModel getUser(String name) {
		return (UserModel) this.getSqlMapClientTemplate().queryForObject("getUserByName",name);
	}

	public Collection queryByCondition(UserModel um) {
		return this.getSqlMapClientTemplate().queryForList("queryByCondition",um,0,1);
	}

	public boolean update(UserModel um) {
		this.getSqlMapClientTemplate().update("updateUser",um);
		return false;
	}

}
