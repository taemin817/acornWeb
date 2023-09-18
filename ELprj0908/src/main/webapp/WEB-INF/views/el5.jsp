<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>저장소에서 저장된 값을 꺼내올 때 어떤 순서대로 찾는가</h2>
pageContext -> request -> session -> application 순으로 찾음

<h2>저장소에 담고 꺼내기 예시</h2> 
<%
	
		pageContext.setAttribute("test", "test_pageScope");
		request.setAttribute("test", "test_requestScope");
		session.setAttribute("test", "test_sessionScope");
		application.setAttribute("test", "test_applicationScope");
%>
	${ test }	<!-- 전부 검색한 뒤 가장 작은 저장소에것을 꺼내옴 -->
	<br>
	${ requestScope.test }
</body>
</html>