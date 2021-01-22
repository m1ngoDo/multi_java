<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세보기</title>
</head>
<body>
<h1>게시글 상세 보기!</h1>
<hr>
게시글번호 : ${board.id }<br>
작성자아이디:${board.memberId}<br>
제목 : ${board.title }<br>
내용 : ${board.content }<br>
작성일 : ${board.writeDate }<br>


<br><br>
<a href="/board/members">회원목록보기</a>

</body>
</html>