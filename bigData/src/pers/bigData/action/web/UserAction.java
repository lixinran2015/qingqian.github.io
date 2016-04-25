package pers.bigData.action.web;

import java.util.Collection;

import pers.bigData.dao.Dao;
import pers.bigData.vo.UserModel;

public class UserAction {
    Dao dao;

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    public void toList() {
        System.out.println("toList===" + dao);
        UserModel um = new UserModel();
        um.setId("id222");
        um.setId("i333");
        um.setId("remote");//bylixr
        um.setId("local"); //bylixinran
        um.setName("namewww");
        dao.create(um);
        // dao.update(um);
        // dao.delete("id111");
        Collection col = dao.getAll();
        System.out.println(col);
    }
    
   
}
