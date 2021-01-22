<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보보기</title>
</head>
<body>
<h1>회원 상세정보 보기!</h1>
<hr>
id : ${member.id }<br>
name : ${member.name }<br>
가입일 : ${member.joinDate }


<br><br>
<a href="/board/members">회원목록보기</a>

</body>
</html>