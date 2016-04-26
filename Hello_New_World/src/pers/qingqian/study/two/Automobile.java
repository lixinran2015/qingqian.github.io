/**
 * Project Name:Hello_New_World
 * File Name:Automobile.java
 * Package Name:pers.qingqian.study.entity
 * Date:2016年1月27日下午10:19:01
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved.
 * 
 */
package pers.qingqian.study.two;

/**
 * ClassName:Automobile <br/>
 * Function: 汽车. <br/>
 * Date: 2016年1月27日 下午10:19:01 <br/>
 * 
 * @author qingqian
 * @version
 * @see
 */
public class Automobile extends AbstractCar {

    @Override
    public void getStart() {
        System.out.println("我是汽车....");
    }

    @Override
    public void printSpeed() {
        System.out.println("我的启动速度是：" + this.speed());
    }

    public int speed() {
        return 100;
    }

}
