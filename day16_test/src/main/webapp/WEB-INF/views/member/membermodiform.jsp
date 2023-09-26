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
<form action="membermodify" method="post">
<table border="1" align="center" width="700px">
<c:forEach items="${list }" var="mm">
<tr> <th>아이디</th> <td><input type="text" name="id" value="${mm.id }" readonly></td> </tr>
<tr> <th>패스워드</th> <td><input type="text" name="pw" value="${mm.pw }"></td> </tr>
<tr> <th>이름</th> <td><input type="text" name="name" value="${mm.name }"></td> </tr>
<tr> <th>전화번호</th> <td><input type="text" name="tell" value="${mm.tell }"></td> </tr>
<tr> <th>성별</th> 
		<td>
			<input type="radio" name="sb" value="남자">남자
			<input type="radio" name="sb" value="여자">여자
		</td></tr>
<tr> <th>거주지</th> <td><input type="text" name="address"></td> </tr>
<tr> <th>취미</th> 
		<td>
			<input type="checkbox" name="hobby" value="영화">영화
			<input type="checkbox" name="hobby" value="여행">여행
			<input type="checkbox" name="hobby" value="운동">운동
			<input type="checkbox" name="hobby" value="그림">그림
			<input type="checkbox" name="hobby" value="음악">음악
		</td> 
</tr>
<tr> <th>인사말</th> <td><textarea rows="10px" cols="50%" name="memo">${mm.memo }</textarea></td> </tr>
<tr> <td colspan="2"><input type="submit" value="수정"></td> </tr>
</c:forEach>
</table>
</form>
</body>
</html>