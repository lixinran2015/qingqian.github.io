package pers.bigData.action.web;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import pers.bigData.dao.RptPriceDao;
import pers.bigData.vo.RptPrice;

public class RptPriceAction extends ActionSupport {
    RptPriceDao daoRpt;
    Collection colrp;
    private RptPrice rpt = new RptPrice();
    
    public RptPrice getRpt() {
        return rpt;
    }

    public void setRpt(RptPrice rpt) {
        this.rpt = rpt;
    }

    private static final Log logger = LogFactory.getLog(RptPriceAction.class);

    public void setCol(Collection col) {
        this.colrp = col;
    }

    public RptPriceDao getDaoRpt() {
        return daoRpt;
    }

    public void setDaoRpt(RptPriceDao daoRpt) {
        this.daoRpt = daoRpt;
    }

    /*
     * (non-Javadoc)    
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    @Override
    public String execute() throws Exception {  
        logger.info("Brand_code:" + rpt.getBrand_code());
        colrp = daoRpt.queryByCondition(rpt);
        ServletActionContext.getRequest().setAttribute("colrp", colrp);
        return SUCCESS;
    }

}
