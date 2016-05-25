/**
 * Project Name:QATools
 * File Name:ProjectTeam.java
 * Package Name:chances.qa.entity
 * Date:2016年5月25日下午3:14:33
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved.
 * 
 */
package chances.qa.entity;

import java.util.Date;

/**
 * ClassName:ProjectTeam <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2016年5月25日 下午3:14:33 <br/>
 * 
 * @author lixr
 * @version
 * @see
 */
public class ProjectTeam implements java.io.Serializable {
    private static final long serialVersionUID = 6654326338700981161L;

    private Long id;

    private Long pid;

    private Long uid;

    private String role;

    private Date joinDate;

    private Date leaveDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }
}
