<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="modifyform" method="post">
<c:forEach items="${list }" var="dd">
<table border="1" align="center" width="400px">
<tr><td><input type="hidden" name="num" value="${dd.num}"></td></tr>
<tr><th>상품명</th><td>${dd.spname}</td></tr>
<tr><th>상호명</th><td>${dd.name}</td></tr>
<tr><th>상품특징</th><td>${dd.spec}</td></tr>
<tr><th>상품이미지</th><td><img  src="/test0926/image/${dd.image}" height="100px"></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="수정">
	 <button type="button" onclick="location.href='spreply?num=${dd.num}'">댓글달기</button>
	 <button type="button" onclick="location.href='spout'">취소</button>
</td></tr>
</c:forEach>
</table>
</form>
</body>
</html>