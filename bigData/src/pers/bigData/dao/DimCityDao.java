package pers.bigData.dao;

import java.sql.SQLException;
import java.util.Collection;

import pers.bigData.vo.DimCity;

public interface DimCityDao {
	public boolean create(DimCity dc);
	public boolean update(DimCity dc);
	public Collection getAll() throws SQLException;
	
	public DimCity getDc(String name);
	
	public boolean delete(String id);  
	
	public Collection queryByCondition(DimCity dc);
}
