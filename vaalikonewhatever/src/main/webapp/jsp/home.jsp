<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css">
<head>
<meta charset="utf-8">
<title>Home</title>
</head>
<body>
  <div class="container">
	
		<!-- Ancestor tile -->
		<div class="tile is-ancestor has-text-centered is-vertical">
		<!-- "Title" -->
			<div class="tile is-parent is-4 is-align-self-center">
		      <div class="tile is-parent">
		        <article class="tile is-child">
		          <p class="title">Choose your role</p>
		        </article>
		      </div>
	      </div>
	     <div class="tile is-parent is-12">
	      <!-- 4 smaller ones below -->
	     	<div class="tile is-parent is-6">
		        <a class="tile is-child notification is-info box title" href='../Questions'>
			      Candidate
			    </a>
			  </div>
  			  
			  <div class="tile is-parent is-6">
		        <a class="tile is-child notification is-info box title" href='/show_ehdokkaat'>
			      Admin
			    </a>
			  </div>
			</div>
		</div>
	</div>
</body>
</html>