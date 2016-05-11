/**
 * Project Name:Hello_New_World
 * File Name:SelectionSort.java
 * Package Name:pers.qingqian.study.six
 * Date:2016��5��11������3:53:07
 * Copyright (c) 2016, qingqian All Rights Reserved.
 * 
 */
package pers.qingqian.study.six;

import java.util.Random;

/**
 * ClassName:SelectionSort <br/>
 * Function: ������ <br/>
 * Reason: ѧϰ��α�д��������. <br/>
 * Date: 2016��5��11�� ����3:53:07 <br/>
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
            //һֱ�Ƚ�-ֱ���ҵ���С
            for (int j = i + 1; j < total ; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            //����Сֵ������Ƚϵ�ֵ��λ��
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
            
            System.out.format("�� %d ��:\t", i + 1);
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
        System.out.print("����ǰ:\t");
        selection.printAll(array);
        selection.sort(array);
        System.out.print("�����:\t");
        selection.printAll(array);
    }
}
