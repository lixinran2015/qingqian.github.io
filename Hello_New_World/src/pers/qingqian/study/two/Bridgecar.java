/**
 * Project Name:Hello_New_World
 * File Name:Bridgecar.java
 * Package Name:pers.qingqian.study.entity
 * Date:2016��1��27������10:32:35
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved.
 * 
 */
package pers.qingqian.study.two;

/**
 * ClassName:Bridgecar <br/>
 * Function: С�ų�. <br/>
 * Date: 2016��1��27�� ����10:32:35 <br/>
 * 
 * @author qingqian
 * @version
 * @see
 */
public class Bridgecar extends AbstractCar {

    @Override
    public void getStart() {
        System.out.println("����С�ų�...");

    }

    @Override
    public void printSpeed() {
        System.out.println("�ҵ������ٶ��ǣ�" + this.speed());
    }

    public int speed() {
        return 120;
    }
}
