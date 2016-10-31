<!doctype html>
<html class="full" lang="pt">
<head>
<title>Carrinho</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="../css/bootstrap.css">
  <link href="../css/the-big-picture.css" rel="stylesheet">
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
                        <li class="active"><a href="itenPedido.jsp">Venda</a></li>
                        <li><a href="cadastrarLivro.jsp">Cadastrar Livros<br></a></li>
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
                <form action="venda.jsp" method="post">
        					<div class="form-group">
        					    <label for="nomeLivro">Livro:</label>
        					    <input type="text" class="form-control" id="nomeLivro" name="nomeLivro">
        					</div>
        					<div class="form-group">
        					 	<label for="livroQuantidade">Quantidade:</label>
        					 	<input type="text" class="form-control" id="livroQuantidade" name="livroQuantidade">
        					</div>
        					<button type="submit" class="btn btn-success">Proximo</button>
        					<button type="reset" class="btn btn-warning">Cancelar</button>
        				</form>
              </div>
            </div>
          </div>
        </div>

      </body>
      </html>
