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

String[] ran = {"img1.jpg", "img2.jpg", "img3.jpg"};
int i = (int)( Math.random()*3);

%>
<img src="/prj/img/<%=ran[i] %>">

</body>
</html>