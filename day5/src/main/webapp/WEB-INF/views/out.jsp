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
<table border="1" width="500px" align="center">
<tr><th>아이디</th><th>이름</th><th>전화</th><th>거주지</th><th>비고</th>
</tr>

<c:forEach items="${list }" var="aa">
<tr>

<td>${aa.id }</td>
<td>${aa.name }</td>
<td>${aa.tell }</td>
<td>${aa.address }</td>
<td>
	<c:url var="url" value="delete">
		<c:param name="id" value="${aa.id }"></c:param>
	</c:url>
<a href="${url}" >삭제</a>


	<c:url var="url1" value="mo1">
		<c:param name="id" value="${aa.id}"></c:param>
	</c:url>
<a href="${url1}" >수정</a>


</td>
</tr>



</c:forEach>

</table>
</body>
</html>