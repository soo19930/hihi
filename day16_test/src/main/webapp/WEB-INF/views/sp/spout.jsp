<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
#img1:hover {
	transform: 
	scale(5)
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="700px" align="center" >
<tr><th>상품번호</th><th>상품명</th><th>판매일</th><th>가격</th></th><th>상품이미지</th><th>조회수</th></tr>
<c:forEach items="${list}" var="aa">
<tr>
<td><a href="delete?num=${aa.num }">${aa.num}</a></td>
<td><a href="detail?num=${aa.num }">${aa.spname}</a></td>
<td>${fn:substring(aa.saledate,0,10)}</td>
<td>${aa.price}</td>
<td><img id="img1" src="/test0926/image/${aa.image}" height="30px"></td>
<td>${aa.cnt}</td>
</tr>
</c:forEach>
<div align="center" style="margin-top: 20px;">
    <form action="spsearchview" method="post">
        <select name="spitem">
		 		<option value="sname">상품명</option>
		 		<option value="name">상호명</option>
		 	</select>
        <input type="text" name="query">
        <input type="submit" value="검색">
    </form>
</div>

<!--페이징 처리-->
<tr style="border-left: none;border-right: none;border-bottom: none">
   <td colspan="9" style="text-align: center;">
   
   <c:if test="${paging.startPage!=1 }">
      <a href="spoutpage?nowPage=${paging.startPage-1 }&cntPerPage=${paging.cntPerPage}">◀</a>
      
   </c:if>   
   
      <c:forEach begin="${paging.startPage }" end="${paging.endPage}" var="p"> 
         <c:choose>
            <c:when test="${p == paging.nowPage }">
               <b><span style="color: #bac84d;">${p}</span></b>
            </c:when>   
            <c:when test="${p != paging.nowPage }">
               <a href="spoutpage?nowPage=${p}&cntPerPage=${paging.cntPerPage}">${p}</a>
            </c:when>   
         </c:choose>
      </c:forEach>
     
      <c:if test="${paging.endPage != paging.lastPage}">
      <a href="spoutpage?nowPage=${paging.endPage+1}&cntPerPage=${paging.cntPerPage }">▶</a>
   </c:if>
   
   </td>
</tr>
<!--페이징 처리-->
</table>
</body>
</html>