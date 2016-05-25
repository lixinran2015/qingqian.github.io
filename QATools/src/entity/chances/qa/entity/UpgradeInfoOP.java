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
 * ClassName:UpgradeInfoOP<br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016年5月25日 下午3:41:41 <br/> 
 * @author   lixr 
 * @version   
 * @see       
 */
public class UpgradeInfoOP {
    private Long id;

    private Long upgradeId;
    
    private Long uid;
    
    private Long reviewId;
    
    private String implementDoc;

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

    public String getImplementDoc() {
        return implementDoc;
    }

    public void setImplementDoc(String implementDoc) {
        this.implementDoc = implementDoc;
    }
   
}
 
