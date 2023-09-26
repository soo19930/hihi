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
<table border="1" align="center" width="700px">
<tr> <th>아이디</th> <th>이름</th> <th>전화번호</th> 
	 <th>성별</th> <th>거주지</th> <th>수정</th> </tr>
<c:forEach items="${list}" var="mm">
<tr> <td><a href="memberdelete?id=${mm.id }">${mm.id }</a></td> 
	 <td>${mm.name }</td> <td>${mm.tell }</td> 
	 <td>${mm.sb }</td> <td>${mm.address }</td> 
	 <td><input type="button" value="수정" onclick="location.href='membermodiform?id=${mm.id }'"></td>
</tr>
</c:forEach>
</table>
</body>
</html>