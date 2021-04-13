<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css">
</head>
<body>
${message}
<!-- Container - column relationship is pretty weird, so we need manual styling :) -->
	<div class="container is-max-desktop" style="width: 25%">
		<div class="column has-text-centered">
        	<h1 class="title">Candidate Login</h1>
        	<form class="box" action="../login" method="post">
        	
        		<!-- Username -->
        		<div class="field">
		            <label class="label" for="Kayttajanimi">
		            	Käyttäjänimi:
		            </label>
		            <div class="control">
		            	<input class="input" type="text" placeholder="Enter Username" autocomplete="username" name="Kayttajanimi" size="30" required/>
		            </div>
	            </div>
	            
	            <!-- Password -->
	            <div class="field">
		            <label class="label" for="Salasana">
		            	Salasana:
		            </label>
		            <div class="control">
		            	<input class="input" type="password" placeholder="Enter Password" autocomplete="current-password" name="Salasana" size="30" required/>
		            </div>
	            </div>
	                    
	            <!-- Buttons -->
				<button class="button is-success is-rounded" type="submit">Login</button>
        	</form>
   		</div>
	</div>
</body>

</html>