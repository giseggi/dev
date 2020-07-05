<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<html>
<head>
	<title>Login</title>
</head>
<body>

	<h1>Login</h1>
	
	<form action = "login" method="post">

	ID: <input type="text" name="id" required="required"> <br>
	PASSWORD: <input type="password" name="password" required="required"> <br>


		<input type="submit" value="login">

	</form>

</body>

</html>
