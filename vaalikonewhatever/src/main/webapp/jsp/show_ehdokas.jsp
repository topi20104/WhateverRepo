<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css">
<title>${requestScope.ehdokasshow.etunimi} ${requestScope.ehdokasshow.sukunimi}</title>
</head>
<body>
	<h2 class ="title">Show candidate</h2>
	<!-- I swear this is clean :)))) -->
	<!-- But if it works, why would you look at it? :D -->
	<div class="columns is-multiline is-gapless">
		<div class="column is-2">
			<h2><strong>Ehdokkaan etunimi:</strong></h2>
		</div>
		<div class="column is-10">
			<p>${requestScope.ehdokasshow.etunimi}</p>
		</div>
		
		<div class="column is-2">
			<h2><strong>Ehdokkaan sukunimi:</strong></h2>
		</div>
		<div class="column is-10">
			<p>${requestScope.ehdokasshow.sukunimi}</p>
		</div>
		
		<div class="column is-2">
			<h2><strong>Ammatti:</strong></h2>
		</div>
		<div class="column is-10">
			<p>${requestScope.ehdokasshow.ammatti}</p>
		</div>
		
		<div class="column is-2">
			<h2><strong>Ehdokkaan ikä:</strong></h2>
		</div>
		<div class="column is-10">
			<p>${requestScope.ehdokasshow.ika}</p>
		</div>
		
		<div class="column is-2">
			<h2><strong>Ehdokkaan puolue:</strong></h2>
		</div>
		<div class="column is-10">
			<p>${requestScope.ehdokasshow.puolue}</p>
		</div>
		
		<div class="column is-2">
			<h2><strong>Kotipaikkakunta:</strong></h2>
		</div>
		<div class="column is-10">
			<p>${requestScope.ehdokasshow.kotipaikkakunta}</p>
		</div>
		
		<div class="column is-2">
			<h2><strong>Miksi haluat eduskuntaan?</strong></h2>
		</div>
		<div class="column is-10">
			<p>${requestScope.ehdokasshow.miksi}</p>
		</div>
			
		<div class="column is-2">
			<h2><strong>Mitä asioita haluat edistää?</strong></h2>
		</div>
		<div class="column is-10">
			<p>${requestScope.ehdokasshow.mita}</p>
		</div>
		
	</div>
			
			

	<a href="/show_ehdokkaat">Take Me Home, Country Roads</a>
</body>
</html>