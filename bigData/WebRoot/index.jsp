<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@page import="org.springframework.web.context.WebApplicationContext" %>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="pers.bigData.dao.*" %>
<%@ page import="pers.bigData.vo.*" %>
<%@ page import="java.util.*" %>
<%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
        WebApplicationContext wac=WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        DimCityDao cdao = (DimCityDao)wac.getBean("daoCity");
        Collection<DimCity> collc=cdao.getAll();
        request.setAttribute("city",collc);
        DimBrandDao bdao = (DimBrandDao)wac.getBean("daoBrand");
        Collection<DimBrand> collb=bdao.getAll();
        request.setAttribute("brand",collb);   
        Collection<RptPrice> colrp= (Collection)request.getAttribute("colrp");      
%>


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
  
 <body style="background-color:#FFFFB9">
    <form id="form1" action="RptPriceAction" method="post" namespace="/">
     <table border="1" width="85%" borderColor="#CDCD9A">
     <tr >  
     <td colspan="2" style="width:100px;" align="center"><b>省/自治区/直辖市</b></td>
     <td colspan="2" style="width:100px;" align="center"><b>市/区/县</b></td>
     <td colspan="2" style="width:100px;" align="center"><b>品牌</b></td>
     <td colspan="2" style="width:100px;" align="center"><b>厂商</b></td>
     <td colspan="2" style="width:100px;" align="center"><b>车系</b></td>
     <td colspan="2" style="width:100px;" align="center"><b>年限</b></td>
     <td colspan="2" style="width:100px;" align="center"><b>车型</b></td>
     <div style="position:absolute;left:1160px;top:20px;">
     <input type="submit" value="查询" cssClass="color:#FFFFFF;background-color:#019858;" />
     
     </div>
     </tr>
     
     <tr> 
     <td colspan="2"> 
       <select> 
       <option value=0>--请选择--</option> <%
       for(DimCity a : collc){ %>
               <option value=<%=a.getProv_code()%>>
                  <%=a.getProv_name()%>
               </option>  
        <%}%>
      </select>
     </td>
     <td colspan="2"> 
       <select> 
       <option value=0>--请选择--</option> <%
       for(DimCity a : collc){ %>
               <option value=<%=a.getProv_code()%>>
                  <%=a.getProv_name()%>
               </option>  
        <%}%>
      </select>
     </td>     
     <td colspan="2"> 
       <select name="rpt.brand_code" id="brandCode" onChange="reload(this.value)" >> 
       <option value=0>--请选择--</option> <%
       for(DimBrand b : collb){ %>
               <option value=<%=b.getBrand_code()%>>
                  <%=b.getBrand_name()%>
               </option>  
        <%}%>
      </select>
     </td>   
     <td colspan="2"> 
       <select> 
       <option value=0>--请选择--</option> 
      </select>
     </td>
     <td colspan="2"> 
       <select> 
       <option value=0>--请选择--</option> 
      </select>
     </td>
     <td colspan="2"> 
       <select> 
       <option value=0>--请选择--</option> 
      </select>
     </td>
     
     <td colspan="2"> 
       <select> 
       <option value=0>--请选择--</option> 
      </select>
     </td>
     </tr>               
    </table>   
    </form>
    <br>
    <br>
    
     <table border="1" width="70%" borderColor="#CDCD9A">
     <tr width="70%">  
     <td colspan="4" style="width:100px;" align="center"><b>厂商指导价(元)</b></td>
     <td colspan="6" style="width:100px;" align="center"><b>新车实际成交价(元)</b></td>
     <td colspan="6" style="width:100px;" align="center"><b>新车实际成交价(含税)(元)</b></td>
     </tr>
     <tr >  
     <td colspan="2" style="width:50px;height:20px" align="center">原车型</td>
     <td colspan="2" style="width:50px;height:20px" align="center">父车型</td>
     <td colspan="2" style="width:50px;height:20px" align="center">原车型</td>
     <td colspan="2" style="width:33px;" align="center">父车型</td>
      <td colspan="2" style="width:33px;" align="center"><div style="color:#8F4586;"> <b>修正价</b>
     </div>
     <td colspan="2" style="width:33px;" align="center">原车型</td>
     <td colspan="2" style="width:33px;" align="center">父车型</td>
     <td colspan="2" style="width:33px;" align="center"><div style="color:#8F4586;"> <b>修正价</b>
     </div>
     </td>
     </tr>
  <%
         if ( null != colrp && ! colrp.isEmpty() ){        
         for (Iterator iter = colrp.iterator(); iter.hasNext();) {
            RptPrice ddd = (RptPrice)iter.next();
            %>
            <tr >       
           <td colspan="2" style="width:50px;height:20px" align="center">
            <%=ddd.getGuide_price()%>
              </td>
          <td colspan="2" style="width:50px;height:20px" align="center"> 
          <%=ddd.getBare_price()%>
          
          </td> 
          <td colspan="2" style="width:33px;height:20px" align="center"> 
          <%=ddd.getDeal_price()%>
           </td>          
           <td colspan="2" style="width:33px;height:20px" align="center"> </td>
           <td colspan="2" style="width:33px;height:20px" align="center"> <div style="color:#8F4586;"> <b> </b>
          </div>
          <td colspan="2" style="width:33px;height:20px" align="center"> </td>
          <td colspan="2" style="width:33px;height:20px" align="center"> </td>
          <td colspan="2" style="width:33px;height:20px" align="center"><div style="color:#8F4586;"> <b> </b>
         </div>
         </tr>
<%
}                   
}    
%>
     </table>
  </body>
</html>





