<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page info="S1 File"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title> S1 </title>
</head>
<body>

<%Calendar now =  Calendar.getInstance(); %>
<%=getServletInfo()%> <br>
<h3> Print </h3> <br>
<%=now.get(Calendar.YEAR)%> <br>
<% out.print(now.get(Calendar.YEAR)); %>
</body>
</html>