/** 
 * Project Name:bigData 
 * File Name:dimCity.java 
 * Package Name:pers.bigData.vo 
 * Date:2016年3月30日下午1:16:37 
 * Copyright (c) 2016, qingqian All Rights Reserved. 
 * 
 */  
package pers.bigData.vo;  
/** 
 * ClassName:dimCity <br/> 
 * Function: 地区维度表  <br/> 
 * Date:     2016年3月30日 下午1:16:37 <br/> 
 * @author   qingqian 
 * @version   
 * @see       
 */
public class DimCity {
    //create table dim_city (prov_name string, prov_code string,city_name string,city_code string,data_id string ,pt string) ROW FORMAT DELIMITED FIELDS TERMINATED BY '\054';
    private String prov_name;//省名称 stg_price.prov 
    private String prov_code;//省代码。代码可以自己定义，比如上海 用“沪”,或是 SH，保证不重复 HQL 映射 
    private String city_name;//市名称 stg_price.city 
    private String city_code;//市代码。可以用电话区号或缩写定义。 为了简单期间，可以只映射一线城市或 省会城市 HQL 映射
    private String data_id;//txt 文件的文件名，比如 “00062-20151020” stg_price.data_id 
    private String pt;//日期分区(格式 YYYYMMDD)，值为抓取日 期   
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
 
