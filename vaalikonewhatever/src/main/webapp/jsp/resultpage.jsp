<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Candidate to vote for</title>
</head>
<body>

	<c:foreach>
	${key}
	${value}
	</c:foreach>
</body>
</html>