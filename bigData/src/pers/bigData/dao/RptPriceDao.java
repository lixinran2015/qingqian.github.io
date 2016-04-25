package pers.bigData.dao;

import java.util.Collection;

import pers.bigData.vo.RptPrice;

public interface RptPriceDao {
	public boolean create(RptPrice rp);
	public boolean update(RptPrice rp);
	public Collection getAll();
	
	public RptPrice getRpt(String name);
	
	public boolean delete(String id);  
	
	public Collection queryByCondition(RptPrice rp);
}
