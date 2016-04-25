package pers.bigData.dao;

import java.util.Collection;

import pers.bigData.vo.UserModel;

public interface Dao {
	public boolean create(UserModel um);
	public boolean update(UserModel um);
	public Collection getAll();
	
	public UserModel getUser(String name);
	
	public boolean delete(String id);
	
	public Collection queryByCondition(UserModel um);
}
