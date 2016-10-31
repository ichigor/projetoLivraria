<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html class="full" lang="pt">
    <head>
    <title>Principal</title>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="css/bootstrap.css">
      <link href="css/the-big-picture.css" rel="stylesheet">
    </head>
    <body>
        <div class="navbar navbar-default navbar-static-top">
              <div class="container">
                  <div class="navbar-header">
                      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-ex-collapse">
                          <span class="sr-only">Toggle navigation</span>
                          <span class="icon-bar"></span>
                          <span class="icon-bar"></span>
                          <span class="icon-bar"></span>
                      </button>
                      <a class="navbar-brand" href="#"><span>Projeto Livraria</span></a>
                  </div>
                  <div class="collapse navbar-collapse" id="navbar-ex-collapse">
                      <ul class="nav navbar-nav navbar-right">
                          <li class="active">
                              <a href="principal.jsp">Home</a>
                          </li>
                          <li>
                              <a href="itenPedido.jsp">Venda</a>
                          </li>
                          <li>
                              <a href="PrincipalLivroServlet">Cadastrar Livros<br></a>
                          </li>
                          <li>
                              <a href="PrincipalClienteServlet">Cadastrar Cliente</a>
                          </li>
                          <li>
                              <a href="PrincipalVendedorServlet">Cadastrar Vendedor<br></a>
                          </li>
                      </ul>
                  </div>
              </div>
          </div>
    </body>
</html>
