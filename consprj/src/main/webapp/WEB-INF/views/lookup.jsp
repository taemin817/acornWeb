<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.util.*" %>
<%@ page import="Consprj.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>F1의 유우명한 팀들</h1>


	<!--
	ArrayList<Member> constructor = (ArrayList<Member>) request.getAttribute("Info");
	for (Member m : constructor) {
		out.println(m + "<br>");
	}
	  -->
	
	<%
	ArrayList<String> list = (ArrayList<String>)request.getAttribute("list");
	for(int i =0;i<list.size();i++){
		out.println(list.get(i)+"<br>");
	}
	%>
</body>
</html>