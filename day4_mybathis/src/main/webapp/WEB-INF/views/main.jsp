<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
    .bt {
    display: inline-block;
    padding: 10px 20px;
    background-color: yellow;
    color: black;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    text-decoration: none;
    font-size: 16px;
    box-shadow: 2px 2px 5px rgba(0, 0, 0, 0.2);
    transition: transform 0.3s, background-color 0.3s;
}

    /* 버튼에 호버 효과 추가 (선택 사항) */
    .button:hover {
        background-color: #0056b3;
    transform: scale(1.1);
    box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.3);
     background-color: #0056b3;
    }
    
    
    .bt2 {
    display: inline-block;
    padding: 10px 20px;
    background-color: green;
    color: #fff;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    text-decoration: none;
    font-size: 16px;
    box-shadow: 2px 2px 5px rgba(0, 0, 0, 0.2);
    transition: transform 0.3s, background-color 0.3s;
}

    /* 버튼에 호버 효과 추가 (선택 사항) */
    .button:hover {
        background-color: #0056b3;
        transform: scale(1.1);
    box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.3);
     background-color: #0056b3;
    }
    </style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="in" class="bt" >자료입력</a>
<a href="ou" class="bt2">자료출력</a>


</body>
</html>