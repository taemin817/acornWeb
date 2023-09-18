<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String result = (String) request.getAttribute("data"); %>
	<%=result %>
	
	<h2>EL(저장소에 있는 값들을 쉽게 꺼내올 수 있음) 사용</h2>
	${data}
	<h3>사칙연산</h3>
	${ 10+20 }
	${ 10/3 }
	${ 10%3 }
	<h3>논리연산</h3>
	1. ${ true&&true}	<!-- true -->
	2. ${ true&&false}	<!-- false -->
	3. ${ true || false}	<!-- true -->
	4. ${ true or false}	<!-- true -->
	5. ${ true and false}	<!-- false -->
	6. ${ not true}	<!-- false -->
	<h3>empty : null 이면 true</h3>
	<% pageContext.setAttribute("title", "EL연산자"); %>
	${ empty title }		<!-- false -->
	${ not empty title }	<!-- true -->
	
</body>
</html>