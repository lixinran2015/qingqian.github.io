package pers.bigData.dao;

import java.sql.SQLException;
import java.util.Collection;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import pers.bigData.vo.DimBrand;

public class ImplDimBrand extends SqlMapClientDaoSupport implements DimBrandDao {

    @Override
    public boolean create(DimBrand db) {
        this.getSqlMapClientTemplate().insert("create", db);
        return false;
    }

    @Override
    public boolean update(DimBrand db) {
        this.getSqlMapClientTemplate().update("updateUser", db);
        return false;
    }

    @Override
    public DimBrand getDb(String name) {
        return (DimBrand) this.getSqlMapClientTemplate().queryForObject(
                        "getUserByName", name);
    }

    @Override
    public Collection queryByCondition(DimBrand db) {
        return this.getSqlMapClientTemplate().queryForList("queryByCondition",
                        db, 0, 1);
    }

    @SuppressWarnings("unchecked")
    public Collection getAll() throws SQLException {
        return this.getSqlMapClientTemplate().queryForList("getAllBrand",null);
    }

    @Override
    public boolean delete(String id) {
        // TODO Auto-generated method stub
        return false;
    }

}
