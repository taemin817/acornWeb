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

	<% String id = (String) session.getAttribute("id");
	if (id != null){%>
		로그아웃
	<%} else{%>
		로그인
	<%} %>
	
	<h2>empty : null "" -> true</h2>
	<c:if test="${ empty id }">로그인</c:if> <!-- id가 있으므로 아무것도 안뜸 -->
	
	<c:if test="${ not empty id }">로그아웃</c:if> <!-- id가 비어있지않으므로 로그아웃 출력 -->
	
	<h2>eq : 같다/ne : 같지않다</h2>
	<c:set var="message" value="비로그인" />
	
	<c:if test="${ message eq '비로그인' }">		<!-- 위에서 message를 비로그인 으로 설정했고 같냐고 물었으니 로그인 출력 -->
		<h3>로그인</h3>
	</c:if>
	
	<c:if test="${message ne '비로그인' }">	<!-- 위에서 message를 비로그인 으로 설정했고 같지않냐고 물었으니 아무것도 안뜸 -->
		<h3>로그아웃</h3>
	</c:if>
	
	<c:if test="${ empty message }"> <!-- 위에서 message를 비로그인 으로 설정했고 비어있냐고 물었으니 아무것도 안뜸 -->
		메세지가 없습니다
	</c:if>
	
	<c:if test="${ empty message2 }"> <!-- message2를 설정한 적이 없으니 message2는 비어있으니 메세지2가 없습니다 출력 -->
		메세지2가 없습니다
	</c:if>
	<br>
	<c:set var="logInOut" value="${ empty id ? 'login' : 'logout' }"/> 
	${logInOut}<br>	<!-- id가 있으니 logout 출력 -->
	
	<c:set var="test2" value="acorn2"/>	
	<c:set var="result" value="${ empty test2 ? 'test2가 없다' : 'test2가 있다' }"/>
	${ result }	<!-- test2에 acorn2를 넣고 test2가 비어있냐고 물었으나 비어있지 않으니 test2가 있다 출력 -->
</body>
</html>