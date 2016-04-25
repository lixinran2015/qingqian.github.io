package pers.bigData.dao;

import java.sql.SQLException;
import java.util.Collection;

import pers.bigData.vo.DimBrand;

public interface DimBrandDao {
	public boolean create(DimBrand db);
	public boolean update(DimBrand db);
	public Collection getAll() throws SQLException;
	
	public DimBrand getDb(String name);
	
	public boolean delete(String id);  
	
	public Collection queryByCondition(DimBrand db);
}
