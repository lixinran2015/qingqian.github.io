/** 
 * Project Name:bigData 
 * File Name:RptPrice.java 
 * Package Name:pers.bigData.vo 
 * Date:2016��3��30������1:30:24 
 * Copyright (c) 2016, qingqian All Rights Reserved. 
 * 
 */  
package pers.bigData.vo;  
/** 
 * ClassName:RptPrice <br/> 
 * Function: �۾ɳ��۱� <br/> 
 * Date:     2016��3��30�� ����1:30:24 <br/> 
 * @author   qingqian 
 * @version   
 * @see       
 */
public class RptPrice {
    
    private String brand_name; //Ʒ������ stg_price
    private String brand_code; //Ʒ�ƴ��� dim_brand 
    private String factory; //����stg_price
    private String serial; //��ϵstg_price
    private String yearType; //���stg_price
    private String volumn; //����stg_price
    private String carStyle; //����stg_price
    private String guide_price; //����ָ���ۣ�Ԫ��stg_price
    private String bare_price; //�㳵�ۣ�Ԫ��stg_price
    private String buy_tax; //����˰��Ԫ��stg_price
    private String deal_price; //�³�ʵ�ʳɽ��ۣ���˰����Ԫ��stg_price
    private String comm_ins; //��ҵ���գ�Ԫ��stg_price
    private String use_tax; //����ʹ��˰��Ԫ��stg_price
    private String trff_tax; //��ǿ�գ�Ԫ��stg_price
    private String license_fee; //���Ʒ��ã�Ԫ��stg_price
    private String total_price; //�ϼƼ۸�Ԫ��stg_price
    private String invoce_flg; //�Ƿ������Ʊ(1 ��:0 ��)stg_price
    private String promotion; //�����ײ� stg_price
    private String deal_date; //����ʱ�䡣��ʽ(YYYYMMDD)stg_price
    private String post_date; //����ʱ�䡣��ʽ(YYYYMMDD)stg_price
    private String username; //�����ǳ�stg_price
    private String prov_name; //�����ص㣨ʡ)stg_price
    private String prov_code; //dim_city
    private String city_name; //�����ص㣨�У�stg_price
    private String city_code; //dim_city
    private String sales_name; //�����̼����� stg_price
    private String sales_telno; //�̼ҵ绰stg_price
    private String sales_addr; //�̼ҵ�ַstg_price
    private String comment; //�������stg_price
    private String curl_timestamp; //����ץȡʱ��stg_price
    private String url; //��Դ��ַstg_price
    private String data_id; //�ļ����ļ��������� ��00062-20151020��
    private String used_month;//���䣨�£������ֶ�
    private String year_discount;//���۾ɵȼ��ٷֱ�  �����ֶ�
    private String pt; //���ڷ���(��ʽ YYYYMMDD)��ֵΪץȡ ���� �������� txt �� [ע] : ����ÿ���ֶε����Ͷ��� String �ַ������ͣ��������ű�Ҳ��ͬ�� 
    public String getBrand_name() {
        return brand_name;
    }
    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }
    public String getBrand_code() {
        return brand_code;
    }
    public void setBrand_code(String brand_code) {
        this.brand_code = brand_code;
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
    public String getProv_name() {
        return prov_name;
    }
    public void setProv_name(String prov_name) {
        this.prov_name = prov_name;
    }
    public String getProv_code() {
        return prov_code;
    }
    public void setProv_code(String prov_code) {
        this.prov_code = prov_code;
    }
    public String getCity_name() {
        return city_name;
    }
    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
    public String getCity_code() {
        return city_code;
    }
    public void setCity_code(String city_code) {
        this.city_code = city_code;
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
    public String getUsed_month() {
        return used_month;
    }
    public void setUsed_month(String used_month) {
        this.used_month = used_month;
    }
    public String getYear_discount() {
        return year_discount;
    }
    public void setYear_discount(String year_discount) {
        this.year_discount = year_discount;
    }
    public String getPt() {
        return pt;
    }
    public void setPt(String pt) {
        this.pt = pt;
    }
  
}
 
