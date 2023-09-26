<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="membersearchview" method="post">
	<table border="1" align="center">
	<caption>회원검색</caption>
	<tr>
		 <td>
		 	<select name="memsitem">
		 		<option value="id">아이디</option>
		 		<option value="name">이름</option>
		 		<option value="address">거주지</option>
		 	</select>
		 </td>
		 <td><input type="text" name="memsvalue"></td>
	</tr>
	
	<tr> <td colspan="2" style="text-align: center;">
	<input type="submit" value="전송">
	<input type="button" value="취소" onclick="location.href='out'"></td> </tr>
	</table>
</form>
</body>
</html>