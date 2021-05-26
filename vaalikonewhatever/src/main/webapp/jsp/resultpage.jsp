<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css">
<title>Candidate to vote for</title>
</head>
<body>

	<c:forEach var="result" items="${requestScope.list}">
		<h1>name 		${result.kayttajanimi}</h1> <br>
		<h2>percent 	${result.value}</h2> <br>
		<h3>ehdokas id	${result.ehdokas_id}</h3> <br>
		<a href="/readtoupdateehdokasshow2?id=${result.ehdokas_id}">show</a> <br>
	</c:forEach>

</body>
</html>