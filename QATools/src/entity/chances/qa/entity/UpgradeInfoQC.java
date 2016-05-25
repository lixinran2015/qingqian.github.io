/** 
 * Project Name:QATools 
 * File Name:UpgradeInfoQC.java 
 * Package Name:chances.qa.entity 
 * Date:2016年5月25日下午3:41:41 
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved. 
 * 
 */  
package chances.qa.entity;  
/** 
 * ClassName:UpgradeInfoQC <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016年5月25日 下午3:41:41 <br/> 
 * @author   lixr 
 * @version   
 * @see       
 */
public class UpgradeInfoQC {
    private Long id;

    private Long upgradeId;
    
    private Long uid;
    
    private Long reviewId;
    
    private String upackage;
    
    private Long upkReviewId;

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

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public String getUpackage() {
        return upackage;
    }

    public void setUpackage(String upackage) {
        this.upackage = upackage;
    }

    public Long getUpkReviewId() {
        return upkReviewId;
    }

    public void setUpkReviewId(Long upkReviewId) {
        this.upkReviewId = upkReviewId;
    }
    
}
 
