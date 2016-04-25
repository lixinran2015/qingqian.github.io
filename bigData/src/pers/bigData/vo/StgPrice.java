/** 
 * Project Name:bigData 
 * File Name:StgPrice.java 
 * Package Name:pers.bigData.vo 
 * Date:2016年3月30日上午11:36:31 
 * Copyright (c) 2016, qingqian All Rights Reserved. 
 * 
 */  
package pers.bigData.vo;  
/** 
 * ClassName:StgPrice <br/> 
 * Function: 车主报价表 <br/> 
 * Date:     2016年3月30日 上午11:36:31 <br/> 
 * @author   qingqian 
 * @version   
 * @see       
 */
public class StgPrice {
    private String brand; //品牌
    private String factory; //厂商
    private String serial; //车系
    private String yearType; //年款
    private String volumn; //排量
    private String carStyle; //车型
    private String guide_price; //厂商指导价（元）
    private String bare_price; //裸车价（元）
    private String buy_tax; //购置税（元）
    private String deal_price; //新车实际成交价（含税）（元）
    private String comm_ins; //商业保险（元）
    private String use_tax; //车船使用税（元）
    private String trff_tax; //交强险（元）
    private String license_fee; //上牌费用（元）
    private String total_price; //合计价格（元）
    private String invoce_flg; //是否包含发票(1 有:0 无)
    private String promotion; //促销套餐 
    private String deal_date; //购车时间。格式(YYYYMMDD)
    private String post_date; //发表时间。格式(YYYYMMDD)
    private String username; //发布昵称
    private String prov; //购车地点（省)
    private String city; //购车地点（市）
    private String sales_name; //购买商家名称 
    private String sales_telno; //商家电话
    private String sales_addr; //商家地址
    private String comment; //购买感受
    private String curl_timestamp; //数据抓取时间
    private String url; //来源网址
    private String data_id; //文件的文件名，比如 “00062-20151020”
    private String pt; //日期分区(格式 YYYYMMDD)，值为抓取 日期 不出现在 txt 中 [注] : 上面每个字段的类型都是 String 字符串类型，下面三张表也相同。 
    
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getFactory() {
        return factory;
    }
    public void setFactory(String factory) {
        this.factory = factory;
    }
    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public String getYearType() {
        return yearType;
    }
    public void setYearType(String yearType) {
        this.yearType = yearType;
    }
    public String getVolumn() {
        return volumn;
    }
    public void setVolumn(String volumn) {
        this.volumn = volumn;
    }
    public String getCarStyle() {
        return carStyle;
    }
    public void setCarStyle(String carStyle) {
        this.carStyle = carStyle;
    }
    
    public String getGuide_price() {
        return guide_price;
    }
    public void setGuide_price(String guide_price) {
        this.guide_price = guide_price;
    }
    public String getBare_price() {
        return bare_price;
    }
    public void setBare_price(String bare_price) {
        this.bare_price = bare_price;
    }
    public String getBuy_tax() {
        return buy_tax;
    }
    public void setBuy_tax(String buy_tax) {
        this.buy_tax = buy_tax;
    }
    public String getDeal_price() {
        return deal_price;
    }
    public void setDeal_price(String deal_price) {
        this.deal_price = deal_price;
    }
    public String getComm_ins() {
        return comm_ins;
    }
    public void setComm_ins(String comm_ins) {
        this.comm_ins = comm_ins;
    }
    public String getUse_tax() {
        return use_tax;
    }
    public void setUse_tax(String use_tax) {
        this.use_tax = use_tax;
    }
    public String getTrff_tax() {
        return trff_tax;
    }
    public void setTrff_tax(String trff_tax) {
        this.trff_tax = trff_tax;
    }
    public String getLicense_fee() {
        return license_fee;
    }
    public void setLicense_fee(String license_fee) {
        this.license_fee = license_fee;
    }
    public String getTotal_price() {
        return total_price;
    }
    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }
    public String getInvoce_flg() {
        return invoce_flg;
    }
    public void setInvoce_flg(String invoce_flg) {
        this.invoce_flg = invoce_flg;
    }
    public String getPromotion() {
        return promotion;
    }
    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }
    public String getDeal_date() {
        return deal_date;
    }
    public void setDeal_date(String deal_date) {
        this.deal_date = deal_date;
    }
    public String getPost_date() {
        return post_date;
    }
    public void setPost_date(String post_date) {
        this.post_date = post_date;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getProv() {
        return prov;
    }
    public void setProv(String prov) {
        this.prov = prov;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getSales_name() {
        return sales_name;
    }
    public void setSales_name(String sales_name) {
        this.sales_name = sales_name;
    }
    public String getSales_telno() {
        return sales_telno;
    }
    public void setSales_telno(String sales_telno) {
        this.sales_telno = sales_telno;
    }
    public String getSales_addr() {
        return sales_addr;
    }
    public void setSales_addr(String sales_addr) {
        this.sales_addr = sales_addr;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getCurl_timestamp() {
        return curl_timestamp;
    }
    public void setCurl_timestamp(String curl_timestamp) {
        this.curl_timestamp = curl_timestamp;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getData_id() {
        return data_id;
    }
    public void setData_id(String data_id) {
        this.data_id = data_id;
    }
    public String getPt() {
        return pt;
    }
    public void setPt(String pt) {
        this.pt = pt;
    }   

}
 
