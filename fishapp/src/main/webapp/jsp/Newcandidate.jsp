<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New candidate</title>
</head>
<body>
<form action="insert" method="post">
Sukunimi: <input type='text' name='sukunimi' value=""><br> 
Etunimi: <input type='text' name='etunimi' value=""><br> 
Puolue: <input type='text' name='puolue' value=""><br> 
Kotipaikkakunta: <input type='text' name='kotipaikkakunta' value=""><br> 
Ikä: <input type='text' name='ika' value=""><br> 
Miksi Eduskuntaan?: <input type='text' name='MiksiEduskuntaan' value=""><br> 
Mitä asioita haluat edistää?: <input type='text' name='MitaEdistaa' value=""><br> 
Ammatti: <input type='text' name='Ammatti' value=""><br> 
<input type='submit' name='ok' value='Send'> 
</form>
</body>
</html>