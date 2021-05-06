<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css">
<title>Add a new question</title>
</head>
<body>
	<div class="column is-half">
		<h1 class="title">Add a new question</h1>
		
		<form method="post" action="../rest/restful/addquestion">
			<div class="field">
				<label class="label">What is the new question?</label>
				<div class="control">
					<input class="input" type="text" placeholder="What do you want to ask?" name="kysymys" id="kysymys" required>
				</div>
			</div>
			<div class="field">
				<label class="label">
					<input type='submit' class="button is-success" name='submit' value="Send">
				</label>
			</div>
		</form>
	</div>
</body>
</html>