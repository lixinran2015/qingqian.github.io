package pers.qingqian.study.six;  

import java.util.Random;
/** 
 * ClassName:SelectionSort <br/> 
 * Function: ������ <br/> 
 * Date:     2016��5��11�� ����1:52:19 <br/> 
 * @author   qingqian 
 * @version   
 * @see       
 */
public class SelectionSort {
 
    public void selectionSort(int[] list) {
        // ��Ҫ���������Сֵ�Ĵ���
        // Ҫע��һ�㣬��Ҫ���� N �������Ѿ����� N-1 �α������Ѿ�����������
        for (int i = 0; i < list.length - 1; i++) {
            int temp = 0;
            int index = i; // ����������Сֵ������
 
            // Ѱ�ҵ�i��С����ֵ,һ�ֲ���һ����С��
            for (int j = i + 1; j < list.length; j++) {
                if (list[index] > list[j]) {
                    index = j;
                }
            }
 
            // ��С��ֵ��i,��ԭ���ֵ��index,һ��ֻ��һ��С��
            temp = list[index];
            list[index] = list[i];
            list[i] = temp;
 
            System.out.format("�� %d ��:\t", i + 1);
            printAll(list);
        }
    }
 
    // ��ӡ��������
    public void printAll(int[] list) {
        for (int value : list) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }
 
    /** 
     * main:(������һ�仰�����������������). <br/> 
     * 
     * @author qingqian 
     * @param args 
     */
    public static void main(String[] args) {
        // ��ʼ��һ���������
        final int MAX_SIZE = 10;
        int[] array = new int[MAX_SIZE];
        Random random = new Random();
        for (int i = 0; i < MAX_SIZE; i++) {
            array[i] = random.nextInt(MAX_SIZE);
        }
 
        // ����ð�����򷽷�
        SelectionSort selection = new SelectionSort();
        System.out.print("����ǰ:\t");
        selection.printAll(array);
        selection.selectionSort(array);
        System.out.print("�����:\t");
        selection.printAll(array);
    }
 
}
