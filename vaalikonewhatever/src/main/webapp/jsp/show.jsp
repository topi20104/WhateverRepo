<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Candidoods</title>


<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css">

</head>

<body>
	<div class="columns">
		<div class="column">

			<h2>candidates</h2>
			<a href="/jsp/insertdata.jsp">Add a new lad</a><br>

			<table style="width: 100%;">
				<c:forEach var="ehdokas" items="${requestScope.ehdokaslist}">
					<tr>
						<td><a href='/show?id=${ehdokas.id}'> Show </a>${ehdokas.sukunimi}
							${ehdokas.etunimi}</td>
					</tr>
				</c:forEach>

			</table>

		</div>
		<div class="column">

			Info based on id
			<c:forEach var="ehdokas" items="${requestScope.ehdokaslist}">
				<tr>
					<td>${ehdokas.id}${ehdokas.sukunimi} ${ehdokas.etunimi}</td>
				</tr>
			</c:forEach>

		</div>
	</div>
</body>
</html>