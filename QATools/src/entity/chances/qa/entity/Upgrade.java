/** 
 * Project Name:QATools 
 * File Name:Upgrade.java 
 * Package Name:chances.qa.entity 
 * Date:2016年5月25日下午3:19:35 
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved. 
 * 
 */  
package chances.qa.entity;

import java.util.Date;

/** 
 * ClassName:Upgrade <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016年5月25日 下午3:19:35 <br/> 
 * @author   lixr 
 * @version   
 * @see       
 */
public class Upgrade implements java.io.Serializable{
    private static final long serialVersionUID = 6654326338700981161L;
    
    private Long id;

    private Long pid;
    
    private String upgradeName;
    
    private String upgradeFun;
    
    private Date customerDate;
    
    private Date actualDate;
    
    private boolean result;
    
    private String upgradeVersion;
    
    private Long agreedUser;
    
    private String resultDes;
    

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

    public String getUpgradeName() {
        return upgradeName;
    }

    public void setUpgradeName(String upgradeName) {
        this.upgradeName = upgradeName;
    }

    public String getUpgradeFun() {
        return upgradeFun;
    }

    public void setUpgradeFun(String upgradeFun) {
        this.upgradeFun = upgradeFun;
    }

    public Date getCustomerDate() {
        return customerDate;
    }

    public void setCustomerDate(Date customerDate) {
        this.customerDate = customerDate;
    }

    public Date getActualDate() {
        return actualDate;
    }

    public void setActualDate(Date actualDate) {
        this.actualDate = actualDate;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getUpgradeVersion() {
        return upgradeVersion;
    }

    public void setUpgradeVersion(String upgradeVersion) {
        this.upgradeVersion = upgradeVersion;
    }

    public Long getAgreedUser() {
        return agreedUser;
    }

    public void setAgreedUser(Long agreedUser) {
        this.agreedUser = agreedUser;
    }

    public String getResultDes() {
        return resultDes;
    }

    public void setResultDes(String resultDes) {
        this.resultDes = resultDes;
    }
   
}
 
