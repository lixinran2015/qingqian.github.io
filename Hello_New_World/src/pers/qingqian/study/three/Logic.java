/**
 * Project Name:Hello_New_World
 * File Name:Logic.java
 * Package Name:pers.qingqian.study.basic
 * Date:2016��1��31������3:07:24
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved.
 * 
 */
/**
 * Project Name:Hello_New_World
 * File Name:Logic.java
 * Package Name:pers.qingqian.study.basic
 * Date:2016��1��31������3:07:24
 * Copyright (c) 2016, chances.com.cn All Rights Reserved.
 * 
 */
package pers.qingqian.study.three;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * ClassName:Logic <br/>
 * Function: �߼�����. <br/>
 * Date: 2016��1��31�� ����3:07:24 <br/>
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
            System.out.println("��������" + week);
            week = logic.dayForWeek("2016-02-01");
            System.out.println("��������" + week);
            week = logic.dayForWeek("eee");
        }
        catch (Exception e) {
            System.out.println("���ڸ�ʽ����");
            e.printStackTrace();

        }finally{
            System.out.println("ʼ�ն���ִ�е����");
        }
        logic.printForWeek(6);
        logic.printForWeek(8);
        logic.printForWeekWhile();
        logic.printForWeekDo();
        logic.printFowWeekS();
    }

    /**
     * printWeek:�жϽ������ܼ���Ҫ��Ҫ�ϰ�. <br/>
     * 
     * @author qingqian
     * @param day
     */
    public void printWeek(int day) {
        int i = 0;
        i = day % 7;
        if (i < 6) {
            System.out.println("�����ǣ�" + week[i] + ",�Ǹ�������");
        } else {
            System.out.println("�����ǣ�" + week[i] + ",�Ǹ���Ϣ��");
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
            System.out.println("printForWeek�����ǣ�" + week[0] + ",�Ǹ�������");
            break;
        case 2:
            System.out.println("printForWeek�����ǣ�" + week[1] + ",�Ǹ�������");
            break;
        case 3:
            System.out.println("printForWeek�����ǣ�" + week[2] + ",�Ǹ�������");
            break;
        case 4:
            System.out.println("printForWeek�����ǣ�" + week[3] + ",�Ǹ�������");
            break;
        case 5:
            System.out.println("printForWeek�����ǣ�" + week[4] + ",�Ǹ�������");
            break;
        case 6:
            System.out.println("printForWeek�����ǣ�" + week[5] + ",�Ǹ���Ϣ��");
            break;
        case 7:
            System.out.println("printForWeek�����ǣ�" + week[6] + ",�Ǹ���Ϣ��");
            break;
        default:
            System.out.println("printForWeek������1-7������");
        }
    }

    public void printForWeekWhile() {
        int i = 0;
        while (i < week.length) {
            System.out.println("printForWeekWhile�����ǣ�" + week[i] + "");
            i++;
        }
    }

    public void printForWeekDo() {
        int i = week.length;
        do {
            System.out.println("printForWeekDo�����ǣ�" + week[i - 1] + "");
            i--;
        }
        while (i > 0);
    }

    public void printFowWeekS() {
        String weeks[][] = {{"Mon","1","����һ"},
                        {"Tue","2","���ڶ�"},
                        {"Wed","3","������"}, 
                        {"Thu","4","������"},
                        {"Fri","5","������"},
                        {"Sat","6","������"},
                        {"Sun","7","������"}};
        for (int i = 0; i < weeks.length; i++) {
            System.out.println("printFowWeekS���飺" + i);
            for (int j = 0; j < weeks[i].length; j++) {
                System.out.print(" " + weeks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
