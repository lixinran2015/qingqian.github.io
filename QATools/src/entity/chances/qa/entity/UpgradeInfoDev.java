/** 
 * Project Name:QATools 
 * File Name:UpgradeInfoDev.java 
 * Package Name:chances.qa.entity 
 * Date:2016年5月25日下午3:25:10 
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved. 
 * 
 */  
package chances.qa.entity;  
/** 
 * ClassName:UpgradeInfoDev <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016年5月25日 下午3:25:10 <br/> 
 * @author   lixr 
 * @version   
 * @see       
 */
public class UpgradeInfoDev {
    
    private Long id;

    private Long upgradeId;
    
    private Long uid;
    
    private String code;
    
    private String config;
    
    private String sql;
    
    private Long codeReviewId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUpgradeId() {
        return upgradeId;
    }

    public void setUpgradeId(Long upgradeId) {
        this.upgradeId = upgradeId;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public Long getCodeReviewId() {
        return codeReviewId;
    }

    public void setCodeReviewId(Long codeReviewId) {
        this.codeReviewId = codeReviewId;
    }

}
 
