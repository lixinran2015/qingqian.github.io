/**
 * Project Name:Hello_New_World
 * File Name:HelloWorld.java
 * Package Name:pers.qingqian.study.basic
 * Date:2016年1月16日上午11:32:50
 * Copyright (c) 2016, qingqian All Rights Reserved.
 * 
 */
package pers.qingqian.study.one;

/**
 * ClassName:HelloWorld <br/>
 * Function: 基础练习类. <br/>
 * Reason: study java . <br/>
 * Date: 2016年1月16日 上午11:32:50 <br/>
 * 
 * @author qingqian
 * @version
 * @see
 */
public class HelloWorld {
    public final static int PASSLINE = 60;
    public final static int MIDDLElINE = 75;
    public final static int GOODLINE = 80;
    public final static int EXCELLENTLINE = 90;
    public final static String EXCELLENT = "A ,Excellent";
    public final static String GOOD = "B ,Good";
    public final static String MIDDLE = "C ,Middle";
    public final static String PASS = "D ,PASS";
    public final static String FAIL = "F ,Fail";

    /**
     * main 函数
     * 
     * @author qingqian
     * @param args
     */
    public static void main(String[] args) {
        String str = "Hello world, I'm Qingqian";
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.printStr(str);
        System.out.println(helloWorld.confirmLevel(80));
        System.out.println(helloWorld.confirmLevel(75));

        int[] students = {66, 78, 90, 57, 87, 34, 78 };
        System.out.println(calAllScores(students));
        int[] sum = calPassAndFail(students);
        if (sum.length == 2) {
            System.out.println("及格人数有：" + sum[0]);
            System.out.println("不及格人数有：" + sum[1]);
        }

    }

    /**
     * 打印字符串 <br/>
     * 
     * @author qingqian
     * @param str
     */
    public void printStr(String str) {
        System.out.println(str);
    }

    /**
     * 打印数字 <br/>
     * 
     * @author qingqian
     * @param num
     */
    public void printNum(int num) {
        System.out.println(num);
    }

    /**
     * 
     * calScore:计算一个人的总分. <br/>
     * 
     * @author qingqian
     * @param math
     * @param english
     * @param chinese
     * @return
     */
    public int calScore(int math, int english, int chinese) {
        int sum;
        sum = math + english + chinese;
        return sum;
    }

    /**
     * confirmLevel: 判断成绩的等级. <br/>
     * 
     * @author qingqian
     * @param score
     * @return
     */
    public String confirmLevel(int score) {
        if (score > EXCELLENTLINE) {
            return EXCELLENT;
        } else if (score > GOODLINE) {
            return GOOD;
        } else if (score > MIDDLElINE) {
            return MIDDLE;
        } else if (score > PASSLINE) {
            return PASS;
        } else {
            return FAIL;
        }
    }

    /**
     * 
     * calAllScores:计算一门的总分 <br/>
     * 
     * @author qingqian
     * @param scores
     * @return
     */
    public static int calAllScores(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        return sum;
    }

    /**
     * 
     * calPassAndFail:统计及格、不及格的人数各多少. <br/>
     * 
     * @author qingqian
     * @param scores
     * @return
     */
    public static int[] calPassAndFail(int[] scores) {
        int[] sum = new int[2];
        int sumPass = 0;
        int sumFail = 0;
        int i = 0;

        while (i < scores.length) {
            if (scores[i] > PASSLINE) {
                sumPass++;
            } else {
                sumFail++;
            }
            i++;
        }
        sum[0] = sumPass;
        sum[1] = sumFail;
        return sum;
    }
}
