<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update questions</title>
</head>
<body>
	<h2>Answer Question</h2>
			${user}
			
			id : ${requestScope.questions.id} <br>
		
			Kymysys: ${requestScope.questions.kysymys}<br> 
			
			<form action="post">
			1<input type="radio" id="1" name="1" value="1">
			2<input type="radio" id="2" name="1" value="2">
			3<input type="radio" id="3" name="1" value="3">
			4<input type="radio" id="4" name="1" value="4">
			5<input type="radio" id="5" name="1" value="5"> <br>
			Kommentti: <input type='text' name='kotipaikkakunta'
			value=''><br>
			</form>	
			
</body>
</html>