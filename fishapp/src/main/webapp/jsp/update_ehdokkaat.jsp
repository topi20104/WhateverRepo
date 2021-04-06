<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fish application</title>
</head>
<body>
<h2>Edit Candodle</h2>

<form action='update' method='post'>
Ehdokas id: <input type='text' name='id' value='${requestScope.ehdokas.id}'readonly><br> 
Ehdokas etunimi: <input type='text' name='etunimi' value='${requestScope.ehdokas.etunimi}'><br>
Ehdokas sukunimi: <input type='text' name='sukunimi' value='${requestScope.ehdokas.sukunimi}'><br>
Ehdokas puolue: <input type='text' name='puolue' value='${requestScope.ehdokas.puolue}'><br>
Ehdokas kotipaikkakunta: <input type='text' name='kotipaikkakunta' value='${requestScope.ehdokas.kotipaikkakunta}'><br>
Ehdokas ikä: <input type='text' name='ika' value='${requestScope.ehdokas.ika}'><br>
Ehdokas miksi eduskuntaan?: <input type='text' name='miksi' value='${requestScope.ehdokas.miksi}'><br>
Ehdokas mitä asioita haluat edistää?: <input type='text' name='mita' value='${requestScope.ehdokas.mita}'><br>
Ehdokas ammatti: <input type='text' name='ammatti' value='${requestScope.ehdokas.ammatti}'><br>
<input type='submit' name='ok' value='Send'> 

</form>
</body>
</html>