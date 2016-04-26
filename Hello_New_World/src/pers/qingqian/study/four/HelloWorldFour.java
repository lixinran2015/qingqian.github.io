/**
 * Project Name:Hello_New_World
 * File Name:HelloWorldFour.java
 * Package Name:pers.qingqian.study.four
 * Date:2016��3��4������11:25:57
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
 * Date: 2016��3��4�� ����11:25:57 <br/>
 * 
 * @author lixr
 * @version
 * @see
 */
public class HelloWorldFour {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");

    public void studyList() {      
        System.out.println("------------List ��ʼ-----------");
        List list = new ArrayList();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("lisi");

        Iterator it = list.iterator();
        while ( it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("------------List ����------------");
    }

    public void studySet() {
        System.out.println("------------set ��ʼ------------");
        Set set = new HashSet();
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        set.add("lisi");
        
        Iterator it = set.iterator();
        while ( it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("------------set ����------------");

    }

    /**
     * 
     * printDate:���ַ���-��������. <br/>
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
     * printDate:�����ڸ�ʽ-�����ַ���. <br/>
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
     * printYMD:��ȡ�������ꡢ�¡��գ�һ���еڼ��졢һ���еڼ��졢���ڼ�����Ϣ <br/>
     * 
     * @author qingqian
     * @param today
     * @throws ParseException
     */
    public void printYMD(String today) throws ParseException {

        Calendar c = Calendar.getInstance();
        Date date = sdf.parse(today);
        c.setTime(date);
        System.out.println("��ǰʱ�䣺" + c.getTime());
        System.out.println("��ǰ��ݣ�" + c.get(Calendar.YEAR));
        // ��0��ʼ�����Լ�1
        int month = c.get(Calendar.MONTH) + 1;
        System.out.println("��ǰ�·ݣ�" + month);
        System.out.println("��ǰ���ڣ�" + c.get(Calendar.DATE));
        System.out.println("��ǰ���������ǵڼ��죺" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("��ǰ�������ڼ���" + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("��ǰ���������ǵڼ��죺" + c.get(Calendar.DAY_OF_YEAR));

    }

    /**
     * 
     * addDate:���ڼӼ�. <br/>
     * 
     * @author qingqian
     * @throws ParseException
     */
    public void addDate() throws ParseException {
        SimpleDateFormat sdft = new SimpleDateFormat("yyyyMMdd");
        Calendar c = Calendar.getInstance();

        System.out.println("��ǰʱ�䣺" + sdft.format(c.getTime()));
        c.add(Calendar.DATE, 1);// ����һ��
        c.add(Calendar.MONTH, 1);// ����һ��
        c.add(Calendar.YEAR, 1);// ����һ��

        System.out.println("����1��1��1�պ�" + sdft.format(c.getTime()));
        c.set(Calendar.DATE, c.get(Calendar.DATE) - 5);

        System.out.println("��ȥ5���" + sdft.format(c.getTime()));

        c.set(Calendar.DATE, c.get(Calendar.DATE) + 23);
        System.out.println("������23�죺" + sdft.format(c.getTime()));

    }

    public void compareDate(String d1, String d2) throws ParseException {
        Date date1 = sdf.parse(d1);
        Date date2 = sdf.parse(d2);
        int num = date1.compareTo(date2);
        if (num > 0) {
            System.out.println(d1 + "����" + d2);
        } else {
            System.out.println(d1 + "С��" + d2);
        }

        boolean flaga = date1.after(date2);
        if (flaga == true) {
            System.out.println(d1 + "����" + d2);
        } else {
            System.out.println(d1 + "С��" + d2);
        }

        boolean flagb = date1.before(date2);
        if (flagb == true) {
            System.out.println(d1 + "С��" + d2);
        } else {
            System.out.println(d1 + "����" + d2);
        }

    }

    public static void main(String[] args) throws ParseException {

        HelloWorldFour newWorld = new HelloWorldFour();
        /**
         * Date today = newWorld.printDate("20160304 115555");
         * System.out.println("�ַ���ת�������ڣ�" + today);
         * 
         * String todayStr = newWorld.printDate(new Date());
         * System.out.println("����ת�����ַ�����" + todayStr);
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
