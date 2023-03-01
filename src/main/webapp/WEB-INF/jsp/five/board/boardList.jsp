<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}/resources"/>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content= "text/html; charset=UTF-8">
    <link rel="stylesheet" href="${path}/five/css/board.css">
    <title>게시글 목록</title>
</head>
<body>
<h3>공지사항</h3>
<button class="btn btn-primary" style="float : right;" onclick="location.href='/board/post'">작성</button>
<table class="table">
    <tr>
        <th>No</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성날짜</th>
        <th>조회수</th>
    </tr>
    <c:forEach var="board" items="${boardList}">
        <tr>
            <td>${board.b_no}</td>
            <td><a href="/board/${board.b_no}">${board.b_title}</a></td>
            <td>${board.b_id}</td>
            <td><fmt:formatDate value="${board.b_date}" pattern="MM/ dd" /></td>
            <td>${board.b_cnt}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
