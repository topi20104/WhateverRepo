<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css">
<title>New candidate</title>
</head>
<body>
	<!-- Snake nr. 2 -->
	<div class="column is-half">
		<form action="../insert" method="post">
			<div class="field">
				<label class="label">
					Sukunimi:
				</label>
			<input class="input" type='text' name='sukunimi' id='sukunimi' placeholder='Sukunimi'>
			</div>
			
			<div class="field">
				<label class="label">
					Etunimi:
				</label>
			<input class="input" type='text' name='etunimi' id='etunimi' placeholder='Etunimi'>
			</div>
			
			<div class="field">
				<label class="label">
					Puolue:
				</label>
			<input class="input" type='text' name='puolue' id='puolue' placeholder='Puolue'>
			</div>
			
			<div class="field">
				<label class="label">
					Kotipaikkakunta:
				</label>
			<input class="input" type='text' name='kotipaikkakunta' id='kotipaikkakunta' placeholder='Kotipaikkakunta'>
			</div>
			
			<div class="field">
				<label class="label">
					Ikä:
				</label>
			<input class="input" type='text' name='ika' id='ika' placeholder='Ikä'>
			</div>
			
			<div class="field">
				<label class="label">
					Miksi Eduskuntaan?
				</label>
			<textarea class="textarea" maxlength="250" name='miksi' id='miksi' placeholder='Miksi?'></textarea>
			</div>
			
			<div class="field">
				<label class="label">
					Mitä asioita haluat edistää?
				</label>
			<textarea class="textarea" maxlength="2000" name='mita' id='mita' placeholder='Mitä?'></textarea>
			</div>
			
			<div class="field">
				<label class="label">
					Ammatti:
				</label>
			<input class="input" type='text' id='ammatti' name='ammatti' placeholder='Ammatti'>
			</div>
			
			<div class="field">
				<label class="label">
					Käyttäjänimi:
				</label>
			<input class="input" type='text' id='kayttajanimi' name='kayttajanimi' placeholder='Käyttajänimi'>
			</div>
			
			<div class="field">
				<label class="label">
					Salasana:
				</label>
			<input class="input" type='password' id='salasana' name='salasana' placeholder='Salasana'>
			</div>
			
			<!-- Button/s -->
			<div class="field">
				<label class="label">
					<input type='submit' class="button is-success" name='ok' value='Send'>
				</label>
			</div>
		</form>
	</div>
</body>
</html>