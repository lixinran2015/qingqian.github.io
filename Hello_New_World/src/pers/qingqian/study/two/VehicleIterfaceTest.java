/**
 * Project Name:Hello_New_World
 * File Name:VehicleIterfaceTest.java
 * Package Name:pers.qingqian.study.imp
 * Date:2016��1��27������10:42:21
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved.
 * 
 */
package pers.qingqian.study.two;

/**
 * ClassName:VehicleIterfaceTest <br/>
 * Function: ������. <br/>
 * Date: 2016��1��27�� ����10:42:21 <br/>
 * 
 * @author qingqian
 * @version
 * @see
 */
public class VehicleIterfaceTest {

    public static void main(String[] args) {

        VehicleInterface veimp1 = new Automobile();
        VehicleInterface veimp2 = new Bridgecar();
        veimp1.getSpeed();
        veimp2.getSpeed();
        
    }
}
