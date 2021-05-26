<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css">
<title>Candidate to vote for</title>
</head>
<body>
	<div class="column container is-max-widescreen" style="">
		<h1 class="title">Results</h1>
		
		<table class="table">
			<thead>
				<tr>
					<th>Similarity with the candidate</th>
					<th>Username of the candidate</th>
					<th>User ID of the candidate</th>
					<th></th>
				</tr>
			</thead>
			
			<tbody>
				
			</tbody>
				<c:forEach var="result" items="${requestScope.list}">
					<tr>
						<td>
							${result.value} %
						</td>
						<td>
							${result.kayttajanimi}
						</td>
						<td>
							${result.ehdokas_id}
						</td>
						<td>
							<a href='/readtoupdateehdokasshow2?id=${result.ehdokas_id}'>
								<button class="button is-info is-small">Show candidate</button>
							</a>
						</td>
					</tr>

				</c:forEach>
		
		</table>
	</div>
</body>
</html>