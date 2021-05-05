<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css">
<title>Insert title here</title>
</head>
<body>
	<div class="column container is-max-widescreen" style="">
	<h1 class="title">Questions menu</h1>
	
		<!-- FORM -->
		<form method="post" action="../saveResults">
		
			<!-- DEBUGGING -->
			${username} <br>
			${salasana}
			
				<!-- LOOP -->
				<c:forEach var="questions" items="${requestScope.questionslist}">
				<!-- I love manual styling -->
				<div class="field" style="width: 400px">
  					<label class="label">
						${questions.kysymys}
					</label>
					<div class="control">
						<label class="radio">
							<input type="radio" id="1" name="${questions.id}" value="1">
								1
						</label>

						<label class="radio">
							<input type="radio" id="2" name="${questions.id}" value="2">
								2
						</label>

						<label class="radio">
							<input type="radio" id="3" name="${questions.id}" value="3">
								3
						</label>

						<label class="radio">
							<input type="radio" id="4" name="${questions.id}" value="4">
								4
						</label>

						<label class="radio">
							<input type="radio" id="5" name="${questions.id}" value="5">
								5
						</label>
					</div>

					<textarea class="textarea" name='comment${questions.id}' placeholder="Kommentti"></textarea>

				</div>
				</c:forEach>
			<!-- Button/s -->
			<div class="field">
				<label class="label">
					<button class="button is-success" type="submit">Continue</button>
				</label>
			</div>
		</form>
		
		<form method="post" action="../deleteResults">
		<button class="button is-danger" type="submit">Delete all the answers</button>
		</form>
	</div>
	
</body>
</html>