<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title> S3 - JSTL/LIST </title>
</head>
<body>
<c:forEach var="dataVO" items="${dataList}" varStatus="status" >
    ${status.count} / ${dataVO.num} : ${dataVO.date_1}
    <br>
</c:forEach>

</body>
</html>