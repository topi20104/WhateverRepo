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
	<div class="column">
		<h1 class="title">Candidates</h1>
			<a href="/jsp/insertdata.jsp">
				<button class="button is-info">Add a new lad</button>
			</a><br>
	</div>
	<div class="column is-two-thirds">
		<!-- A table with a table head, and a table body -->
		${user} <br>
		${username}
		${salasana}
		<table class="table">
			<thead>
				<tr>
					<th></th>
					<th>Last name</th>
					<th>First name</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
			<!-- Looped data from ehdokaslist -->
				<c:forEach var="ehdokas" items="${requestScope.ehdokaslist}">
					<tr>
						<td>
							<a href='/readtoupdateehdokasshow?id=${ehdokas.id}'>
								<button class="button is-info is-small">Show</button>
							</a>
						</td>
						<td>
							${ehdokas.sukunimi}
						</td>
						<td>
							${ehdokas.etunimi}
						</td>
						<td>
							<a href='/readtoupdate?id=${ehdokas.id}'>
								<button class="button is-info is-small">Update</button>
							</a>
						</td>
						<td>
							<a href='/delete?id=${ehdokas.id}'>
								<button class="button is-danger is-small">Delete</button>
							</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>