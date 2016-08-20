package pers.qingqian.study.seven;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Vector;

import com.sun.jdi.Method;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.Static;

/**
 * ClassName: OOM <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2016��7��18�� ����3:12:53 <br/>
 * 
 * @author qingqian
 * @version
 */
public class OOM {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /**
        Integer sum1 = 300000;
        Integer sum2 = 400000;
        OOM oom = new OOM();
        System.out.println("��ArrayList�м���30w����");
        oom.javaHeapSpace(sum1);
        oom.memoryTotal();
        System.out.println("��ArrayList�м���40w����");
        oom.javaHeapSpace(sum2);
        oom.memoryTotal();
        **/
        OOM oom = new OOM();
        oom.javaMemoryLeakVector();
        oom.javaMemoryLeakHashSet();
        System.out.println("JVM MAX MEMORY: " + Runtime.getRuntime().maxMemory()/1024/1024+"M");
        System.out.println("JVM IS USING MEMORY:" + Runtime.getRuntime().totalMemory()/1024/1024+"M");
        System.out.println("JVM IS FREE MEMORY:" + Runtime.getRuntime().freeMemory()/1024/1024+"M");
        oom.MethodAreaOOM();
        
       
    }

    public void javaHeapSpace(Integer sum) {
        Random random = new Random();

        ArrayList openList = new ArrayList();
        for (int i = 0; i < sum; i++) {
            String charOrNum = String.valueOf(random.nextInt(10));
            openList.add(charOrNum);
        }
    }

    public void memoryTotal() {
        Runtime run = Runtime.getRuntime();
        long max = run.maxMemory();
        long total = run.totalMemory();
        long free = run.freeMemory();
        long usable = max - total + free;
        System.out.println("����ڴ� = " + max);
        System.out.println("�ѷ����ڴ� = " + total);
        System.out.println("�ѷ����ڴ��е�ʣ��ռ� = " + free);
        System.out.println("�������ڴ� = " + usable);
    }

    public void javaMemoryLeakVector() {
        Vector v = new Vector(10);
        for (int i = 1; i < 100; i++) {
            Object o = new Object();
            v.add(o);
            o = null;
        }
    }

    public static void javaMemoryLeakHashSet() {
         Set<Person> set = new HashSet<Person>();
        Person p1 = new Person("��", "123", 16);
        Person p2 = new Person("��", "456", 17);
        Person p3 = new Person("��", "789", 17);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println("�ܹ���:" + set.size() + " ��Ԫ��!"); // ������ܹ���:3 ��Ԫ��!
        for (Person person : set) {
            System.out.println(person);
        }
        
        p3.setAge(222);
        p3.setName("����");
        set.remove(p3); // ��ʱremove����������ڴ�й©
        System.out.println("�ܹ���:" + set.size() + " ��Ԫ��!"); // ������ܹ���:4 ��Ԫ��!
        set.add(p3); // ������ӣ���Ȼ��ӳɹ�
        System.out.println("�ܹ���:" + set.size() + " ��Ԫ��!"); // ������ܹ���:4 ��Ԫ��!
        for (Person person : set) {
            System.out.println(person.getName());
            System.out.println(person);
        }
    }
    
 
        public void MethodAreaOOM() {  
            while(true){  
                Enhancer eh = new Enhancer();  
                eh.setSuperclass(OOM.class);  
                eh.setUseCache(false);  
                eh.setCallback(OOM.class);  
                eh.create();  
            }  
    } 

}
