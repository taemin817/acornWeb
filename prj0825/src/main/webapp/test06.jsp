<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="prj0825.MyUtils" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>수를 입력받아 그 수의 약수 구하기</h3>

<% 

		String su1_ = request.getParameter("su1");
		
		int su1 = Integer.parseInt(su1_);
		
		for(int i = 1; i<=su1; i++){
			if(su1%i==0){
				out.print(i+" ");
			}
		}
%>

<%
		String su_ = request.getParameter("su");

		int su = Integer.parseInt(su_);
		
		// 약수 구하는 코드를 따로 MyUtils 클래스를 만들어 빼줌
		
		MyUtils utils = new MyUtils();
		String divisors = utils.getdisisor(su);
		
		System.out.println(divisors);
		out.println(divisors);
%>
</body>
</html>