<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Candidate Login</title>
</head>
<body>
    <div style="text-align: center">
        <h1>Candidate Login</h1>
        <form action="../login" method="post">
            <label for="Kayttajanimi">Käyttäjänimi:</label>
            <input name="Kayttajanimi" size="30" />
            <br><br>
            <label for="Salasana">Salasana:</label>
            <input type="text" name="Salasana" size="30" />
            <br>${message}
            <br><br>           
            <button type="submit">Login</button>
        </form>
    </div>
</body>

</html>