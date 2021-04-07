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
<h2>show candidate</h2>

<h1>Ehdokkaan etunimi: ${requestScope.ehdokasshow.etunimi} </h1><br>
<h2>Ehdokkaan sukunimi: ${requestScope.ehdokasshow.sukunimi} </h2> <br>
${requestScope.ehdokasshow.puolue} <br>
${requestScope.ehdokasshow.kotipaikkakunta} <br>
${requestScope.ehdokasshow.ika} <br>
${requestScope.ehdokasshow.miksi} <br>
${requestScope.ehdokasshow.mita} <br>
${requestScope.ehdokasshow.ammatti} <br>

<a href="/show_ehdokkaat">Take me back, country road.</a>

</body>
</html>