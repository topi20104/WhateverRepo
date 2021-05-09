<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Home</title>
</head>
<body>
    <div style="text-align: center">
        <h1>Succesfully logged in</h1>
        <b>${user.kayttajanimi} (${user.salasana})</b>
        ${test}
        <br><br>
        <a href="/logout">Logout</a>
        <a href="../Questions">show questions</a>
    </div>
</body>
</html>