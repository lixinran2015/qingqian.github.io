/**
 * Project Name:Hello_New_World
 * File Name:AbstractCar.java
 * Package Name:pers.qingqian.study.entity
 * Date:2016��1��23������3:49:54
 * Copyright (c) 2016, qingqian All Rights Reserved.
 * 
 */
package pers.qingqian.study.two;

/** 
 * ClassName:AbstractCar <br/>
 * Function:���ĳ����� <br/>
 * Date: 2016��1��23�� ����3:49:54 <br/>
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

    // ����ٶ�
    public void printSpeed() {
        System.out.println("�ҵ������ٶ��ǣ�" + this.speed());
    }

}
