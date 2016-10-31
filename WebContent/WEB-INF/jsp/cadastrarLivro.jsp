<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html class="full" lang="pt">
<head>
<title>Cadastro Livro</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="css/bootstrap.css">
  <link href="css/the-big-picture.css" rel="stylesheet">
    </head><body>

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
                        <li class="active"><a href="cadastrarLivro.jsp">Cadastrar Livros<br></a></li>
                        <li><a href="cadastrarCliente.jsp">Cadastrar Cliente</a></li>
                        <li><a href="cadastroVendedor.jsp">Cadastrar Vendedor<br></a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="section">
          <div class="container">
            <div class="row">
              <div class="col-md-12">
                <form class="form-horizontal" role="form" action="LivroServlet" method="POST">
                  <div class="form-group"><div class="col-sm-2">
                    <label for="titulo" class="control-label">Titulo</label>
                  </div><div class="col-sm-10">
                     <input name="titulo" type= "text" class="form-control"/>
                  </div>
                </div>
                <div class="form-group">
                  <div class="col-sm-2">
                    <label for="autor" class="control-label">Autor:</label>
                  </div>
                  <div class="col-sm-10">
                     <input name="autor" type= "text" class="form-control"/>
                  </div>
                </div>
                <div class="form-group">
                  <div class="col-sm-2">
                    <label for="preco" class="control-label">Pre�o:<br></label>
                  </div>
                  <div class="col-sm-10">
                  	 <input name="preco" type= "text" class="form-control"/>
                  </div>
                </div>
                <div class="form-group">
                  <div class="col-sm-2">
                    <label for="quantidade" class="control-label">Quantidade Estoque:<br>
                    </label>
                  </div>
                  <div class="col-sm-10">
                  	 <input name="quantidade" type= "number" class="form-control"/>
                  </div>
                </div>
                <div class="form-group">
                  <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">Cadastrar</button>
                  </div>
                </div>
              </form>
              <h2>Livros cadastrados</h2>
					<table style="width:100%;background-color: #7dc495">
						<thead >
							<tr>
								<th style="text-align:center">Titulo</th>								
								<th style="text-align:center">Preco</th>
								<th style="text-align:center">Quantidade</th>
								<th style="text-align:center">Autor</th>
								<th style="text-align:center">A��es</th>
							</tr>
						</thead>
						<tfoot>
							<tr>
								<th style="text-align:center">Titulo</th>
								<th style="text-align:center">Preco</th>
								<th style="text-align:center">Quantidade</th>
								<th style="text-align:center">Autor</th>
								<th style="text-align:center">A��es</th>
							</tr>
						</tfoot>
						<c:forEach var="livro" items="${livros}">
							<tr>
								<td style="text-align:center">${livro.titulo}</td>	
								<td style="text-align:center">${livro.preco}</td>
								<td style="text-align:center">${livro.quantidade}</td>
								<td style="text-align:center">${livro.autor}</td>
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
