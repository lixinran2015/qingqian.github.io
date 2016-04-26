/**
 * Project Name:Hello_New_World
 * File Name:HelloWorldFour.java
 * Package Name:pers.qingqian.study.four
 * Date:2016年3月4日上午11:25:57
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved.
 * 
 */
package pers.qingqian.study.four;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * ClassName:HelloWorldFour <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date: 2016年3月4日 上午11:25:57 <br/>
 * 
 * @author lixr
 * @version
 * @see
 */
public class HelloWorldFour {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");

    public void studyList() {      
        System.out.println("------------List 开始-----------");
        List list = new ArrayList();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("lisi");

        Iterator it = list.iterator();
        while ( it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("------------List 结束------------");
    }

    public void studySet() {
        System.out.println("------------set 开始------------");
        Set set = new HashSet();
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        set.add("lisi");
        
        Iterator it = set.iterator();
        while ( it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("------------set 结束------------");

    }

    /**
     * 
     * printDate:将字符串-换成日期. <br/>
     * 
     * @author qingqian
     * @param today
     * @return
     * @throws ParseException
     */
    public Date printDate(String today) throws ParseException {
        return sdf.parse(today);
    }

    /**
     * 
     * printDate:将日期格式-换成字符串. <br/>
     * 
     * @author qingqian
     * @param today
     * @return
     * @throws ParseException
     */
    public String printDate(Date today) throws ParseException {
        return sdf.format(today);
    }

    /**
     * printYMD:获取日期中年、月、日，一年中第几天、一月中第几天、星期几等信息 <br/>
     * 
     * @author qingqian
     * @param today
     * @throws ParseException
     */
    public void printYMD(String today) throws ParseException {

        Calendar c = Calendar.getInstance();
        Date date = sdf.parse(today);
        c.setTime(date);
        System.out.println("当前时间：" + c.getTime());
        System.out.println("当前年份：" + c.get(Calendar.YEAR));
        // 从0开始，所以加1
        int month = c.get(Calendar.MONTH) + 1;
        System.out.println("当前月份：" + month);
        System.out.println("当前日期：" + c.get(Calendar.DATE));
        System.out.println("当前日在月中是第几天：" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("当前日是星期几：" + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("当前日在年中是第几天：" + c.get(Calendar.DAY_OF_YEAR));

    }

    /**
     * 
     * addDate:日期加减. <br/>
     * 
     * @author qingqian
     * @throws ParseException
     */
    public void addDate() throws ParseException {
        SimpleDateFormat sdft = new SimpleDateFormat("yyyyMMdd");
        Calendar c = Calendar.getInstance();

        System.out.println("当前时间：" + sdft.format(c.getTime()));
        c.add(Calendar.DATE, 1);// 增加一天
        c.add(Calendar.MONTH, 1);// 增加一月
        c.add(Calendar.YEAR, 1);// 增加一年

        System.out.println("增加1年1月1日后：" + sdft.format(c.getTime()));
        c.set(Calendar.DATE, c.get(Calendar.DATE) - 5);

        System.out.println("减去5天后：" + sdft.format(c.getTime()));

        c.set(Calendar.DATE, c.get(Calendar.DATE) + 23);
        System.out.println("再增加23天：" + sdft.format(c.getTime()));

    }

    public void compareDate(String d1, String d2) throws ParseException {
        Date date1 = sdf.parse(d1);
        Date date2 = sdf.parse(d2);
        int num = date1.compareTo(date2);
        if (num > 0) {
            System.out.println(d1 + "大于" + d2);
        } else {
            System.out.println(d1 + "小于" + d2);
        }

        boolean flaga = date1.after(date2);
        if (flaga == true) {
            System.out.println(d1 + "大于" + d2);
        } else {
            System.out.println(d1 + "小于" + d2);
        }

        boolean flagb = date1.before(date2);
        if (flagb == true) {
            System.out.println(d1 + "小于" + d2);
        } else {
            System.out.println(d1 + "大于" + d2);
        }

    }

    public static void main(String[] args) throws ParseException {

        HelloWorldFour newWorld = new HelloWorldFour();
        /**
         * Date today = newWorld.printDate("20160304 115555");
         * System.out.println("字符串转换成日期：" + today);
         * 
         * String todayStr = newWorld.printDate(new Date());
         * System.out.println("日期转换成字符串：" + todayStr);
         * 
         * newWorld.printYMD("20160204 115555");
         * newWorld.printYMD("20160404 115555");
         **/
        // newWorld.addDate();

        // newWorld.compareDate("20160304 115555", "20160104 115555");
        // newWorld.compareDate("20160104 115555", "20160204 115555");

        newWorld.studyList();
        newWorld.studySet();
    }

}
