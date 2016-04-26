/** 
 * Project Name:Hello_New_World 
 * File Name:HbaseDB.java 
 * Package Name:pers.qingqian.study.hadoop 
 * Date:2016年1月31日下午8:38:29 
 * Copyright (c) 2016, chanes.com.cn All Rights Reserved. 
 * 
 */  
package pers.qingqian.study.hadoop;  
/** 
 * ClassName:HbaseDB <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016年1月31日 下午8:38:29 <br/> 
 * @author   lixr 
 * @version   
 * @see       
 */

import java.io.IOException;  
import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.Date;  
import java.util.HashSet;  
import java.util.List;  
import java.util.Set;  
 
import org.apache.hadoop.conf.Configuration;  
import org.apache.hadoop.hbase.Cell;  
import org.apache.hadoop.hbase.CellUtil;  
import org.apache.hadoop.hbase.HBaseConfiguration;  
import org.apache.hadoop.hbase.HColumnDescriptor;  
import org.apache.hadoop.hbase.HTableDescriptor;  
import org.apache.hadoop.hbase.TableName;  
import org.apache.hadoop.hbase.client.Delete;  
import org.apache.hadoop.hbase.client.Get;  
import org.apache.hadoop.hbase.client.HBaseAdmin;  
import org.apache.hadoop.hbase.client.HConnection;  
import org.apache.hadoop.hbase.client.HConnectionManager;  
import org.apache.hadoop.hbase.client.HTable;  
import org.apache.hadoop.hbase.client.Put;  
import org.apache.hadoop.hbase.client.Result;  
import org.apache.hadoop.hbase.client.ResultScanner;  
import org.apache.hadoop.hbase.client.Scan;  
import org.apache.hadoop.hbase.filter.BinaryComparator;  
import org.apache.hadoop.hbase.filter.CompareFilter.CompareOp;  
import org.apache.hadoop.hbase.filter.Filter;  
import org.apache.hadoop.hbase.filter.QualifierFilter;  
import org.apache.hadoop.hbase.filter.SubstringComparator;  
import org.apache.hadoop.hbase.util.Bytes;  
 
import com.weirq.util.DateUtil;  
import com.weirq.util.SiteUrl;  
import com.weirq.vo.FileSystemVo;  
import com.weirq.vo.Menu;  
import com.weirq.vo.ShareVo;  
import com.weirq.vo.bookVo;  
  
public class HbaseDB  implements Serializable{  
45.    private static final long serialVersionUID = -7137236230164276653L;  
46.    static HConnection connection;  
47.      
48.    private static class HbaseDBInstance{  
49.        private static final HbaseDB instance = new HbaseDB();  
50.    }  
51.    public static HbaseDB getInstance() {  
52.        return HbaseDBInstance.instance;  
53.    }  
54.    private HbaseDB() {  
55.        Configuration conf = HBaseConfiguration.create();  
56.        conf.set("hbase.zookeeper.quorum", SiteUrl.readUrl("host"));  
57.        try {  
58.            connection = HConnectionManager.createConnection(conf);  
59.        } catch (IOException e) {  
60.            e.printStackTrace();  
61.        }  
62.    }  
63.      
64.    private Object readResolve(){  
65.        return getInstance();  
66.    }  
67.    /** 
68.     * 获取所有表 
69.     * @return 
70.     * @throws Exception 
71.     */  
72.    public static TableName[] listTable() throws Exception {  
73.        HBaseAdmin admin = new HBaseAdmin(connection);  
74.        TableName[] tableNames = admin.listTableNames();  
75.        admin.close();  
76.        return tableNames;  
77.    }  
78.    /** 
79.     * 删除所有表 
80.     */  
81.    public static void deleteAllTable() throws Exception{  
82.        HBaseAdmin admin = new HBaseAdmin(connection);  
83.        TableName[] tableNames = admin.listTableNames();  
84.        for (int i = 0; i < tableNames.length; i++) {  
85.            admin.disableTable(tableNames[i].getNameAsString());  
86.            admin.deleteTable(tableNames[i].getNameAsString());  
87.        }  
88.        admin.close();  
89.    }  
90.    /** 
91.     * 创建表 
92.     * @param tableName 
93.     * @param fams 
94.     * @throws Exception 
95.     */  
96.    public static void createTable(String tableName,String[] fams,int version) throws Exception {  
97.        HBaseAdmin admin = new HBaseAdmin(connection);  
98.        if (admin.tableExists(tableName)) {  
99.            admin.disableTable(tableName);  
100.            admin.deleteTable(tableName);  
101.        }  
102.        HTableDescriptor tableDescriptor = null;  
103.        HColumnDescriptor hd = null;  
104.        for (int i = 0; i < fams.length; i++) {  
105.            tableDescriptor = new HTableDescriptor(TableName.valueOf(tableName));  
106.            hd = new HColumnDescriptor(fams[i]);  
107.            hd.setMaxVersions(version);  
108.            tableDescriptor.addFamily(hd);  
109.            admin.createTable(tableDescriptor);  
110.        }  
111.        admin.close();  
112.    }  
113.    public static void delTable(String tableName) throws Exception {  
114.        HBaseAdmin admin = new HBaseAdmin(connection);  
115.        if (admin.tableExists(tableName)) {  
116.            admin.disableTable(tableName);  
117.            admin.deleteTable(tableName);  
118.        }  
119.        admin.close();  
120.    }  
121.      
122.    public static long getGid(String row) throws Exception {  
123.        HTable table_gid = new HTable(TableName.valueOf("gid"), connection);  
124.        long id = table_gid.incrementColumnValue(Bytes.toBytes(row), Bytes.toBytes("gid"), Bytes.toBytes(row), 1);  
125.        table_gid.close();  
126.        return id;  
127.    }  
128.      
129.    /** 
130.     * 添加数据 
131.     * @param tableName 
132.     * @param rowKey 
133.     * @param family 
134.     * @param qualifier 
135.     * @param value 
136.     * @throws IOException 
137.     */  
138.    public static void add(String tableName, String rowKey, String family, String qualifier, String value) throws IOException {  
139.        //连接到table  
140.        HTable table = new HTable(TableName.valueOf(tableName), connection);  
141.        Put put = new Put(Bytes.toBytes(rowKey));  
142.        put.add(Bytes.toBytes(family), Bytes.toBytes(qualifier), Bytes.toBytes(value));  
143.        table.put(put);  
144.        table.close();  
145.    }  
146.    /** 
147.     * 添加数据 
148.     * @param tableName 
149.     * @param rowKey 
150.     * @param family 
151.     * @param qualifier 
152.     * @param value 
153.     * @throws IOException 
154.     */  
155.    public static void add(String tableName, Long rowKey, String family, Long qualifier, String value) throws IOException {  
156.        //连接到table  
157.        HTable table = new HTable(TableName.valueOf(tableName), connection);  
158.        Put put = new Put(Bytes.toBytes(rowKey));  
159.        put.add(Bytes.toBytes(family), Bytes.toBytes(qualifier), Bytes.toBytes(value));  
160.        table.put(put);  
161.        table.close();  
162.    }  
163.    /** 
164.     * 添加数据 
165.     * @param tableName 
166.     * @param rowKey 
167.     * @param family 
168.     * @param qualifier 
169.     * @param value 
170.     * @throws IOException 
171.     */  
172.    public static void add(String tableName, Long rowKey01,Long rowKey02, String family, String qualifier, Long value) throws IOException {  
173.        //连接到table  
174.        HTable table = new HTable(TableName.valueOf(tableName), connection);  
175.        Put put = new Put(Bytes.add(Bytes.toBytes(rowKey01), Bytes.toBytes(rowKey02)));  
176.        if (qualifier!=null) {  
177.            put.add(Bytes.toBytes(family), Bytes.toBytes(qualifier), Bytes.toBytes(value));  
178.        }else{  
179.            put.add(Bytes.toBytes(family), null, Bytes.toBytes(value));  
180.        }  
181.        table.put(put);  
182.        table.close();  
183.    }  
184.    /** 
185.     * 添加数据 
186.     * @param tableName 
187.     * @param rowKey 
188.     * @param family 
189.     * @param qualifier 
190.     * @param value 
191.     * @throws IOException 
192.     */  
193.    public static void add(String tableName, Long rowKey01,Long rowKey02,Long rowKey03, String family, String qualifier, Long value01, Long value02) throws IOException {  
194.        //连接到table  
195.        HTable table = new HTable(TableName.valueOf(tableName), connection);  
196.        Put put = new Put(Bytes.add(Bytes.toBytes(rowKey01), Bytes.toBytes(rowKey02), Bytes.toBytes(rowKey03)));  
197.        if (qualifier!=null) {  
198.            put.add(Bytes.toBytes(family), Bytes.toBytes(qualifier), Bytes.add(Bytes.toBytes(value01), Bytes.toBytes(value02)));  
199.        }else{  
200.            put.add(Bytes.toBytes(family), null, Bytes.add(Bytes.toBytes(value01), Bytes.toBytes(value02)));  
201.        }  
202.        table.put(put);  
203.        table.close();  
204.    }  
205.    /** 
206.     * 添加数据 
207.     * @param tableName 
208.     * @param rowKey 
209.     * @param family 
210.     * @param qualifier 
211.     * @param value 
212.     * @throws IOException 
213.     */  
214.    public static void add(String tableName, Long rowKey01,Long rowKey02, String family, String qualifier, String value) throws IOException {  
215.        //连接到table  
216.        HTable table = new HTable(TableName.valueOf(tableName), connection);  
217.        Put put = new Put(Bytes.add(Bytes.toBytes(rowKey01), Bytes.toBytes(rowKey02)));  
218.        if (qualifier!=null) {  
219.            put.add(Bytes.toBytes(family), Bytes.toBytes(qualifier), Bytes.toBytes(value));  
220.        }else{  
221.            put.add(Bytes.toBytes(family), null, Bytes.toBytes(value));  
222.        }  
223.        table.put(put);  
224.        table.close();  
225.    }  
226.    /** 
227.     * 添加数据 
228.     * @param tableName 
229.     * @param rowKey 
230.     * @param family 
231.     * @param qualifier 
232.     * @param value 
233.     * @throws IOException 
234.     */  
235.    public static void add(String tableName, Long rowKey, String family, String qualifier, String value) throws IOException {  
236.        //连接到table  
237.        HTable table = new HTable(TableName.valueOf(tableName), connection);  
238.        Put put = new Put(Bytes.toBytes(rowKey));  
239.        put.add(Bytes.toBytes(family), Bytes.toBytes(qualifier), Bytes.toBytes(value));  
240.        table.put(put);  
241.        table.close();  
242.    }  
243.    /** 
244.     * 添加数据 
245.     * @param tableName 
246.     * @param rowKey 
247.     * @param family 
248.     * @param qualifier 
249.     * @param value 
250.     * @throws IOException 
251.     */  
252.    public static void add(String tableName, Long rowKey, String family, String qualifier, Long value) throws IOException {  
253.        //连接到table  
254.        HTable table = new HTable(TableName.valueOf(tableName), connection);  
255.        Put put = new Put(Bytes.toBytes(rowKey));  
256.        put.add(Bytes.toBytes(family), Bytes.toBytes(qualifier), Bytes.toBytes(value));  
257.        table.put(put);  
258.        table.close();  
259.    }  
260.    /** 
261.     * 添加数据 
262.     * @param tableName 
263.     * @param rowKey 
264.     * @param family 
265.     * @param qualifier 
266.     * @param value 
267.     * @throws IOException 
268.     */  
269.    public static void add(String tableName, String rowKey, String family, String qualifier, Long value) throws IOException {  
270.        //连接到table  
271.        HTable table = new HTable(TableName.valueOf(tableName), connection);  
272.        Put put = new Put(Bytes.toBytes(rowKey));  
273.        put.add(Bytes.toBytes(family), Bytes.toBytes(qualifier), Bytes.toBytes(value));  
274.        table.put(put);  
275.        table.close();  
276.    }  
277.    /** 
278.     * 根据row删除数据 
279.     * @param tableName 
280.     * @param rowKey 
281.     * @throws Exception 
282.     */  
283.    public static void deleteRow(String tableName, String[] rowKey) throws Exception {  
284.        HTable table = new HTable(TableName.valueOf(tableName), connection);  
285.        List<Delete> list = new ArrayList<Delete>();  
286.        for (int i = 0; i < rowKey.length; i++) {  
287.            Delete delete = new Delete(Bytes.toBytes(Long.valueOf(rowKey[i])));  
288.            list.add(delete);  
289.        }  
290.        table.delete(list);  
291.        table.close();  
292.    }  
293.      
294.    public static void deleteColumns(String tableName,Long rowKey,String family, Long qualifier) throws Exception {  
295.        HTable table = new HTable(TableName.valueOf(tableName), connection);  
296.        Delete delete = new Delete(Bytes.toBytes(rowKey));  
297.        delete.deleteColumns(Bytes.toBytes(family), Bytes.toBytes(qualifier));  
298.        table.delete(delete);  
299.        table.close();  
300.    }  
301.    public static void deleteRow(String tableName,Long rowKey01,Long rowKey02) throws Exception {  
302.        HTable table = new HTable(TableName.valueOf(tableName), connection);  
303.        Delete delete = new Delete(Bytes.add(Bytes.toBytes(rowKey01), Bytes.toBytes(rowKey02)));  
304.        table.delete(delete);  
305.        table.close();  
306.    }  
307.      
308.    public static long getIdByUsername(String name) {  
309.        long id = 0;  
310.        try {  
311.            HTable table = new HTable(TableName.valueOf("user_id"), connection);  
312.            Get get = new Get(Bytes.toBytes(name));  
313.            get.addColumn(Bytes.toBytes("id"), Bytes.toBytes("id"));  
314.            Result rs = table.get(get);  
315.            byte[] value = rs.getValue(Bytes.toBytes("id"), Bytes.toBytes("id"));  
316.            id = Bytes.toLong(value);  
317.            table.close();  
318.        } catch (IOException e) {  
319.            e.printStackTrace();  
320.            return id;  
321.        }  
322.        return id;  
323.    }  
324.    public boolean checkUsername(String name) {  
325.        try {  
326.            HTable table = new HTable(TableName.valueOf("user_id"), connection);  
327.            Get get = new Get(Bytes.toBytes(name));  
328.            table.exists(get);  
329.            if (table.exists(get)) {  
330.                table.close();  
331.                return true;  
332.            }else{  
333.                table.close();  
334.                return false;  
335.            }  
336.        } catch (IOException e) {  
337.            e.printStackTrace();  
338.            return false;  
339.        }  
340.    }  
341.      
342.    public static String getUserNameById(long id) {  
343.        String name = null;  
344.        try {  
345.            HTable table = new HTable(TableName.valueOf("id_user"), connection);  
346.            Get get = new Get(Bytes.toBytes(id));  
347.            get.addColumn(Bytes.toBytes("user"), Bytes.toBytes("name"));  
348.            Result rs = table.get(get);  
349.            byte[] value = rs.getValue(Bytes.toBytes("user"), Bytes.toBytes("name"));  
350.            name = Bytes.toString(value);  
351.            table.close();  
352.        } catch (IOException e) {  
353.            e.printStackTrace();  
354.            return null;  
355.        }  
356.        return name;  
357.    }  
358.    public static String getStringById(String tableName,Long rowKey,String family,String qualifier) {  
359.        String name = null;  
360.        try {  
361.            HTable table = new HTable(TableName.valueOf(tableName), connection);  
362.            Get get = new Get(Bytes.toBytes(rowKey));  
363.            get.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier));  
364.            Result rs = table.get(get);  
365.            byte[] value = rs.getValue(Bytes.toBytes(family), Bytes.toBytes(qualifier));  
366.            name = Bytes.toString(value);  
367.            table.close();  
368.        } catch (IOException e) {  
369.            e.printStackTrace();  
370.            return null;  
371.        }  
372.        return name;  
373.    }  
374.    /** 
375.     * 通过目录名获取ID 
376.     * @param name 
377.     * @return 
378.     */  
379.    public static long getIdByDirName(String name) {  
380.        long id = 0;  
381.        try {  
382.            HTable table = new HTable(TableName.valueOf("hdfs_name"), connection);  
383.            Get get = new Get(name.getBytes());  
384.            get.addColumn(Bytes.toBytes("id"), Bytes.toBytes("id"));  
385.            Result rs = table.get(get);  
386.            byte[] value = rs.getValue(Bytes.toBytes("id"), Bytes.toBytes("id"));  
387.            id = Bytes.toLong(value);  
388.            table.close();  
389.        } catch (IOException e) {  
390.            e.printStackTrace();  
391.            return id;  
392.        }  
393.        return id;  
394.    }  
395.      
396.    public static boolean checkEmail(String email) throws Exception {  
397.        HTable table = new HTable(TableName.valueOf("email_user"), connection);  
398.        Get get = new Get(Bytes.toBytes(email));  
399.        get.addColumn(Bytes.toBytes("user"), Bytes.toBytes("userid"));  
400.        Result rs = table.get(get);  
401.        byte[] value = rs.getValue(Bytes.toBytes("user"), Bytes.toBytes("userid"));  
402.        table.close();  
403.        if(value!=null){  
404.            return true;  
405.        }else {  
406.            return false;  
407.        }  
408.    }  
409.      
410.    public long checkUser(String userName,String pwd) throws Exception {  
411.        long id = getIdByUsername(userName);  
412.        if (id==0) {  
413.            return 0;  
414.        }  
415.        HTable table = new HTable(TableName.valueOf("id_user"), connection);  
416.        Get get = new Get(Bytes.toBytes(id));  
417.        get.addColumn(Bytes.toBytes("user"), Bytes.toBytes("pwd"));  
418.        Result rs = table.get(get);  
419.        byte[] value = rs.getValue(Bytes.toBytes("user"), Bytes.toBytes("pwd"));  
420.        if (pwd.equals(Bytes.toString(value))) {  
421.            table.close();  
422.            return id;  
423.        }  
424.        table.close();  
425.        return 0;  
426.    }  
427.      
428.    public void queryAll(String tableName) throws Exception {  
429.        HTable table = new HTable(TableName.valueOf(tableName), connection);  
430.        ResultScanner rs = table.getScanner(new Scan());  
431.        for (Result result : rs) {  
432.            System.out.println("rowkey" +result.getRow());  
433.            for (Cell cell : result.rawCells()) {  
434.                System.out.println("family"+new String(cell.getFamilyArray()));  
435.                System.out.println("Qualifier"+new String(cell.getQualifierArray()));  
436.                System.out.println("value"+new String(cell.getValueArray()));  
437.            }  
438.        }  
439.        table.close();  
440.    }  
441.    public void queryAllHDFS(String username) throws Exception {  
442.        HTable table = new HTable(TableName.valueOf("hdfs"), connection);  
443.        ResultScanner rs = table.getScanner(new Scan());  
444.        for (Result result : rs) {  
445.            System.out.println("rowkey" +result.getRow());  
446.            for (Cell cell : result.rawCells()) {  
447.                System.out.println("family"+new String(cell.getFamilyArray()));  
448.                System.out.println("Qualifier"+new String(cell.getQualifierArray()));  
449.                System.out.println("value"+new String(cell.getValueArray()));  
450.            }  
451.        }  
452.        table.close();  
453.    }  
454.      
455.    public static List<Menu> qureyAllEmun() throws Exception {  
456.        HTable table = new HTable(TableName.valueOf("emun"), connection);  
457.        ResultScanner rs = table.getScanner(new Scan());  
458.        List<Menu> menus = new ArrayList<Menu>();  
459.        Menu m = null;  
460.        for (Result r : rs) {  
461.            m = new Menu();  
462.            byte[] name = r.getValue(Bytes.toBytes("emun"), Bytes.toBytes("name"));  
463.            byte[] url = r.getValue(Bytes.toBytes("emun"), Bytes.toBytes("url"));  
464.            m.setName(Bytes.toString(name));  
465.            m.setUrl(Bytes.toString(url));  
466.            m.setText(Bytes.toString(name));  
467.            menus.add(m);  
468.        }  
469.        table.close();  
470.        return menus;  
471.    }  
472.      
473.    public static void getAllUserTree(Long id) throws Exception {  
474.        HTable table_hdfs = new HTable(TableName.valueOf("hdfs"), connection);  
475.        HTable table = new HTable(TableName.valueOf("hdfs_cid"), connection);  
476.        Get get = new Get(Bytes.toBytes(id));  
477.        Result rs = table.get(get);  
478.        List<Menu> menus = new ArrayList<Menu>();  
479.        Menu menu = null;  
480.        for (Cell cell : rs.rawCells()) {  
481.            Get get1 = new Get(CellUtil.cloneValue(cell));  
482.            get1.addColumn(Bytes.toBytes("dir"), Bytes.toBytes("name"));  
483.            Result rs1 = table_hdfs.get(get1);  
484.            byte[] value = rs1.getValue(Bytes.toBytes("dir"), Bytes.toBytes("name"));  
485.            String name = Bytes.toString(value);  
486.              
487.            get1.addColumn(Bytes.toBytes("dir"), Bytes.toBytes("type"));  
488.            Result rs2 = table_hdfs.get(get1);  
489.            byte[] type = rs2.getValue(Bytes.toBytes("dir"), Bytes.toBytes("type"));  
490.            String y = Bytes.toString(type);  
491.            menu = new Menu();  
492.            menu.setId(Bytes.toString(CellUtil.cloneValue(cell)));  
493.            menu.setName(name);  
494.        }  
495.        table.close();  
496.    }  
497.      
498.    public static List<FileSystemVo> getFile(String dir) throws Exception {  
499.        HTable fileTable = new HTable(TableName.valueOf("filesystem"), connection);  
500.        Scan scan = new Scan();  
501.        Filter filter = new QualifierFilter(CompareOp.LESS_OR_EQUAL, new SubstringComparator(dir));  
502.        scan.setFilter(filter);  
503.        ResultScanner rs = fileTable.getScanner(scan);  
504.        List<FileSystemVo> fs = new ArrayList<FileSystemVo>();  
505.        FileSystemVo f = null;  
506.        for (Result r : rs) {  
507.            Cell cellName = r.getColumnLatestCell(Bytes.toBytes("files"), Bytes.toBytes("name"));  
508.            Cell cellPdir = r.getColumnLatestCell(Bytes.toBytes("files"), Bytes.toBytes("pdir"));  
509.            Cell cellType = r.getColumnLatestCell(Bytes.toBytes("files"), Bytes.toBytes("type"));  
510.            Cell cellSize = r.getColumnLatestCell(Bytes.toBytes("files"), Bytes.toBytes("size"));  
511.            f = new FileSystemVo();  
512.            f.setId(Bytes.toLong(r.getRow()));  
513.            f.setDir(dir);  
514.            f.setName(Bytes.toString(CellUtil.cloneValue(cellName)));  
515.            if (cellSize!=null) {  
516.                f.setSize(Bytes.toString(CellUtil.cloneValue(cellSize)));  
517.            }  
518.            if(cellPdir!=null){  
519.                f.setPdir(Bytes.toString(CellUtil.cloneValue(cellPdir)));  
520.            }  
521.            if (cellType!=null) {  
522.                f.setType(Bytes.toString(CellUtil.cloneValue(cellType)));  
523.            }  
524.            f.setDate(DateUtil.longToString("yyyy-MM-dd HH:mm", cellName.getTimestamp()));  
525.            fs.add(f);  
526.        }  
527.        fileTable.close();  
528.        return fs;  
529.    }  
530.    public static void delByDir(String dir) throws Exception {  
531.        HTable fileTable = new HTable(TableName.valueOf("filesystem"), connection);  
532.        Scan scan = new Scan();  
533.        Filter filter = new QualifierFilter(CompareOp.LESS_OR_EQUAL, new BinaryComparator(Bytes.toBytes(dir)));  
534.        scan.setFilter(filter);  
535.        ResultScanner rs = fileTable.getScanner(scan);  
536.        for (Result r : rs) {  
537.            fileTable.delete(new Delete(r.getRow()));  
538.        }  
539.        fileTable.close();  
540.    }  
541.      
542.    public boolean follow(String oname,String dname) throws Exception {  
543.        long oid = this.getIdByUsername(oname);  
544.        long did = this.getIdByUsername(dname);  
545.        if (oid == 0 || did == 0 || oid == did){  
546.            return false;  
547.        }  
548.        this.add("follow", oid, "name", did, dname);  
549.          
550.        this.add("followed", did, oid, "userid", null, oid);  
551.        return true;  
552.    }  
553.    public boolean unfollow(String oname,String dname) throws Exception {  
554.        long oid = this.getIdByUsername(oname);  
555.        long did = this.getIdByUsername(dname);  
556.        if (oid == 0 || did == 0 || oid == did){  
557.            return false;  
558.        }  
559.        this.deleteColumns("follow", oid, "name", did);  
560.          
561.        this.deleteRow("followed", did, oid);  
562.        return true;  
563.    }  
564.    /** 
565.     * 获取关注的用户 
566.     * @param username 
567.     * @return 
568.     * @throws Exception 
569.     */  
570.    public Set<String> getFollow(String username) throws Exception {  
571.        Set<String> set = new HashSet<String>();  
572.        long id = this.getIdByUsername(username);  
573.        HTable table = new HTable(TableName.valueOf("follow"), connection);  
574.        Get get = new Get(Bytes.toBytes(id));  
575.        Result rs = table.get(get);  
576.        for (Cell cell : rs.rawCells()) {  
577.            set.add(Bytes.toString(CellUtil.cloneValue(cell)));  
578.        }  
579.        return set;  
580.    }  
581.    /** 
582.     * 分享文件及文件夹 
583.     * @param username 
584.     * @param path 
585.     * @param shareusername 
586.     * @throws Exception 
587.     */  
588.    public void share(String dir,String username,String[] path,String[] type,String shareusername) throws Exception {  
589.        long uid = getIdByUsername(username);  
590.        for (int i = 0; i < path.length; i++) {  
591.            long id = getGid("shareid");  
592.            add("share", uid,id, "content", "dir", dir);  
593.            add("share", uid,id, "content", "type", type[i]);  
594.            add("share", uid,id, "content", "path", path[i]);  
595.            add("share", uid,id, "content", "ts", DateUtil.DateToString("yyyy-MM-dd HH:mm", new Date()));  
596.              
597.            long suid = getIdByUsername(shareusername);  
598.            add("shareed", suid,uid,id, "shareid", null, uid,id);  
599.        }  
600.    }  
601.    /** 
602.     * 分享列表 
603.     * @param name 
604.     * @return 
605.     * @throws Exception 
606.     */  
607.    public List<ShareVo> getshare(String name) throws Exception {  
608.        long uid = getIdByUsername(name);  
609.        Scan scan = new Scan();  
610.        scan.setStartRow(Bytes.toBytes(uid));  
611.        scan.setStopRow(Bytes.toBytes(uid+1));  
612.        HTable share_table = new HTable(TableName.valueOf("share"), connection);  
613.        ResultScanner rs = share_table.getScanner(scan);  
614.        List<ShareVo> shareVos = new ArrayList<ShareVo>();  
615.        ShareVo share = null;  
616.        for (Result r : rs) {  
617.            Cell cellPath = r.getColumnLatestCell(Bytes.toBytes("content"), Bytes.toBytes("path"));  
618.            Cell cellTs = r.getColumnLatestCell(Bytes.toBytes("content"), Bytes.toBytes("ts"));  
619.            Cell cellType = r.getColumnLatestCell(Bytes.toBytes("content"), Bytes.toBytes("type"));  
620.            Cell cellDir = r.getColumnLatestCell(Bytes.toBytes("content"), Bytes.toBytes("dir"));  
621.            share = new ShareVo();  
622.            share.setShareid(Bytes.toString(r.getRow()));  
623.            share.setPath(Bytes.toString(CellUtil.cloneValue(cellPath)));  
624.            share.setTs(Bytes.toString(CellUtil.cloneValue(cellTs)));  
625.            share.setType(Bytes.toString(CellUtil.cloneValue(cellType)));  
626.            share.setDir(Bytes.toString(CellUtil.cloneValue(cellDir)));  
627.            shareVos.add(share);  
628.        }  
629.        share_table.close();  
630.        return shareVos;  
631.    }  
632.    /** 
633.     * 被分享 
634.     * @param username 
635.     * @return 
636.     * @throws Exception 
637.     */  
638.    public List<FileSystemVo> getshareed(String username) throws Exception {  
639.        long uid = getIdByUsername(username);  
640.        Scan scan = new Scan();  
641.        scan.setStartRow(Bytes.toBytes(uid));  
642.        scan.setStopRow(Bytes.toBytes(uid+1));  
643.        HTable shareed_table = new HTable(TableName.valueOf("shareed"), connection);  
644.        ResultScanner rs = shareed_table.getScanner(scan);  
645.        HTable share_table = new HTable(TableName.valueOf("share"), connection);  
646.        List<FileSystemVo> fs = new ArrayList<FileSystemVo>();  
647.        FileSystemVo f = null;  
648.        for (Result r : rs) {  
649.            Result shareRs = share_table.get(new Get(r.getValue(Bytes.toBytes("shareid"), null)));  
650.            Cell cellPath = shareRs.getColumnLatestCell(Bytes.toBytes("content"), Bytes.toBytes("path"));  
651.            Cell cellTs = shareRs.getColumnLatestCell(Bytes.toBytes("content"), Bytes.toBytes("ts"));  
652.            Cell cellType = shareRs.getColumnLatestCell(Bytes.toBytes("content"), Bytes.toBytes("type"));  
653.            Cell cellDir = shareRs.getColumnLatestCell(Bytes.toBytes("content"), Bytes.toBytes("dir"));  
654.            f = new FileSystemVo();  
655.//          f.setShareid(Bytes.toString(shareRs.getRow()));  
656.            f.setName(Bytes.toString(CellUtil.cloneValue(cellPath)));  
657.            f.setDate(Bytes.toString(CellUtil.cloneValue(cellTs)));  
658.            f.setType(Bytes.toString(CellUtil.cloneValue(cellType)));  
659.            f.setDir(Bytes.toString(CellUtil.cloneValue(cellDir)));  
660.            fs.add(f);  
661.        }  
662.        share_table.close();  
663.        shareed_table.close();  
664.        return fs;  
665.    }  
666.    /** 
667.     * 新增记事本 
668.     * @param username 
669.     * @param content 
670.     * @throws Exception 
671.     */  
672.    public void addbook(String username,String content) throws Exception {  
673.        long uid = getIdByUsername(username);  
674.        long id = getGid("bookid");  
675.        add("book", uid, id, "content", null, content);  
676.    }  
677.    /** 
678.     * 查询记事本 
679.     * @param username 
680.     * @return 
681.     * @throws Exception 
682.     */  
683.    public List<bookVo> listbook(String username) throws Exception {  
684.        long uid = getIdByUsername(username);  
685.        Scan scan = new Scan();  
686.        scan.setStartRow(Bytes.toBytes(uid));  
687.        scan.setStopRow(Bytes.toBytes(uid+1));  
688.        HTable table = new HTable(TableName.valueOf("book"), connection);  
689.        ResultScanner rs = table.getScanner(scan);  
690.        List<bookVo> books = new ArrayList<bookVo>();  
691.        bookVo book = null;  
692.        for (Result r : rs) {  
693.            book = new bookVo();  
694.            book.setId(Bytes.toString(r.getRow()));  
695.            book.setContent(Bytes.toString(r.getValue(Bytes.toBytes("content"), null)));  
696.            books.add(book);  
697.        }  
698.        table.close();  
699.        return books;  
700.    }  
701.      
702.    public static void main(String[] args) throws Exception {  
703.//      HbaseDB db = new HbaseDB();  
704.          
705.        System.out.println("ok");  
706.    }  
707.}  

package com.weirq.db;  
2.  
3.import java.io.BufferedInputStream;  
4.import java.io.FileInputStream;  
5.import java.io.FileOutputStream;  
6.import java.io.IOException;  
7.import java.io.InputStream;  
8.import java.io.OutputStream;  
9.import java.util.ArrayList;  
10.import java.util.List;  
11.  
12.import org.apache.hadoop.conf.Configuration;  
13.import org.apache.hadoop.fs.FSDataInputStream;  
14.import org.apache.hadoop.fs.FileStatus;  
15.import org.apache.hadoop.fs.FileSystem;  
16.import org.apache.hadoop.fs.FileUtil;  
17.import org.apache.hadoop.fs.Path;  
18.import org.apache.hadoop.io.IOUtils;  
19.import org.apache.hadoop.util.Progressable;  
20.  
21.import com.weirq.util.BaseUtils;  
22.import com.weirq.util.DateUtil;  
23.import com.weirq.util.FileUtils;  
24.import com.weirq.util.SiteUrl;  
25.import com.weirq.vo.FileSystemVo;  
26.import com.weirq.vo.Menu;  
27.  
28.public class HdfsDB {  
29.  
30.    private static String[] suf = {"csv","txt","doc","docx","xls","xlsx","ppt","pptx"};  
31.    private static final String ROOT = "/";  
32.    static FileSystem fs;  
33.    static Configuration conf;  
34.  
35.    private static class HdfsDBInstance {  
36.        private static final HdfsDB instance = new HdfsDB();  
37.    }  
38.  
39.    public static HdfsDB getInstance() {  
40.        return HdfsDBInstance.instance;  
41.    }  
42.  
43.    private HdfsDB() {  
44.        conf = new Configuration();  
45.        conf.set("fs.defaultFS", SiteUrl.readUrl("hdfs"));  
46.        try {  
47.            fs = FileSystem.get(conf);  
48.        } catch (IOException e) {  
49.            e.printStackTrace();  
50.        }  
51.    }  
52.  
53.    /** 
54.     * 上传文件 
55.     * @param filePath 
56.     * @param dir 
57.     * @throws Exception 
58.     */  
59.    public void upload(String filePath, String dir) throws Exception {  
60.        InputStream in = new BufferedInputStream(new FileInputStream(filePath));  
61.        OutputStream out = fs.create(new Path(ROOT + dir), new Progressable() {  
62.  
63.            @Override  
64.            public void progress() {  
65.                //System.out.println("ok");  
66.            }  
67.        });  
68.        IOUtils.copyBytes(in, out, 4096, true);  
69.    }  
70.    /** 
71.     * 已流形式上传 
72.     * @param in 
73.     * @param dir 
74.     * @throws Exception 
75.     */  
76.    public void upload(InputStream in, String dir) throws Exception {  
77.        OutputStream out = fs.create(new Path(dir), new Progressable() {  
78.            @Override  
79.            public void progress() {  
80.                //System.out.println("ok");  
81.            }  
82.        });  
83.        IOUtils.copyBytes(in, out, 4096, true);  
84.    }  
85.    /** 
86.     * 下载文件 
87.     * @param path 
88.     * @param local 
89.     * @throws Exception 
90.     */  
91.    public void downLoad(String path,String local) throws Exception {  
92.        FSDataInputStream in = fs.open(new Path(path));  
93.        OutputStream out = new FileOutputStream(local);  
94.        IOUtils.copyBytes(in, out, 4096, true);  
95.    }  
96.    /** 
97.     * 重命名文件 
98.     * @param src 
99.     * @param dst 
100.     * @throws Exception 
101.     */  
102.    public void rename(String src,String dst) throws Exception {  
103.        fs.rename(new Path(src), new Path(dst));  
104.    }  
105.  
106.    /** 
107.     * 创建文件夹 
108.     * @param dir 
109.     * @throws Exception 
110.     */  
111.    public void mkdir(String dir) throws Exception {  
112.        if (!fs.exists(new Path(dir))) {  
113.            fs.mkdirs(new Path(dir));  
114.        }  
115.    }  
116.    /** 
117.     * 删除文件及文件夹 
118.     * @param name 
119.     * @throws Exception 
120.     */  
121.    public void delete(String name) throws Exception {  
122.        fs.delete(new Path(name), true);  
123.    }  
124.  
125.    /** 
126.     * 查询文件夹 
127.     * @param dir 
128.     * @return 
129.     * @throws Exception 
130.     */  
131.    public List<FileSystemVo> queryAll(String dir) throws Exception {  
132.        FileStatus[] files = fs.listStatus(new Path(dir));  
133.        List<FileSystemVo> fileVos = new ArrayList<FileSystemVo>();  
134.        FileSystemVo f = null;  
135.        for (int i = 0; i < files.length; i++) {  
136.            f = new FileSystemVo();  
137.            if (files[i].isDirectory()) {  
138.                f.setName(files[i].getPath().getName());  
139.                f.setType("D");  
140.                f.setDate(DateUtil.longToString("yyyy-MM-dd HH:mm", files[i].getModificationTime()));  
141.                f.setNamep(files[i].getPath().getName());  
142.            } else if (files[i].isFile()) {  
143.                f.setName(files[i].getPath().getName());  
144.                f.setType("F");  
145.                f.setDate(DateUtil.longToString("yyyy-MM-dd HH:mm", files[i].getModificationTime()));  
146.                f.setSize(BaseUtils.FormetFileSize(files[i].getLen()));  
147.                f.setNamep(f.getName().substring(0, f.getName().lastIndexOf(".")));  
148.                String s=FileUtils.getFileSufix(f.getName());  
149.                for (int j = 0; j < suf.length; j++) {  
150.                    if (s.equals(suf[j])) {  
151.                        f.setViewflag("Y");  
152.                        break;  
153.                    }  
154.                }  
155.            }  
156.            fileVos.add(f);  
157.        }  
158.        return fileVos;  
159.    }  
160.    /** 
161.     * 移动或复制文件 
162.     * @param path 
163.     * @param dst 
164.     * @param src true 移动文件;false 复制文件 
165.     * @throws Exception 
166.     */  
167.    public void copy(String[] path, String dst,boolean src) throws Exception {  
168.        Path[] paths = new Path[path.length];  
169.        for (int i = 0; i < path.length; i++) {  
170.            paths[i]=new Path(path[i]);  
171.        }  
172.        FileUtil.copy(fs, paths, fs, new Path(dst), src, true, conf);  
173.    }  
174.      
175.    public List<Menu> tree(String dir) throws Exception {  
176.        FileStatus[] files = fs.listStatus(new Path(dir));  
177.        List<Menu> menus = new ArrayList<Menu>();  
178.        for (int i = 0; i < files.length; i++) {  
179.            if (files[i].isDirectory()) {  
180.                menus.add(new Menu(files[i].getPath().toString(), files[i].getPath().getName()));  
181.            }  
182.        }  
183.        return menus;  
184.    }  
185.  
186.    public static void main(String[] args) throws Exception {  
187.        HdfsDB hdfsDB = new HdfsDB();  
188.//      hdfsDB.mkdir(ROOT+"weir/qq");  
189.  
190.        // String path = "C://Users//Administrator//Desktop//jeeshop-jeeshop-master.zip";  
191.        // hdfsDB.upload(path, "weir/"+"jeeshop.zip");  
192.        // hdfsDB.queryAll(ROOT);  
193.//      hdfsDB.visitPath("hdfs://h1:9000/weir");  
194.//      for (Menu menu : menus) {  
195.//          System.out.println(menu.getName());  
196.//          System.out.println(menu.getPname());  
197.//      }  
198.//      hdfsDB.delete("weirqq");  
199.//      hdfsDB.mkdir("/weirqq");  
200.        hdfsDB.tree("/admin");  
201.        System.out.println("ok");  
202.    }  
203.}  
