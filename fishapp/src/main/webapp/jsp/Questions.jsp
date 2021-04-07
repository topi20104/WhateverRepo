<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Questions menu</h1>
<table style="width:100%;">
<c:forEach var="questions" items="${requestScope.questionslist}">
<tr> <td> ${questions.id}: ${questions.kysymys}</td></tr> 
</c:forEach>
</table>
</body>
</html>