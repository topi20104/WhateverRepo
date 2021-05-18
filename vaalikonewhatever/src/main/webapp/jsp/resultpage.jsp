<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Candidate to vote for</title>
</head>
<body>
<c:forEach var="result" items="${requestScope.list}">
	${result.kayttajanimi}
	
</c:forEach>

	
</body>
</html>