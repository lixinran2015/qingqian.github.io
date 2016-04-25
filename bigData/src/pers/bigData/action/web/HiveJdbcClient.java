/** 
 * Project Name:bigData 
 * File Name:HiveJdbcClient.java 
 * Package Name:pers.bigData.web 
 * Date:2016Âπ?Êú?0Êó•‰∏ãÂç?:29:07 
 * Copyright (c) 2016, qingqian All Rights Reserved. 
 * 
 */  
package pers.bigData.action.web;  

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

/** 
 * ClassName:Snippet <br/> 
 * Function: HiveÊü•ËØ¢. <br/> 
 * Date:     2016Âπ?Êú?0Êó?‰∏ãÂçà2:29:07 <br/> 
 * @author   qingqian 
 * @version   
 * @see       
 */
public class HiveJdbcClient {
  private static String driverName = "org.apache.hive.jdbc.HiveDriver";
  
  /**
¬†  * @param args
¬†  * @throws SQLException
¬†  */
  public static void main(String[] args) throws SQLException {
      try {
      Class.forName(driverName);
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      System.exit(1);
    }
    Connection con = DriverManager.getConnection("jdbc:hive2://192.168.220.123:10000/default", "hdp", "hdp");
    Statement stmt = con.createStatement();
    String tableName = "testHiveDriverTable";
    stmt.execute("drop table " + tableName);

    stmt.execute("create table " + tableName + " (key int, value string) ROW FORMAT DELIMITED FIELDS TERMINATED BY '\054'");
    ResultSet res = null;
    // show tables
    String sql = "show tables '" + tableName + "'";
    System.out.println("Running: " + sql);
    res = stmt.executeQuery(sql);
    if (res.next()) {
      System.out.println(res.getString(1));
    }
    // describe table
    sql = "describe " + tableName;
    System.out.println("Running: " + sql);
    res = stmt.executeQuery(sql);
    while (res.next()) {
      System.out.println(res.getString(1) + "\t" + res.getString(2));
    }
    
    // load data into table
    // NOTE: filepath has to be local to the hive server
    // NOTE: /tmp/a.txt is a ctrl-A separated file with two fields per line
    String filepath = "///home/hdp/a.txt";
    sql = "load data local inpath '" + filepath + "' into table " + tableName;
    System.out.println("Running: " + sql);
    stmt.execute(sql);
    
    // select * query
    sql = "select * from " + tableName;
    System.out.println("Running: " + sql);
    res = stmt.executeQuery(sql);
    while (res.next()) {
      System.out.println(String.valueOf(res.getInt(1)) + "\t" + res.getString(2));
    }
    
    // regular hive query
    sql = "select count(1) from " + tableName;
    System.out.println("Running: " + sql);
    res = stmt.executeQuery(sql);
    while (res.next()) {
      System.out.println(res.getString(1));
    }
  }
}
