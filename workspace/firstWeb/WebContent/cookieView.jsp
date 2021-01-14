<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
%>

<%=request.getMethod()%><br>
<%=request.getRequestURL() %><br>
<table>
	<tr>
		<th>쿠키이름</th>
		<th>쿠키값</th>
	</tr>
	<%
	if(cookies != null){
		for(Cookie cookie : cookies){
	%>
		<tr>
			<td><%=cookie.getName() %></td>
			<td><%=cookie.getValue() %></td>
		</tr>
		
	<%}//end for
	}//end if %>
</table>
</body>
</html>