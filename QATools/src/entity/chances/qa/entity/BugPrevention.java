/** 
 * Project Name:QATools 
 * File Name:BugPrevention.java 
 * Package Name:chances.qa.entity 
 * Date:2016��5��25������4:00:47 
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved. 
 * 
 */  
package chances.qa.entity;

import java.util.Date;

/** 
 * ClassName:BugPrevention <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016��5��25�� ����4:00:47 <br/> 
 * @author   lixr 
 * @version   
 * @see       
 */
public class BugPrevention {
    
    private Long id;
    
    private String bugName;
    
    private String bugDetail;
    
    //Bug��¼��
    private Long uid;
    
    private String reason;
    
    //��Ԥ�����ѽ��
    private String status;
    
    private String solution;
    
    //���󡢿�ܡ�����
    private String solutionMethod;
    
    private Date createTime;
    
    private Date solutionTime;
    
    private Long productId;
    
    //��������ṩ��
    private Long provider;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBugName() {
        return bugName;
    }

    public void setBugName(String bugName) {
        this.bugName = bugName;
    }

    public String getBugDetail() {
        return bugDetail;
    }

    public void setBugDetail(String bugDetail) {
        this.bugDetail = bugDetail;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getSolutionTime() {
        return solutionTime;
    }

    public void setSolutionTime(Date solutionTime) {
        this.solutionTime = solutionTime;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getSolutionMethod() {
        return solutionMethod;
    }

    public void setSolutionMethod(String solutionMethod) {
        this.solutionMethod = solutionMethod;
    }

    public Long getProvider() {
        return provider;
    }

    public void setProvider(Long provider) {
        this.provider = provider;
    }
        
}
 
