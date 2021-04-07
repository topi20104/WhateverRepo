<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css">
<title>Fish application</title>
</head>
<body>
<h2>Edit Candodle</h2>

<div class="columns">
<div class="column">
<ol>
<dl><a href='/readtoupdateehdokasshow?id=2'>asas</a></dl>
<dl><a href='/readtoupdateehdokasshow?id=3'>asas</a></dl>
<dl><a href='/readtoupdateehdokasshow?id=4'>asas</a></dl>
<dl><a href='/readtoupdateehdokasshow?id=5'>asas</a></dl>
</ol>
		<c:forEach var="ehdokas" items="${requestScope.ehdokaslist}" >
		<a href='/readtoupdateehdokasshow?id=${ehdokas.id}'> Show </a>${ehdokas.sukunimi} ${ehdokas.etunimi} <a href='/delete?id=${ehdokas.id}'>delete</a> <a href='/readtoupdate?id=${ehdokas.id}'>update</a>
		</c:forEach>

</div>
<div class="column">

<h1>Ehdokkaan etunimi: ${requestScope.ehdokasshow.etunimi} </h1><br>
<h2>Ehdokkaan sukunimi: ${requestScope.ehdokasshow.sukunimi} </h2> <br>
${requestScope.ehdokasshow.puolue} <br>
${requestScope.ehdokasshow.kotipaikkakunta} <br>
${requestScope.ehdokasshow.ika} <br>
${requestScope.ehdokasshow.miksi} <br>
${requestScope.ehdokasshow.mita} <br>
${requestScope.ehdokasshow.ammatti} <br>
</div>

</div>
</body>
</html>