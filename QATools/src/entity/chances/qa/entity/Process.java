/** 
 * Project Name:QATools 
 * File Name:Process.java 
 * Package Name:chances.qa.entity 
 * Date:2016年5月25日下午5:04:55 
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved. 
 * 
 */  
package chances.qa.entity;  
/** 
 * ClassName:Process <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016年5月25日 下午5:04:55 <br/> 
 * @author   lixr 
 * @version   
 * @see       
 */
public class Process {
    
    private Long id;
    
    private String processName;
    
    private String processDes;
    
    private String processPic;
    
    private Long uid;
    
    private String participant;
    
    private String appPhase;
    
    private String conditions;
    
    private Long parentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getProcessPic() {
        return processPic;
    }

    public void setProcessPic(String processPic) {
        this.processPic = processPic;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    public String getAppPhase() {
        return appPhase;
    }

    public void setAppPhase(String appPhase) {
        this.appPhase = appPhase;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getProcessDes() {
        return processDes;
    }

    public void setProcessDes(String processDes) {
        this.processDes = processDes;
    }
}
 
