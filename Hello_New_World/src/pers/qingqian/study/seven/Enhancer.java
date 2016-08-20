/** 
 * Project Name:Hello_New_World 
 * File Name:Enhancer.java 
 * Package Name:pers.qingqian.study.seven 
 * Date:2016年7月18日下午8:07:45 
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved. 
 * 
 */  
package pers.qingqian.study.seven;

import java.util.ArrayList;

/** 
 * ClassName:Enhancer <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016年7月18日 下午8:07:45 <br/> 
 * @author   lixr 
 * @version   
 * @see       
 */
public class Enhancer {
    private Object Superclass;
    private boolean UseCache;
    private Object Callback;
    public Object getSuperclass() {
        return Superclass;
    }
    public void setSuperclass(Object superclass) {
        Superclass = superclass;
    }
    public boolean isUseCache() {
        return UseCache;
    }
    public void setUseCache(boolean useCache) {
        UseCache = useCache;
    }
    public Object getCallback() {
        return Callback;
    }
    public void setCallback(Object callback) {
        Callback = callback;
    }
    
    public void create (){
        ArrayList arrayList = new ArrayList();
        while(true){  
            OOM oom = new OOM();
            Person person = new Person("11", "11", 12);
            ArrayList arrayList2 = new ArrayList();
            arrayList.add(person);
            arrayList.add(oom);
            arrayList2.add(person);
            arrayList2.add(oom);
            person = null;
            oom = null;
        }  
    }

}
 
