<%@page contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@page import="java.util.*"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
Map<String,String> obj =  (HashMap)pageContext.findAttribute("hashmap");
//Map<String,String> obj =  (Map)pageContext.getAttribute("hashmap", PageContext.APPLICATION_SCOPE);

if(obj == null){
	obj = new HashMap<String,String>();
	for(int i=0;i < 999;i++){
		obj.put("key_"+i,"value_"+i);
	}
	pageContext.setAttribute("hashmap",obj,PageContext.APPLICATION_SCOPE);
}
String key = request.getParameter("key");
String value = null;
if(key !=null){
     value = obj.get(key);
}else {
	obj.put(key,key);
}
%>

<%=key%>=<%=value%>
