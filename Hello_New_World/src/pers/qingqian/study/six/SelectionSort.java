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

    public void bubble_sort(int[] array) {
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
    
    
    public int partition(int[] array, int min, int max)
    {
        int pivot = array[min];
        while (min < max)
        {
            while (min < max && array[max] > pivot) max--;
            array[min] = array[max];
            while (min < max && array[min] <= pivot) min++;
            array[max] = array[min];
        }
        array[min] = pivot;
        printAll(array);
        return min;
    }

    public void quick_sort(int[] array, int min, int max)
    {
        int loc = 0;
        if (min < max)
        {
            loc = partition(array, min, max);
            quick_sort(array, min, loc - 1);
            quick_sort(array, loc + 1, max);
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
      //  selection.bubble_sort(array);
        selection.quick_sort(array, 0, array.length-1);
        System.out.print("排序后:\t");
        selection.printAll(array);
        
        
        
    }
}
