/**
 * Project Name:Hello_New_World
 * File Name:Automobile.java
 * Package Name:pers.qingqian.study.entity
 * Date:2016��1��27������10:19:01
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved.
 * 
 */
package pers.qingqian.study.two;

/**
 * ClassName:Automobile <br/>
 * Function: ����. <br/>
 * Date: 2016��1��27�� ����10:19:01 <br/>
 * 
 * @author qingqian
 * @version
 * @see
 */
public class Automobile extends AbstractCar {

    @Override
    public void getStart() {
        System.out.println("��������....");
    }

    @Override
    public void printSpeed() {
        System.out.println("�ҵ������ٶ��ǣ�" + this.speed());
    }

    public int speed() {
        return 100;
    }

}
