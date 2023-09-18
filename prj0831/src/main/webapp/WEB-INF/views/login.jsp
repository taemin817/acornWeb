<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
width: 300px
border: 1px solid black;
border-collapse: collapse;
margin: 0 auto;
}

td{
border: 1px solid black;
}
</style>
</head>
<body>
<h2>login</h2>
<form name="frm" action="/prj0831/login" method="post">
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
		<td colspan="2">
		<button>login</button>
		</td>
		</tr>
	</table>
</form>
</body>
</html>