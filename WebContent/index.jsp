<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html class="full" lang ="pt">
	<head>
		<title>Login Livraria</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="css/bootstrap.css">
		<link href="css/the-big-picture.css" rel="stylesheet">
	</head>
	<body background="img/livros-site.jpeg" >
		<div class="container">
			<div class="col-md-4">
			</div>
			<div class="col-md-4">
				<form action="LoginServlet" method="post">
					<h2 class="text-center">Bem vindo</h2>
					<div class="form-group">
					    <label for="vendedor">Login:</label>
					    <input type="text" class="form-control" id="vendedor" name="vendedor">
					</div>
					<div class="form-group">
					 	<label for="senha">Senha:</label>
					 	<input type="password" class="form-control" id="senha" name="senha">
					</div>
					<button type="submit" class="btn btn-success">Login</button>
					<button type="reset" class="btn btn-warning">Cancelar</button>
				</form>
				<c:if test="${not empty msgDoServidor}">
				<h2>Usuario ou Senha não cadastrados</h2>
			</c:if>
			</div>
			<div class="col-md-4">
			</div>
		</div>
	</body>
</html>


