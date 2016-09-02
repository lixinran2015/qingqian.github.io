/** 
 * Project Name:Hello_New_World 
 * File Name:Singleton.java 
 * Package Name:pers.qingqian.study.eight 
 * Date:2016年9月1日下午8:38:14 
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved. 
 * 
 */  
package pers.qingqian.study.eight;

import java.util.List;

/** 
 * ClassName:Singleton <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016年9月1日 下午8:38:14 <br/> 
 * @author   lixr 
 * @version   
 * @see       
 */
public class Singleton {
    
    public static Singleton instance = null;
    
    public static Singleton getInstance(){
        if ( instance == null ){
            synchronized (Singleton.class) {
                if ( instance == null )
                    instance = new Singleton();
                
            }
            
        }
        return instance;
    }

}
 
