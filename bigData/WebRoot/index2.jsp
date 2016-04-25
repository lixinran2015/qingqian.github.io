<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@page import="org.springframework.web.context.WebApplicationContext" %>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="pers.bigData.dao.*" %>
<%@ page import="pers.bigData.data.service.*" %>
<%@ page import="pers.bigData.vo.*" %>
<%@ page import="java.util.*" %>
<%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
        WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        ContentService cs = (ContentService) wac.getBean("contentService");
        List<DimCity> coll = cs.getDimCitys();
        request.setAttribute("city",coll);
%>

<s:action name="rptPrice" executeResult="true" />
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
     <table>
     <tr>  
     <td style="width:100px;"><h4>省名称</h4></td>
     <td> 
       <select> 
       <option value=0>--请选择--</option> <%
       for(DimCity a : coll){ %>
               <option value=<%=a.getProv_code()%>>
                  <%=a.getProv_name()%>
               </option>  
        <%}%>
      </select>
     </td>
     </tr>  
     </tr>               
    </table>   
  </body>
</html>
