<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/acornRegi" method="post">
<input type="text" name="id" placeholder="id"><br/>
<input type="text" name="pw" placeholder="pw"><br/>
<input type="text" name="name" placeholder="name"><br/>
<button>회원가입</button>
</form>
</body>
</html>