<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>두 수를 입력받아 사칙연산 출력하기</h3>

<%
String su1_ = request.getParameter("su1");
String su2_ = request.getParameter("su2");

int su1 = Integer.parseInt(su1_);
int su2 = Integer.parseInt(su2_);

int sum = su1+su2;
int minus = su1-su2;
int multiple = su1*su2;
int divide = su1/su2;
%>

더하기 = <%=sum %><br>
빼기 = <%=minus %><br>
곱하기 = <%=multiple %><br>
나누기 = <%=divide %><br>

</body>
</html>