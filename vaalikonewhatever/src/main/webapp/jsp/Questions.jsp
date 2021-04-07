<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css">
<title>Insert title here</title>
</head>
<body>
	<h1>Questions menu</h1>
	<form method="get" action="jsp/AnswerQuestions.jsp">
    <button type="submit">Continue</button>
	</form>
	<table style="width: 100%;">
		
		<c:forEach var="questions" items="${requestScope.questionslist}">
			<tr>
				<td><a href="readtoupdatequestion?id${questions.id}">show</a> ${questions.kysymys} </td> 
			</tr>
		</c:forEach>
	</table>
</body>
</html>