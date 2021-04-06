<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Candidoods</title>

<link rel="stylesheet" type="text/css" href="mycssfilesomewhere.css">


</head>

<body>
<h2>candidates</h2>
<a href="/jsp/Newcandidate.jsp">Add a new lad</a>
<ol>
<c:forEach var="ehdokas" items="${requestScope.ehdokaslist}" >
<dl>${ehdokas.id}: ${ehdokas.etunimi}:  ${ehdokas.sukunimi}: ${ehdokas.puolue}: ${ehdokas.kotipaikkakunta}: ${ehdokas.ika}: ${ehdokas.miksi}: ${ehdokas.mita}: ${ehdokas.ammatti} <a href='/delete?id=${ehdokas.id}'>delete</a> <a href='/readtoupdate?id=${ehdokas.id}'>update</a></dl>
</c:forEach>
</ol>

</body>
</html>