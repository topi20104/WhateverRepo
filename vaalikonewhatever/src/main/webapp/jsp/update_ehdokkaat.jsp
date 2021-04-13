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
					Käyttäjänimi:
				</label>
			<input class="input" type='text' id='kayttajanimi' name='kayttajanimi' autocomplete='username' value='${username}'>
			</div>
			<div class="field">
				<label class="label">
					Salasana:
				</label>
			<input class="input" type='password' id='salasana' name='salasana' autocomplete="new-password" value='${password}'>
			</div>
			<div class="field">
				<label class="label">
					<input type='submit' class="button is-success" name='ok' value='Send'>
				</label>
			</div>
		</form>
	</div>
</body>
</html>