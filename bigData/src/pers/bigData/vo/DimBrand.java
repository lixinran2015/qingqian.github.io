/** 
 * Project Name:bigData 
 * File Name:DimBrand.java 
 * Package Name:pers.bigData.vo 
 * Date:2016��3��30������1:27:22 
 * Copyright (c) 2016, qingqian All Rights Reserved. 
 * 
 */  
package pers.bigData.vo;  
/** 
 * ClassName:DimBrand <br/> 
 * Function: Ʒ��ά�ȱ� <br/> 
 * Date:     2016��3��30�� ����1:27:22 <br/> 
 * @author   qingqian 
 * @version   
 * @see       
 */
public class DimBrand {
    private String brand_name;//Ʒ������ stg_price.brand
    private String brand_code;//Ʒ�ƴ��롣��������Լ����壬����� �� POLO �á�POLO��������������֤�� �ظ���Ϊ�˼��ڼ䣬����ֻӳ�伸�� ����Ʒ�ƣ�����ȫ���г� HQL ӳ��
    private String data_id; //txt �ļ����ļ��������� ��00062-20151020�� stg_price.data_id 
    private String pt;// ���ڷ���(��ʽ YYYYMMDD)��ֵΪץȡ����
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
 
