/** 
 * Project Name:bigData 
 * File Name:DimBrand.java 
 * Package Name:pers.bigData.vo 
 * Date:2016年3月30日下午1:27:22 
 * Copyright (c) 2016, qingqian All Rights Reserved. 
 * 
 */  
package pers.bigData.vo;  
/** 
 * ClassName:DimBrand <br/> 
 * Function: 品牌维度表 <br/> 
 * Date:     2016年3月30日 下午1:27:22 <br/> 
 * @author   qingqian 
 * @version   
 * @see       
 */
public class DimBrand {
    private String brand_name;//品牌名称 stg_price.brand
    private String brand_code;//品牌代码。代码可以自己定义，比如大 众 POLO 用“POLO”或是其他，保证不 重复。为了简单期间，可以只映射几个 常用品牌，不必全部列出 HQL 映射
    private String data_id; //txt 文件的文件名，比如 “00062-20151020” stg_price.data_id 
    private String pt;// 日期分区(格式 YYYYMMDD)，值为抓取日期
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
 
