/** 
 * Project Name:QATools 
 * File Name:MyImageIcon.java 
 * Package Name:chances.qa.commons 
 * Date:2016��7��16������7:23:46 
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved. 
 * 
 */  
package chances.qa.commons;

import java.awt.Container;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MyImageIcon extends JFrame {

    public MyImageIcon() {
        Container container = getContentPane();
        // ����һ����ǩ
        JLabel jl = new JLabel("����һ��JFrame����", JLabel.CENTER);
        // ��ȡͼƬ���ڵ�URL
        URL url = MyImageIcon.class.getResource("bac.jpg");
        Icon icon = new ImageIcon(url); // ʵ����Icon����
        jl.setIcon(icon); // Ϊ��ǩ����ͼƬ
        // �������ַ����ڱ�ǩ�м�
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jl.setOpaque(true); // ���ñ�ǩΪ��͸��״̬
        container.add(jl); // ����ǩ��ӵ�������
        setSize(250, 100); // ���ô����С
        setVisible(true); // ʹ����ɼ�
        // ���ô���ر�ģʽ
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public static void main(String args[]) {
        new MyImageIcon(); // ʵ����MyImageIcon����
    }


}
 
