/** 
 * Project Name:bigData 
 * File Name:dimCity.java 
 * Package Name:pers.bigData.vo 
 * Date:2016��3��30������1:16:37 
 * Copyright (c) 2016, qingqian All Rights Reserved. 
 * 
 */  
package pers.bigData.vo;  
/** 
 * ClassName:dimCity <br/> 
 * Function: ����ά�ȱ�  <br/> 
 * Date:     2016��3��30�� ����1:16:37 <br/> 
 * @author   qingqian 
 * @version   
 * @see       
 */
public class DimCity {
    //create table dim_city (prov_name string, prov_code string,city_name string,city_code string,data_id string ,pt string) ROW FORMAT DELIMITED FIELDS TERMINATED BY '\054';
    private String prov_name;//ʡ���� stg_price.prov 
    private String prov_code;//ʡ���롣��������Լ����壬�����Ϻ� �á�����,���� SH����֤���ظ� HQL ӳ�� 
    private String city_name;//������ stg_price.city 
    private String city_code;//�д��롣�����õ绰���Ż���д���塣 Ϊ�˼��ڼ䣬����ֻӳ��һ�߳��л� ʡ����� HQL ӳ��
    private String data_id;//txt �ļ����ļ��������� ��00062-20151020�� stg_price.data_id 
    private String pt;//���ڷ���(��ʽ YYYYMMDD)��ֵΪץȡ�� ��   
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
 
