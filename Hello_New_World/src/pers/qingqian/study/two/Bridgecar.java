/**
 * Project Name:Hello_New_World
 * File Name:Bridgecar.java
 * Package Name:pers.qingqian.study.entity
 * Date:2016年1月27日下午10:32:35
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved.
 * 
 */
package pers.qingqian.study.two;

/**
 * ClassName:Bridgecar <br/>
 * Function: 小桥车. <br/>
 * Date: 2016年1月27日 下午10:32:35 <br/>
 * 
 * @author qingqian
 * @version
 * @see
 */
public class Bridgecar extends AbstractCar {

    @Override
    public void getStart() {
        System.out.println("我是小桥车...");

    }

    @Override
    public void printSpeed() {
        System.out.println("我的启动速度是：" + this.speed());
    }

    public int speed() {
        return 120;
    }
}
