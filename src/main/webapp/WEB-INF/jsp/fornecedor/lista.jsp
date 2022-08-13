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
	        <a class="nav-link" href="/pregao/lista">Preg�o</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/tomadaPreco/lista">Tomada de Pre�o</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/processoLicitatorio/lista">Processo Licitat�rio</a>
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
	  
	  <h3>Classe: Fornecedor</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>C�digo</th>
	        <th>Raz�o Social/Nome do Fornecedor</th>
	        <th>CNPJ/CPF</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>156</td>
	        <td>Luciano Keunecke</td>
	        <td>031.897.456-07</td>
	      </tr>
	      <tr>
	        <td>274</td>
	        <td>Ind�stria e Com�rcio Arno Gartner Ltda</td>
	        <td>04.962.441/0001-52</td>
	      </tr>
	      <tr>
	        <td>297</td>
	        <td>Cia Hering</td>
	        <td>07.765.631/0001-74</td>
	      </tr>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>