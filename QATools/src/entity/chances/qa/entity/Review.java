/** 
 * Project Name:QATools 
 * File Name:CodeReview.java 
 * Package Name:chances.qa.entity 
 * Date:2016年5月25日下午3:30:52 
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved. 
 * 
 */  
package chances.qa.entity;

import java.util.Date;
/** 
 * ClassName:CodeReview <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016年5月25日 下午3:30:52 <br/> 
 * @author   lixr 
 * @version   
 * @see       
 */
public class Review {
    
    private Long id;
    
    private Long pid;
    
    private String name;
    
    //需求评审、代码评审、测试用例评审、升级包评审
    private String reviewType;
    
    
    private Date startTime;
    
    private Date endTime;
    
    private String result;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
    public String getReviewType() {
        return reviewType;
    }

    public void setReviewType(String reviewType) {
        this.reviewType = reviewType;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    
    
}
 
