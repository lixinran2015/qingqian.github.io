/** 
 * Project Name:QATools 
 * File Name:Fault.java 
 * Package Name:chances.qa.entity 
 * Date:2016年5月25日下午3:54:10 
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved. 
 * 
 */  
package chances.qa.entity;

import java.util.Date;

/** 
 * ClassName:Fault <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016年5月25日 下午3:54:10 <br/> 
 * @author   lixr 
 * @version   
 * @see       
 */
public class Fault {
    private Long id;

    private Long pid;
    
    private String faultName;
    
    private Date occurrenceTime;
    
    private Date processTime;
    
    private Date repairTime ;
    
    private String reason;
    
    private String solution;
    
    private String influence;
    
    private String Level;
    
    private Long uid;

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

    public String getFaultName() {
        return faultName;
    }

    public void setFaultName(String faultName) {
        this.faultName = faultName;
    }

    public Date getOccurrenceTime() {
        return occurrenceTime;
    }

    public void setOccurrenceTime(Date occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
    }

    public Date getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Date processTime) {
        this.processTime = processTime;
    }

    public Date getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(Date repairTime) {
        this.repairTime = repairTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        solution = solution;
    }

    public String getInfluence() {
        return influence;
    }

    public void setInfluence(String influence) {
        this.influence = influence;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }
    
}
 
