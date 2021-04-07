<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Candidoods</title>

<link rel="stylesheet" type="text/css" href="mycssfilesomewhere.css">


</head>

<body>
<h2>candidates</h2>
<a href="/jsp/insertdata.jsp">Add a new lad</a><br>

<table style="width:100%;">
<c:forEach var="ehdokas" items="${requestScope.ehdokaslist}" >
<tr><td><a href='id=${ehdokas.id}'>  ${ehdokas.sukunimi} ${ehdokas.etunimi} </a></td></tr>
</c:forEach>

</table>

</body>
</html>