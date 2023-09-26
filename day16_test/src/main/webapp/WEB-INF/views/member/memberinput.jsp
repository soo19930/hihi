<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">


function check()
{

   var f = document.form1;

   var cname = f.name.value;
   var vname = /^[가-힣]+$/;
   if(!vname.test(cname))
   {
      alert("이름은 한글만 입력가능합니다");
      f.name.select();
      return false;
   }
   
   var caddress = f.address.value;
   var vaddress = /^[가-힣 ]+$/;
   if(!vaddress.test(caddress))
   {
      alert("거주지는 한글만 입력가능합니다");
      f.address.select();
      return false;
   }

   var cpw = f.pw.value;
   var vpw = /^\d+$/;
   if(!vpw.test(cpw))
   {
      alert("비밀번호는 숫자만 입력가능합니다");
      f.pw.select();
      return false;
   }

     var selectedHobbies = document.querySelectorAll('input[name="hobby"]:checked');
     if (selectedHobbies.length < 2) {
    alert("취미를 2개 이상 선택하세요.");
    return false;
     }
   
   f.submit();     
}

</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="membersave" method="post" name="form1">
<table border="1" align="center">
<caption>회원가입</caption>
<tr> <th>아이디</th> <td><input type="text" name="id"></td> </tr>
<tr> <th>패스워드</th> <td><input type="text" name="pw"></td> </tr>
<tr> <th>이름</th> <td><input type="text" name="name"></td> </tr>
<tr> <th>전화번호</th> <td><input type="text" name="tell"></td> </tr>
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
<tr> <th>인사말</th> <td><textarea rows="10px" cols="50%" name="memo"></textarea></td> </tr>
<tr> <td colspan="2"><input type="button" value="전송" onclick="check()"></td> </tr>
</table>
</form>
</body>
</html>