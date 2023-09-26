<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.12.4.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<c:forEach items="${list}" var="dto">
<form action="spreplysave" method="post" enctype="multipart/form-data">
<table border="1" align="center" width="500px" hieght="1000px">
<caption>댓글 달기</caption>

<tr><td><input type="hidden" name="num" value="${dto.num}"></td></tr>

<tr><td><input type="text" name="spname" value="${dto.spname}"></td></tr>
<tr><td><input type="text" name="name" value="${dto.name}"></td></tr>
<tr><td><input type="text" name="saledate" value="${dto.saledate}"></td></tr>
<tr><td><input type="text" name="spec" value="${dto.spec}"></td></tr>
<tr><td><input type="number" name="price" value="${dto.price}"></td></tr>
<tr><td><input type="file" name="image" value="${dto.image}"></td></tr>

<tr><td><input type="hidden" name="groups" value="${dto.groups}"></td></tr>
<tr><td><input type="hidden" name="step" value="${dto.step}"></td></tr>
<tr><td><input type="hidden" name="indent" value="${dto.indent}"></td></tr>

<tr>
<td colspan="2">
<input type="submit" value="댓글 등록">
</td>
</tr>

</table>
</form>
</c:forEach>

</body>
</html>