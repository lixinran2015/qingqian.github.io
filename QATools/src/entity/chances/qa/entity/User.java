/** 
 * Project Name:QATools 
 * File Name:User.java 
 * Package Name:chances.qa.entity 
 * Date:2016年5月25日下午4:21:55 
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved. 
 * 
 */  
package chances.qa.entity;

import java.util.Date;

/** 
 * ClassName:User <br/> 
 * Function: 人员管理 <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016年5月25日 下午4:21:55 <br/> 
 * @author   lixr 
 * @version   
 * @see       
 */
public class User {

    private Long id;
    
    private String name;
    
    private String passwd;
    
    private String position;
    
    private String level;
    
    private Date joinDate;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
}
 
