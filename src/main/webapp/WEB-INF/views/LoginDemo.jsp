<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Demo</title>
</head>
<body>
<center>
<h1>Login Form</h1>
<form action="loginurl">
<h1>${errorkey}</h1>
<table>
<tr>
<td>Username:</td><td><input type="text" name="userName"></td>
</tr>
<tr>
<td>Password:</td><td><input type="password" name="password"></td>
</tr>
<tr>
<td><input type="submit" name="submit" value="login"></td>
</tr>
</table>
</form>
</center>
</body>
</html>