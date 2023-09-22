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

<table border="1" width="300px" align="center">
<caption>개인정보</caption>
<tr>
<th>이름</th><th>나이</th><th>전화번호</th>
</tr>

<c:forEach items="${list}" var="aa">
<tr>
	<td>${aa.name }</td> 
	<td>${aa.age }</td>
	<td>${aa.tell }</td>
</tr>
</c:forEach>




</table>
<div class="bt">
<a href="/main">메인</a>
</div>
</body>
</html>