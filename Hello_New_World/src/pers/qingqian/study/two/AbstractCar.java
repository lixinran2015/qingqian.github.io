/**
 * Project Name:Hello_New_World
 * File Name:AbstractCar.java
 * Package Name:pers.qingqian.study.entity
 * Date:2016年1月23日下午3:49:54
 * Copyright (c) 2016, qingqian All Rights Reserved.
 * 
 */
package pers.qingqian.study.two;

/** 
 * ClassName:AbstractCar <br/>
 * Function:车的抽象类 <br/>
 * Date: 2016年1月23日 下午3:49:54 <br/>
 * 
 * @author qingqian
 * @version
 * @see
 */
public abstract class AbstractCar implements VehicleInterface {

    public void getSpeed() {
        this.getStart();
        this.printSpeed();
    }

    public abstract void getStart();

    public abstract int speed();

    // 输出速度
    public void printSpeed() {
        System.out.println("我的启动速度是：" + this.speed());
    }

}
