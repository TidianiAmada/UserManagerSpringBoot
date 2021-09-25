<%@ page isELIgnored="false" %><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h3>Marhabane bik</h3>
	<c:forEach items="${users}" var="us" varStatus="Status"> ${us.getName()} ${us.getEmail()}
		</c:forEach>
				
		
	
	<form action="addUser" method="post">
		<label for="email" >Adresse mail</label>
		<input type="email" name="email" id="email">
		<label for="name" >Nom d'utilisateur</label>
		<input type="text" name="name" id="name">
		<label for="password" >Mot de passe</label>
		<input type="password" name="password" id="password">
		<button type="submit" > Soumettre</button>
	</form>
</body>
</html>