<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css">
<title>Edit candidate</title>
</head>
<body>
	<div class="column is-half">
		<h1 class="title">Edit Candodle</h1>
	
	<!-- It's a heckin' snake -->
		<form action='update' method='post'>
			<div class="field">
				<label class="label">
					Ehdokas id:
				</label>
				<input class="input" type='text' name='id' value='${requestScope.ehdokas.id}' readonly>
			</div>
			<div class="field">
				<label class="label">
					Ehdokas etunimi:
				</label>
				<input class="input" type='text' name='etunimi' value='${requestScope.ehdokas.etunimi}'>
			</div>
			<div class="field">
				<label class="label">
					Ehdokas sukunimi:
				</label>
				<input class="input" type='text' name='sukunimi' value='${requestScope.ehdokas.sukunimi}'>
			</div>
			<div class="field">
				<label class="label">
					Ehdokas puolue:
				</label>
				<input class="input" type='text' name='puolue' value='${requestScope.ehdokas.puolue}'>
			</div>
			<div class="field">
				<label class="label">
					Ehdokas kotipaikkakunta:
				</label>
				<input class="input" type='text' name='kotipaikkakunta' value='${requestScope.ehdokas.kotipaikkakunta}'>
			</div>
			<div class="field">
				<label class="label">
					Ehdokas ikä:
				</label>
				<input class="input" type='text' name='ika' value='${requestScope.ehdokas.ika}'>
			</div>
			<div class="field">
				<label class="label">
					Ehdokas miksi eduskuntaan?
				</label>
				<textarea class="textarea" maxlength="250" name='miksi'>${requestScope.ehdokas.miksi}</textarea>
			</div>
			<div class="field">
				<label class="label">
					Ehdokas mitä asioita haluat edistää?
				</label>
				<textarea class="textarea" maxlength="2000" name='mita'>${requestScope.ehdokas.mita}</textarea>
			</div>
			<div class="field">
				<label class="label">
					Ehdokas ammatti:
				</label>
				<input class="input" type='text' name='ammatti' value='${requestScope.ehdokas.ammatti}'>
			</div>
			<div class="field">
				<label class="label">
					<input type='submit' class="button is-success" name='ok' value='Send'>
				</label>
			</div>
		</form>
	</div>
	<h2>Edit Candodle</h2>

	<form action='update' method='post'>
		Ehdokas id: <input type='text' name='id'
			value='${requestScope.ehdokas.id}' readonly><br> Ehdokas
		etunimi: <input type='text' name='etunimi'
			value='${requestScope.ehdokas.etunimi}'><br> Ehdokas
		sukunimi: <input type='text' name='sukunimi'
			value='${requestScope.ehdokas.sukunimi}'><br> Ehdokas
		puolue: <input type='text' name='puolue'
			value='${requestScope.ehdokas.puolue}'><br> Ehdokas
		kotipaikkakunta: <input type='text' name='kotipaikkakunta'
			value='${requestScope.ehdokas.kotipaikkakunta}'><br>
		Ehdokas ikä: <input type='text' name='ika'
			value='${requestScope.ehdokas.ika}'><br> Ehdokas miksi
		eduskuntaan?: <input type='text' name='miksi'
			value='${requestScope.ehdokas.miksi}'><br> Ehdokas mitä
		asioita haluat edistää?: <input type='text' name='mita'
			value='${requestScope.ehdokas.mita}'><br> Ehdokas
		ammatti: <input type='text' name='ammatti'
			value='${requestScope.ehdokas.ammatti}'><br> 
			
		salasana: <input type='text' name='salasana'
			value='${requestScope.ehdokas.salasana}'><br> 
			
		käyttäjänimi: <input type='text' name='kayttajanimi'
			value='${requestScope.ehdokas.kayttajanimi}'><br>
			<input type='submit' name='ok' value='Send'>
	
	</form>
</body>
</html>