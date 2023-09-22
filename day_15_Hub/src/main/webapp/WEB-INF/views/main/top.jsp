<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<header style="text-align: center; background-color:#7e9d60; ">
	<h1 id="title">dddd개인정보 관리2211</h1>

</header>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="main" id="maintext">MAIN</a>
    </div>
    <ul class="nav navbar-nav">
      
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">성적관리<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="scoreinput">성적입력</a></li>
          <li><a href="scoreout">성적출력</a></li>
        </ul>
      </li>
      
     </ul>
<c:choose>
	<c:when test="${loginstate==true}">
		    <ul class="nav navbar-nav navbar-right">
      			<li><a href="#"><span class="glyphicon glyphicon-user"></span>${member.name}님 반갑습니다!</a></li>
      			<li><a href="logout"><span class="glyphicon glyphicon-log-in"></span>Logout</a></li>
   			</ul>
	</c:when>
	<c:otherwise>
		    <ul class="nav navbar-nav navbar-right">
      			<li><a href="memberinput"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      			<li><a href="loginform"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
   			</ul>
	</c:otherwise>
</c:choose>
  </div>
</nav>

</html>