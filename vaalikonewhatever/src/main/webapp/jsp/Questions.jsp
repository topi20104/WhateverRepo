<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css">
<title>Questions menu</title>
</head>
<body>
	<div class="column container is-max-widescreen" style="">
	<h1 class="title">Questions menu</h1>
	<p id="demo"></p>	
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
		<form method="post" action="rest/restful/updateAnswer">
			<button class="button is-info" type="submit">Update your answers</button>
		</form>
		
		<form method="post" action="rest/restful/deleteAnswer/${username}">
		<button onclick="myFunction()" class="button is-danger" type="submit">Delete all the answers</button>
		</form>
	</div>
	
	 <c:forEach var="test" items="${test}">
	${test.kayttajanimi}<br>
	 	${test.vastaus}	<br>
	 	comment ${test.kommentti} <br>
	 </c:forEach> 
	
	<script>
	 function testSession() {
        var childNumbers = "${sessionScope['test']}";
        alert(childNumbers);
     }
	
	function myFunction() {
	  alert("Are you sure you want to delete all your answers?");
	  alert("Records deleted.");	
	}
	window.onload = function() {
		checkRadios();
		};
	 function checkRadios() {
		 document.getElementById().checked = true;
	 }
	 function myFunction2(item, index) {
		  document.getElementById("demo").innerHTML += index + ":" + item + "<br>";
		}

	</script>
</body>
</html>