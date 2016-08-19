/** 
 * Project Name:Hello_New_World 
 * File Name:Person.java 
 * Package Name:pers.qingqian.study.seven 
 * Date:2016年7月18日下午5:19:32 
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved. 
 * 
 */  
package pers.qingqian.study.seven;

/** 
 * ClassName:Person <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016年7月18日 下午5:19:32 <br/> 
 * @author   lixr 
 * @version   
 * @see       
 */
public class Person {
    private String name;
    private String pwd;
    private int age;
    
    public Person(String name,String pwd,int age){
        this.name=name;
        this.pwd=pwd;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

}
 
