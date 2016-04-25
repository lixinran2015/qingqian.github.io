package pers.bigData.dao;

import java.util.Collection;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import pers.bigData.vo.RptPrice;    

public class ImplRptPrice extends SqlMapClientDaoSupport  implements RptPriceDao {    
    @Override
    public boolean create(RptPrice rp) {
        this.getSqlMapClientTemplate().insert("create", rp);
        return false;
    }

    @Override
    public boolean update(RptPrice rp) {
        this.getSqlMapClientTemplate().update("updateUser",rp);
        return false;
    }

    @Override
    public RptPrice getRpt(String name) {
        return (RptPrice) this.getSqlMapClientTemplate().queryForObject("getUserByName",name);
    }

    @Override
    public Collection queryByCondition(RptPrice rp) {
        return this.getSqlMapClientTemplate().queryForList("queryByConditionrp",rp);
    }

    @Override
    public Collection getAll() {
        // TODO Auto-generated method stub
        return null;    
    }

    @Override
    public boolean delete(String id) {
        // TODO Auto-generated method stub
        return false;
    }

}
