<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style type="text/css">

#title{
	font-size: 43px;
	color: #ffffff;
	height: 130px;
	line-height: 160px;
	margin-top: 0px;
	margin-bottom: 0px;
}
#container {
	border: 0px solid #bcbcbc;
}
#header {
	text-align: center;
	width: 100%;
}
#nav {
	width: 100%;
}
#body {
	text-align: center;
	width: 100%;
}
#footer {
position:relative;
top:200px;
	width: 100%;
	text-align: center;
	font-size: 20px;
	line-height: 30px;
	height: 100px;
	background-color: #000000;
	color:white;
}

th{
	background-color: #ffffff;
	color: #000000;
	padding-left: 5px;
}
</style>
<meta charset="UTF-8">
<title><t:insertAttribute name="title"/></title>
</head>
<body>
	<div id="container">
		<div id="top">
			<t:insertAttribute name="top"/>
		</div>
		<div id="body">
			<t:insertAttribute name="body"/>
		</div>
		<div id="footer">
			<t:insertAttribute name="footer"/>
		</div>
	</div>
</body>
</html>