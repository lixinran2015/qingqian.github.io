/**
 * Project Name:Hello_New_World
 * File Name:Logic.java
 * Package Name:pers.qingqian.study.basic
 * Date:2016年1月31日下午3:07:24
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved.
 * 
 */
/**
 * Project Name:Hello_New_World
 * File Name:Logic.java
 * Package Name:pers.qingqian.study.basic
 * Date:2016年1月31日下午3:07:24
 * Copyright (c) 2016, chances.com.cn All Rights Reserved.
 * 
 */
package pers.qingqian.study.three;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * ClassName:Logic <br/>
 * Function: 逻辑处理. <br/>
 * Date: 2016年1月31日 下午3:07:24 <br/>
 * 
 * @author qingqian
 * @version
 * @see
 */
public class Logic {

    public String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat",
                    "Sun" };

    public static void main(String[] args) {
        int week = 0;
        Logic logic = new Logic();
        logic.printWeek(2);
        logic.printWeek(3);
        logic.printWeek(6);
        try {
            week = logic.dayForWeek("2016-01-31");
            System.out.println("今天星期" + week);
            week = logic.dayForWeek("2016-02-01");
            System.out.println("今天星期" + week);
            week = logic.dayForWeek("eee");
        }
        catch (Exception e) {
            System.out.println("日期格式不对");
            e.printStackTrace();

        }finally{
            System.out.println("始终都会执行的语句");
        }
        logic.printForWeek(6);
        logic.printForWeek(8);
        logic.printForWeekWhile();
        logic.printForWeekDo();
        logic.printFowWeekS();
    }

    /**
     * printWeek:判断今天是周几，要不要上班. <br/>
     * 
     * @author qingqian
     * @param day
     */
    public void printWeek(int day) {
        int i = 0;
        i = day % 7;
        if (i < 6) {
            System.out.println("今天是：" + week[i] + ",是个工作日");
        } else {
            System.out.println("今天是：" + week[i] + ",是个休息日");
        }
    }

    public int dayForWeek(String pTime) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(format.parse(pTime));
        int dayForWeek = 0;
        if (c.get(Calendar.DAY_OF_WEEK) == 1) {
            dayForWeek = 7;
        } else {
            dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        }
        return dayForWeek;
    }

    public void printForWeek(int day) {

        switch (day) {
        case 1:
            System.out.println("printForWeek今天是：" + week[0] + ",是个工作日");
            break;
        case 2:
            System.out.println("printForWeek今天是：" + week[1] + ",是个工作日");
            break;
        case 3:
            System.out.println("printForWeek今天是：" + week[2] + ",是个工作日");
            break;
        case 4:
            System.out.println("printForWeek今天是：" + week[3] + ",是个工作日");
            break;
        case 5:
            System.out.println("printForWeek今天是：" + week[4] + ",是个工作日");
            break;
        case 6:
            System.out.println("printForWeek今天是：" + week[5] + ",是个休息日");
            break;
        case 7:
            System.out.println("printForWeek今天是：" + week[6] + ",是个休息日");
            break;
        default:
            System.out.println("printForWeek请输入1-7的数字");
        }
    }

    public void printForWeekWhile() {
        int i = 0;
        while (i < week.length) {
            System.out.println("printForWeekWhile今天是：" + week[i] + "");
            i++;
        }
    }

    public void printForWeekDo() {
        int i = week.length;
        do {
            System.out.println("printForWeekDo今天是：" + week[i - 1] + "");
            i--;
        }
        while (i > 0);
    }

    public void printFowWeekS() {
        String weeks[][] = {{"Mon","1","星期一"},
                        {"Tue","2","星期二"},
                        {"Wed","3","星期三"}, 
                        {"Thu","4","星期四"},
                        {"Fri","5","星期五"},
                        {"Sat","6","星期六"},
                        {"Sun","7","星期日"}};
        for (int i = 0; i < weeks.length; i++) {
            System.out.println("printFowWeekS数组：" + i);
            for (int j = 0; j < weeks[i].length; j++) {
                System.out.print(" " + weeks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
