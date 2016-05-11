/**
 * Project Name:Hello_New_World
 * File Name:SelectionSort.java
 * Package Name:pers.qingqian.study.six
 * Date:2016年5月11日下午3:53:07
 * Copyright (c) 2016, qingqian All Rights Reserved.
 * 
 */
package pers.qingqian.study.six;

import java.util.Random;

/**
 * ClassName:SelectionSort <br/>
 * Function: 简单排序 <br/>
 * Reason: 学习如何编写简单排序功能. <br/>
 * Date: 2016年5月11日 下午3:53:07 <br/>
 * 
 * @author qingqian
 * @version
 * @see
 */
public class SelectionSort {

    public void sort(int[] array) {
        int index;
        int total = array.length;
        int temp;
        for (int i = 0; i < total; i++) {
            index = i;
            //一直比较-直到找到最小
            for (int j = i + 1; j < total ; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            //将最小值和最初比较的值换位置
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
            
            System.out.format("第 %d 趟:\t", i + 1);
            printAll(array);
        }
    }

    public void printAll(int[] array) {
        for (int value : array) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int total = 10;
        int[] array = new int[total];
        Random random = new Random();
        for (int i = 0; i < total; i++) {
            array[i] = random.nextInt(total);
        }
        SelectionSort selection = new SelectionSort();
        System.out.print("排序前:\t");
        selection.printAll(array);
        selection.sort(array);
        System.out.print("排序后:\t");
        selection.printAll(array);
    }
}
