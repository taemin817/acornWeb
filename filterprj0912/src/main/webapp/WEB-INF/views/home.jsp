<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
main입니다

<% String id = (String) session.getAttribute("id"); %>
<% if( id == null){ %>
	 <a href="<%=request.getContextPath()%>/login">로그인</a>
<%}else{ %>
<a href="<%=request.getContextPath()%>/logout">로그아웃</a><br/>
	<%} %>
<a href="<%=request.getContextPath()%>/order.do">주문정보</a><br/>
<a href="<%=request.getContextPath()%>/board.do">글쓰기</a><br/>
</body>
</html>