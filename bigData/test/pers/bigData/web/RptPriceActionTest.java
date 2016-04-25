/**
 * Project Name:bigData
 * File Name:RptPriceActionTest.java
 * Package Name:pers.bigData.web
 * Date:2016年3月31日下午5:40:09
 * Copyright (c) 2016, qingqian All Rights Reserved.
 * 
 */
package pers.bigData.web;

import org.junit.Test;

import com.opensymphony.xwork2.ActionSupport;

import pers.bigData.action.web.RptPriceAction;

/**
 * ClassName:RptPriceActionTest <br/>
 * Function: 测试. <br/>
 * Date: 2016年3月31日 下午5:40:09 <br/>
 * 
 * @author qingqian
 * @version
 * @see
 */
@SuppressWarnings("deprecation")
public class RptPriceActionTest extends ActionSupport {
    private RptPriceAction rptAction = null;

    @Test
    public void testExecute() throws Exception {
        //
    }
    
    public RptPriceAction getRptAction() {
        return rptAction;
    }

    public void setRptAction(RptPriceAction rptAction) {
        this.rptAction = rptAction;
    }
}
