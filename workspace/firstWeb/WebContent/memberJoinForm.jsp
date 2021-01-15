<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#msg {
	color: red;
}
</style>
</head>
<body>
	<%
		String msg = (String) session.getAttribute("msg");
	//더이상 유지할 필요가 없는 정보이므로 삭제한다. 	
	session.removeAttribute("msg");

	if (msg != null) {
	%>
	<div id="msg" class="a test bb"><%=msg%></div>
	<%
		}
	%>
	<h1>회원가입</h1>
	<form action="memberJoin" method="post">
		<table>
			<tr>
				<td>이름:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>아이디:</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>비밀번호:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>이메일:</td>
				<td><input type="email" name="email"></td>
			</tr>
		</table>
		<input type="submit" value="Submit">
	</form>

</body>
</html>