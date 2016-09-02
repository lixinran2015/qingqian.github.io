/** 
 * Project Name:Hello_New_World 
 * File Name:TestMap.java 
 * Package Name:pers.qingqian.study.eight 
 * Date:2016年8月22日下午1:22:23 
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved. 
 * 
 */  
package pers.qingqian.study.eight;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/** 
 * ClassName:TestMap <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016年8月22日 下午1:22:23 <br/> 
 * @author   lixr   
 * @version   
 * @see       
 */
public class TestMap {
    
    Map<String,String> obj = null;
    String value = null;
    
    public void chashmap(){
        obj = new ConcurrentHashMap<String,String>();
        for(int i=0;i < 999;i++){
          obj.put("key_"+i,"value_"+i);
      }
    }

    public void hashmap(){
        obj = new HashMap<String,String>();
        for(int i=0;i < 999;i++){
          obj.put("key_"+i,"value_"+i);
      }
    }
   public String getKey(String key){
       if(key !=null){
           value = obj.get(key);
       }
       return value;
   }
   
   public static void main(String[] args) throws ParseException {

       TestMap testMap = new  TestMap();
       testMap.chashmap();
       int sum=10000000;
       System.out.println(System.currentTimeMillis());
       for(int i=0;i < sum;i++){
           String keys = "key_" + i%999;
           testMap.getKey(keys);
         //  String values=testMap.getKey(keys);
         //  System.out.println(keys +"="+ values);
       }
       System.out.println(System.currentTimeMillis());
       
       testMap.hashmap();
       System.out.println(System.currentTimeMillis());
       for(int i=0;i < sum;i++){
           String keys = "key_" + i%999;
           testMap.getKey(keys);
         //  String values=testMap.getKey(keys);
         //  System.out.println(keys +"="+ values);
       }
       System.out.println(System.currentTimeMillis());
       
   }
    
}
 
