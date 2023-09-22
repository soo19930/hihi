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
<tr> <th>학번</th> <th>이름</th> <th>국어</th> <th>영어</th> <th>수학</th>
	 <th>총점</th> <th>평균</th> <th>학점</th> <th>석차</th> </tr>
<c:forEach items="${list}" var="oo">
<tr> <td>${oo.hakbun }</td> <td>${oo.name }</td> <td>${oo.kor }</td> <td>${oo.eng }</td> <td>${oo.mat }</td>
	 <td>${oo.tot }</td> <td>${oo.avg }</td> <td>${oo.hak }</td> <td>${oo.rank }</td> </tr>
</c:forEach>

<!--페이징 처리-->
<tr style="border-left: none;border-right: none;border-bottom: none">
   <td colspan="9" style="text-align: center;">
   
   <c:if test="${paging.startPage!=1 }">
      <a href="scoreoutpage?nowPage=${paging.startPage-1 }&cntPerPage=${paging.cntPerPage}">◀</a>
      
   </c:if>   
   
      <c:forEach begin="${paging.startPage }" end="${paging.endPage}" var="p"> 
         <c:choose>
            <c:when test="${p == paging.nowPage }">
               <b><span style="color: #bac84d;">${p}</span></b>
            </c:when>   
            <c:when test="${p != paging.nowPage }">
               <a href="scoreoutpage?nowPage=${p}&cntPerPage=${paging.cntPerPage}">${p}</a>
            </c:when>   
         </c:choose>
      </c:forEach>
     
      <c:if test="${paging.endPage != paging.lastPage}">
      <a href="scoreoutpage?nowPage=${paging.endPage+1}&cntPerPage=${paging.cntPerPage }">▶</a>
   </c:if>
   
   </td>
</tr>
<!--페이징 처리-->

</table>
</body>
</html>