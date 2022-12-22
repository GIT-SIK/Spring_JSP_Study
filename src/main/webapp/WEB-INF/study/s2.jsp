<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page info="S2 File"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title> S2 - Object/JSON</title>
</head>
<body>
<script>



    var obj = {
        num : "${data.num}",
        hide_1 : "${data.hide_1}",
        hide_2 : "${data.hide_2}",
        hide_3 : "${data.hide_3}",
        date_1 : "${data.date_1}",
        data_1 : "${data.data_1}"
    };

    console.log("-- Model --");
    console.log("${data}");
    console.log("-- Obj --");
    console.log(obj);
    console.log("-- JSON --");
    console.log(JSON.stringify(obj));

</script>

${data} <br>
${data.data_1}

</body>
</html>