/** 
 * Project Name:QATools 
 * File Name:Product.java 
 * Package Name:chances.qa.entity 
 * Date:2016年5月25日下午5:25:00 
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved. 
 * 
 */  
package chances.qa.entity;

import java.util.Date;

/** 
 * ClassName:Product <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016年5月25日 下午5:25:00 <br/> 
 * @author   lixr 
 * @version   
 * @see       
 */
public class Product {
    private Long id;
    
    private String name;
    
    private String des;
    
    private String pm;
    
    private Date startTime;
    
    private Date endTime;

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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
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

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    
}
 
