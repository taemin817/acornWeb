<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="java.sql.*"%>

<%
  String userid = request.getParameter("userid");
  String userpw="";
  String usernm="";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./list.css" rel="stylesheet"/>
</head>
<body>
<form name="frm" action="register_action.jsp" method="post">
	<table>
    <tr>
      <td>id</td>
      <td><input type="text" name="userid"></td>
    </tr>
    <tr>
      <td>pw</td>
      <td><input type="text" name="userpw"></td>
    </tr>
    <tr>
      <td>nm</td>
      <td><input type="text" name="usernm"></td>
    </tr>
    <tr>
      <td><button>전송</button></td>
    </tr>
  </table>
</form>
</body>
</html>