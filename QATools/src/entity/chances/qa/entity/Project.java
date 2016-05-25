/** 
 * Project Name:QATools 
 * File Name:Project.java 
 * Package Name:chances.qa.entity 
 * Date:2016��5��25������2:58:46 
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved. 
 * 
 */  
package chances.qa.entity;

import java.util.Date;

/** 
 * ClassName:Project <br/> 
 * Function: ��Ŀ��. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016��5��25�� ����2:58:46 <br/> 
 * @author   lixr 
 * @version   
 * @see       
 */
public class Project implements java.io.Serializable{
    private static final long serialVersionUID = 6654326338700981161L;

    private Long id;
    
    private String projectName;
    
    private String customer;
    
    private Date startDate;
    
    private Date endDate;
    
    private String projectDes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }    

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getProjectDes() {
        return projectDes;
    }

    public void setProjectDes(String projectDes) {
        this.projectDes = projectDes;
    }
}
 
