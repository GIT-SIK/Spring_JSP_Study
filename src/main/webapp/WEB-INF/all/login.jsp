<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
    <meta charset="UTF-8">
    <title> LOGIN </title>
</head>
<body>
<form action="/login" method="post">
    아이디  <input type="text" name="id"><br/>
    비밀번호  <input type="password" name="pw"><br/>
    <input type="submit" value="로그인"><br/>
</form>
</body>
</html>