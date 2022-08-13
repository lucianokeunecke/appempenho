<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="ISO-8859-1">
	<title>AppEmpenho</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-light navbar-light">
	  <div class="container-fluid">
	    <ul class="navbar-nav">
	      <li class="nav-item">
	        <a class="nav-link active" href="/">Home</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/concorrencia/lista">Concorr�ncia</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="pregao/lista">Preg�o</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#">Tomada de Pre�o</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#">Processo Licitat�rio</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#">Empenho</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#">Fornecedor</a>
	      </li>
	    </ul>
	  </div>
	</nav>

	<div class="container mt-3">
	  
	  <h3>Classe: Pregao</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>N�mero</th>
	        <th>Data da Expedi��o</th>
	        <th>Objeto da Licita��o</th>
	        <th>Registro de Pre�o</th>
	        <th>Crit�rio de Julgamento</th>
	        <th>Indice de Reajuste</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>356</td>
	        <td>03/07/2022</td>
	        <td>Contrata��o de materiais de consumo</td>
	        <td>Sim</td>
	        <td>Menor Pre�o</td>
	        <td>3,50</td>
	      </tr>
	      <tr>
	        <td>475</td>
	        <td>21/07/2022</td>
	        <td>Contrata��o de materiais de expediente</td>
	        <td>N�o</td>
	        <td>Maior Desconto</td>
	        <td>1,75</td>
	      </tr>
	      <tr>
	        <td>490</td>
	        <td>01/08/2022</td>
	        <td>Contrata��o de materiais de escrit�rio</td>
	        <td>Sim</td>
	        <td>Maior Lance ou Oferta</td>
	        <td>0,75</td>
	      </tr>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>