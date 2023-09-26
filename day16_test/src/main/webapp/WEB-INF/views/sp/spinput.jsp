<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
      $(function(){
         $('#saledate').datepicker({
             dateFormat: 'yy-mm-dd' //달력 날짜 형태
                 ,showOtherMonths: true //빈 공간에 현재월의 앞뒤월의 날짜를 표시
                 ,showMonthAfterYear:true // 월- 년 순서가아닌 년도 - 월 순서
                 ,changeYear: true //option값 년 선택 가능
                 ,changeMonth: true //option값  월 선택 가능                
                 ,showOn: "both" //button:버튼을 표시하고,버튼을 눌러야만 달력 표시 ^ both:버튼을 표시하고,버튼을 누르거나 input을 클릭하면 달력 표시  
                 ,buttonImage: "http://jqueryui.com/resources/demos/datepicker/images/calendar.gif" //버튼 이미지 경로
                 ,buttonImageOnly: true //버튼 이미지만 깔끔하게 보이게함
                 ,buttonText: "선택" //버튼 호버 텍스트              
                 ,yearSuffix: "년" //달력의 년도 부분 뒤 텍스트
                 ,monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 텍스트
                 ,monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 Tooltip
                 ,dayNamesMin: ['일','월','화','수','목','금','토'] //달력의 요일 텍스트
                 ,dayNames: ['일요일','월요일','화요일','수요일','목요일','금요일','토요일'] //달력의 요일 Tooltip
                 ,minDate: "-5Y" //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)
                 ,maxDate: "+5y" //최대 선택일자(+1D:하루후, -1M:한달후, -1Y:일년후)  
             });                    
             
             //초기값을 오늘 날짜로 설정해줘야 합니다.
             $('#datepicker').datepicker('setDate', 'today'); //(-1D:하루전, -1M:한달전, -1Y:일년전), (+1D:하루후, -1M:한달후, -1Y:일년후)            
         });
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="spsave" method="post" enctype="multipart/form-data">
<table border="1" width="500px" align="center" > 
<caption>상품정보입력</caption>
<tr><th>상품번호</th><td><input type="number" name="num"></td></tr>
<tr><th>상품명</th><td><input type="text" name="spname"></td></tr>
<tr><th>상호명</th><td><input type="text" name="name"></td></tr>
<tr><th>판매일자</th><td><input type="text" id="saledate" name="saledate"></td></tr>
<tr><th>상품특징</th><td><input type="text" name="spec"></td></tr>
<tr><th>가격</th><td><input type="text" name="price"></td></tr>
<tr><th>상품이미지</th><td><input type="file" name="image"></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="저장">
	<button type="button" onclick="location.href='main'">취소</button>	
</td></tr>
</table>
</form>
</body>
</html>