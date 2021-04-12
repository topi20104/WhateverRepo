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
	<form method="post" action="../saveResults">
	<table style="width: 100%; margin-left:70px;">
		Ehdokas : ${username} <br>
		
		<c:forEach var="questions" items="${requestScope.questionslist}">
			<tr>
				<td> ${questions.kysymys} <br>
				1<input type="radio" id="1" name="${questions.id}" value="1 ">
				2<input type="radio" id="2" name="${questions.id}" value="2 ">
				3<input type="radio" id="3" name="${questions.id}" value="3 ">
				4<input type="radio" id="4" name="${questions.id}" value="4">
				5<input type="radio" id="5" name="${questions.id}" value="5"> <br>
				Kommentti: <input type='text' name='' value=''><br> <br>
				 </td> 
			</tr>
		</c:forEach>
	</table>
	<button type="submit">Continue</button>
	</form>
</body>
</html>