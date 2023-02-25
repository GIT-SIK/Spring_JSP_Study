<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="path" value="${pageContext.request.contextPath}/resources"/>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content= "text/html; charset=UTF-8">
    <title>공지사항</title>
</head>
<body>
<h3>공지사항</h3>
<div style="padding : 30px;">
    <div class="form-group">
        <label>제목</label>
        <span>${board.b_title}</span>
    </div>
    <div class="form-group">
        <label>작성자</label>
        <span>${board.b_id}</span>
    </div>
    <div class="form-group">
        <label>작성날짜</label>
        <span><fmt:formatDate value="${board.b_date}" pattern="yyyy/ MM/ dd HH:mm" /></span>
    </div>
    <div class="form-group">
        <label>조회수</label>
        <span>${board.b_cnt}</span>
    </div>
    <div class="form-group">
        <label>내용</label>
        <p>${board.b_content}</p>
    </div>
    <div class="form-group">
        <input type="button" value="수정" onclick='location.href="/board/post/${board.b_no}"'>
        <form:form action="/board/post/${board.b_no}" method="DELETE">
            <input type="submit" value="삭제">
        </form:form>
    </div>
</div>
</body>
</html>