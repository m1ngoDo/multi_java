<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! public void test(){
		
	}
%>

<%
	/*java 주석!!    String name = null; */
	String test = null;
	Enumeration<String> names =  request.getParameterNames();

	while(names.hasMoreElements()){
		String name = names.nextElement();
		out.print(name +": "+request.getParameter(name)+"<br>");
	}
%>
<%-- jsp 주석!!!    --%>
<!-- <div>안녕~~~ </div>   html 주석 -->
</body>
</html>