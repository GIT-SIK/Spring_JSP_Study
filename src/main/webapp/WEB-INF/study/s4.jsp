<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
    <meta charset="UTF-8">
    <title> S4 - INSERT </title>
</head>
<body>
<!--
    <form action="/study/insert">


        <input type="submit"/>
    </form>

-->

<script>




   function insert_aj(){
       $.ajax({
        type : "POST",
        url : "/study/insert",
        data : {
            hide_1 : $('[name=hide_1]').is(':checked'),
            hide_2 : $('[name=hide_2]').is(':checked'),
            hide_3 : $('[name=hide_3]').is(':checked'),
            hide_4 : $('[name=hide_4]').is(':checked'),
            data_1 : $('#data_1').val()
        },

       });
   }

</script>

bool1 : <input type="checkbox" id="hide_1" name="hide_1" > <br>
bool2 : <input type="checkbox" id="hide_2" name="hide_2" > <br>
bool3 : <input type="checkbox" id="hide_3" name="hide_3" > <br>
bool4 : <input type="checkbox" id="hide_4" name="hide_4" > <br>
값 : <input type="text" id="data_1" name="data_1" size="50" placeholder="단어 입력"><br>

<input type="button" onclick="insert_aj();" />

</body>
</html>