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

String[] ran = {"화이팅", "파이팅", "fighting", "Fighting"};
int i = (int)( Math.random()*4);

out.println(ran[i]);
%>
</body>
</html>