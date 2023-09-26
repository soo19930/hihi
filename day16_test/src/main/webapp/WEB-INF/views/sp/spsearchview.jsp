<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" align="center" width="700px">
<caption>검색결과</caption>
<tr><th>상품번호</th><th>상품명</th><th>판매일</th><th>가격</th></th><th>상품이미지</th><th>조회수</th></tr>
<c:forEach items="${list}" var="ss">
<tr>
<td><a href="delete?num=${ss.num }">${ss.num}</a></td>
<td><a href="detail?num=${ss.num }">${ss.spname}</a></td>
<td>${fn:substring(ss.saledate,0,10)}</td>
<td>${ss.price}</td>
<td><img id="img1" src="/test0926/image/${ss.image}" height="30px"></td>
<td>${ss.cnt}</td>
</tr>
</c:forEach>
</table>
</table>
</body>
</html>