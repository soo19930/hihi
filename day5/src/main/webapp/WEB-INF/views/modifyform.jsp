<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${list }" var="aa">
<form action="mo2" method="post">
<table border="1" width="300px" align="center">
<tr><th>아이디</th><td><input type="text" name="id" value="${aa.id }"></td></tr>
<tr><th>이름</th><td><input type="text" name="name" value="${aa.name }"></td></tr>
<tr><th>전화</th><td><input type="text" name="tell" value="${aa.tell }"></td></tr>
<tr><th>주소</th><td><input type="text" name="address" value="${aa.address }"></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="전송">
									<input type="reset" value="취소"></td></tr>
</table>
</form>
</c:forEach>
</body>
</html>