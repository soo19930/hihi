<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="save" method="post">
<table border="1" width="300px" align="center">
<tr><th>이름</th><td><input type="text" name="name"></td></tr>
<tr><th>나이</th><td><input type="text" name="age"></td></tr>
<tr><th>전화번호</th><td><input type="text" name="tell"></td></tr>
<tr><td colspan="2" align="center"><input type="button" value="전송" onclick="check()" ></td></tr>

</table>
</form>
</body>
</html>