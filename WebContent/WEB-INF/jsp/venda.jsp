<!doctype html>
<html class="full" lang="pt">
<head>
	<title>Venda</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/bootstrap.css">
        <link href="../css/the-big-picture.css" rel="stylesheet">
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
                <form class="form-horizontal" role="form">
                  <div class="form-group">
                    <div class="col-sm-2">
                      <label for="inputPassword3" class="control-label">Cliente:</label>
                    </div>
                    <div class="col-sm-10">
                      <input type="search" class="form-control" id="inputPassword3" placeholder="Nome do cliente">
                    </div>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
        <div class="section">
          <div class="container">
            <div class="row">
              <div class="col-md-12">
                <table class="table">
                  <thead>
                    <tr>
                      <th>id</th>
                      <th>Titulo</th>
                      <th>Quantidade</th>
                      <th>Vendedor</th>
                      <th>Total</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>1</td>
                      <td>Lord of The rings</td>
                      <td>5</td>
                      <td>Teste</td>
                    </tr>
                    <tr>
                      <td>
                        <br>
                      </td>
                      <td>
                        <br>
                      </td>
                      <td>
                        <br>
                      </td>
                      <td>
                        <br>
                      </td>
                      <td>5000.00</td>
                    </tr>
                    <tr>
                      <td>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
        <div class="section">
          <div class="container">
            <div class="row">
              <div class="col-md-2">
                <a class="btn btn-primary">Confirmar Compra</a>
              </div>
              <div class="col-md-2">
                <a class="btn btn-danger">Cancelar</a>
              </div>
            </div>
          </div>
        </div>
      </body>
      </html>
