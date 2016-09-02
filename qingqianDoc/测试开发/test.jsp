<%@page contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%
     String scheme = request.getScheme();
     String serverName = request.getServerName();
	 String remoteName = request.getRemoteAddr();
	 String realIP = request.getHeader("X-Forwarded-For");
	 String realIP2 = request.getHeader("X-Real-IP");
	 String Host = request.getHeader("Host");
     int port = request.getServerPort();
	 int portR = request.getRemotePort();
	 String requestURIC1 = scheme+"://"+realIP+":"+portR;
	 String requestURIC2 = scheme+"://"+realIP2+":"+portR;
	 String requestURIC3 = scheme+"://"+remoteName+":"+portR;
	 String requestURI = scheme+"://"+serverName+":"+port;
%>	
客户端地址1:<%=requestURIC1 %>
<br>
客户端地址2:<%=requestURIC2 %>
<br>
客户端地址3:<%=requestURIC3%>
<br>
服务器地址1:<%=requestURI%>
<br>
服务器地址2:<%=Host%>
<br>
