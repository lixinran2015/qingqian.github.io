package pers.bigData.dao;

import java.sql.SQLException;
import java.util.Collection;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import pers.bigData.vo.DimCity;

public class ImplDimCity extends SqlMapClientDaoSupport implements DimCityDao {

    @Override
    public boolean create(DimCity dc) {
        this.getSqlMapClientTemplate().insert("create", dc);
        return false;
    }

    @Override
    public boolean update(DimCity dc) {
        this.getSqlMapClientTemplate().update("updateUser", dc);
        return false;
    }

    @Override
    public DimCity getDc(String name) {
        return (DimCity) this.getSqlMapClientTemplate().queryForObject(
                        "getUserByName", name);
    }

    @Override
    public Collection queryByCondition(DimCity dc) {
        return this.getSqlMapClientTemplate().queryForList("queryByCondition",
                        dc, 0, 1);
    }

    @SuppressWarnings("unchecked")
    public Collection getAll() throws SQLException {
        return this.getSqlMapClientTemplate().queryForList("getAllCity",null);
    }

    @Override
    public boolean delete(String id) {
        // TODO Auto-generated method stub
        return false;
    }

}
