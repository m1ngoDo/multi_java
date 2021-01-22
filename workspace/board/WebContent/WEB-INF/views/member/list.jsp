<%@page import="exam.spring.board.dto.Member"%>
<%@page import="java.util.List"%>
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
	List<Member> memberList = (List<Member>)request.getAttribute("list");
%>
<H1>회원목록보기!! </H1>

<h3><%=request.getAttribute("id") %> 님 환영합니다^^ <a href="LogoutServlet">로그아웃</a></h3>
<table>
	<tr>
		<th>아이디</th>
		<th>이름</th>
		<th>비밀번호</th>
		<th>이메일</th>
		<th>가입일</th>
		<th>수정</th>
		<th>삭제</th>
	</tr>
	<% if(memberList != null){
	for(Member member:memberList){ %>
	<tr>
		<td><%=member.getId() %></td>
		<td><%=member.getName() %></td>
		<td><%=member.getPassword() %></td>
		<td><%=member.getEmail() %></td>
		<td><%=member.getJoinDate() %></td>
		<td><a href='MemberUpdateFromServlet?id=<%=member.getId() %>'>수정</a></td>
		<td><a href='memberDel?id=<%=member.getId() %>'>삭제</a></td>
	</tr>	
	<%} //end for
	}//end if %>
</table>
<br>
<br>
<button onclick="location.href='memberJoinForm.html'">회원가입하기!! </button>
</body>
</html>