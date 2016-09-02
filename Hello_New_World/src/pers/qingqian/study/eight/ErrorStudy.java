/**
 * Project Name:Hello_New_World
 * File Name:ErrorStudy.java
 * Package Name:pers.qingqian.study.eight
 * Date:2016年9月1日下午12:23:12
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved.
 * 
 */
package pers.qingqian.study.eight;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.sampled.Line;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * ClassName:ErrorStudy <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2016年9月1日 下午12:23:12 <br/>
 * 
 * @author lixr
 * @version
 * @see
 */
public class ErrorStudy {

    public void arrayStudy() {
        int max_len = 4;
        // int[] array = new int[max_len];
        int[] array = new int[] {1, 2, 3, 4 };
        for (int i = 0; i <= max_len; i++) {
            array[i] = i;
        }
    }

    public static void main(String[] args) throws ParseException {
        ErrorStudy errorStudy = new ErrorStudy();
        errorStudy.arrayStudy();
    }

    public void printLines(String fName, Line lines) {
        PrintWriter pstr = null;
        try {
            File file = new File(fName);
            pstr = new PrintWriter(new BufferedOutputStream(
                            new FileOutputStream(file)));
            Iterator it = lines.iterator();
            while (it.hasNext()) {
                String line = (String) it.next();
                pstr.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            pstr.close();
        }
    }

    public void f() throws FileNotFoundException, IOException {
        FileOutputStream e = null;
        try {
            e = new FileOutputStream("C:\test.java");
            e.write(20);
            e.close();
        }
        finally {}// Defect
    }
    
    
}
