<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html class="full" lang="pt">
	<head>
		<title>Cadastro Vendedor</title>
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
                        <li><a href="principal.jsp">Home</a></li>
                        <li><a href="itenPedido.jsp">Venda</a></li>
                        <li><a href="cadastrarLivro.jsp">Cadastrar Livros<br></a></li>
                        <li><a href="cadastrarCliente.jsp">Cadastrar Cliente</a></li>
                        <li class="active"><a href="cadastroVendedor.jsp">Cadastrar Vendedor<br></a></li>
                        <li><a href="listaLivros.jsp">Listar Livros<br></a></li>
                        <li><a href="listarClientes.jsp">Listar Clientes<br></a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="section">
          <div class="container">
            <div class="row">
              <div class="col-md-12">
                <form class="form-horizontal" role="form" action="VendedorServlet" method="POST">
                  <div class="form-group">
                    <div class="col-sm-2">
                      <label for="nomeVendedor" class="control-label">Nome</label>
                    </div>
                    <div class="col-sm-10">
                      <input name="nomeVendedor" type= "text" class="form-control"/>
                    </div>
                  </div>
                  <div class="form-group">
                    <div class="col-sm-2">
                      <label for="endVendedor" class="control-label">Endereço</label>
                    </div>
                    <div class="col-sm-10">
                       <input name="endVendedor" type= "text" class="form-control"/>
                    </div>
                  </div>
                  <div class="form-group">
                    <div class="col-sm-2">
                      <label for="salario" class="control-label">Salario:</label>
                    </div>
                    <div class="col-sm-10">
                      <input name="salario" type= "text" class="form-control"/>
                    </div>
                  </div>
                  <div class="form-group">
                    <div class="col-sm-2">
                      <label for="senha" class="control-label">Senha:</label>
                    </div>
                    <div class="col-sm-10">
                      <input type="password" name="senha" class="form-control"/>
                    </div>
                  </div>
                  <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                      <button type="submit" class="btn btn-default">Cadastrar</button>
                    </div>
                  </div>
                </form>
                <h2>Vendedores cadastrados</h2>
					<table style="width:100%;background-color: #7dc495">
						<thead >
							<tr>
								<th style="text-align:center">Nome</th>
								<th style="text-align:center">Endereco</th>
								<th style="text-align:center">Salario</th>
								<th style="text-align:center">Senha</th>
								<th style="text-align:center">Ações</th>
							</tr>
						</thead>
						<tfoot>
							<tr>
								<th style="text-align:center">Nome</th>
								<th style="text-align:center">Endereco</th>
								<th style="text-align:center">Salario</th>
								<th style="text-align:center">Senha</th>
								<th style="text-align:center">Ações</th>
							</tr>
						</tfoot>
						<c:forEach var="vendedor" items="${vendedores}">
							<tr>
								<td style="text-align:center">${vendedor.nomeVendedor}</td>
								<td style="text-align:center">${vendedor.endVendedor}</td>
								<td style="text-align:center">${vendedor.salario}</td>
								<td style="text-align:center">${vendedor.senha}</td>
								<td style="text-align:center">Alterar-Excluir</td>
							</tr>
						</c:forEach>
				</table>
              </div>
            </div>
          </div>
        </div>
            
	</body>
</html>
