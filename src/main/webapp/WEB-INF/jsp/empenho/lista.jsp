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
	        <a class="nav-link" href="/concorrencia/lista">Concorrência</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/pregao/lista">Pregão</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/tomadaPreco/lista">Tomada de Preço</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/processoLicitatorio/lista">Processo Licitatório</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/empenho/lista">Empenho</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/fornecedor/lista">Fornecedor</a>
	      </li>
	    </ul>
	  </div>
	</nav>

	<div class="container mt-3">
	  
	  <h3>Classe: Empenho</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Nº Empenho</th>
	        <th>Data da Emissão</th>
	        <th>Valor do Empenho</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>007500</td>
	        <td>21/07/2022</td>
	        <td>475,65</td>
	      </tr>
	      <tr>
	        <td>007565</td>
	        <td>02/08/2022</td>
	        <td>1.754,33</td>
	      </tr>
	      <tr>
	        <td>007598</td>
	        <td>12/08/2022</td>
	        <td>763,03</td>
	      </tr>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>