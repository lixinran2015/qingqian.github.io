/**
 * Project Name:QATools
 * File Name:CodeReviewTeam.java
 * Package Name:chances.qa.entity
 * Date:2016年5月25日下午3:36:34
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved.
 * 
 */
package chances.qa.entity;

/**
 * ClassName:CodeReviewTeam <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2016年5月25日 下午3:36:34 <br/>
 * 
 * @author lixr
 * @version
 * @see
 */
public class ReviewTeam {
    private Long id;

    private Long cid;
    
    private Long uid;
    
    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
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
}
