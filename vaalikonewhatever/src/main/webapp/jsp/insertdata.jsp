<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New candidate</title>
</head>
<body>
	<form action="../insert" method="post">
		Sukunimi:<input type='text' name='sukunimi' id='sukunimi' value='sukunimi'><br> 
		Etunimi: <input type='text' name='etunimi' id='etunimi' value='etunimi'><br> 
		Puolue: <input type='text' name='puolue' id='puolue' value='puolue'><br>
		Kotipaikkakunta: <input type='text' name='kotipaikkakunta' id='kotipaikkakunta' value='kotipaikkakunta'><br> 
		Ikä: <input type='text' name='ika' id='ika' value='ika'><br> 
		Miksi Eduskuntaan?: <input type='text' name='miksi' id='miksi' value='miksi'><br>
		Mitä asioita haluat edistää?: <input type='text' name='mita' id='mita' value='mita'><br>
		Ammatti: <input type='text' id='ammatti' name='ammatti' value='ammatti'><br> 
		Salasana: <input type='password' id='salasana' name='salasana' value='salasana'><br> 
		Käyttäjänimi: <input type='text' id='kayttajanimi' name='kayttajanimi' value='kayttajanimi'><br> 
		<input type='submit' name='ok' value='Send'>
	</form>
</body>
</html>