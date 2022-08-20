<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	  
	  <h3>Classe: TomadaPreco</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>N�mero</th>
	        <th>Data da Expedi��o</th>
	        <th>Objeto da Licita��o</th>
	        <th>Permite Subcontrata��o</th>
	        <th>Condi��o de Pagamento</th>
	        <th>Valor Estimado Dota��o Or�ament�ria</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>501</td>
	        <td>08/07/2022</td>
	        <td>Contrata��o de empresa especializada em servi�o de limpeza</td>
	        <td>Sim</td>
	        <td>30/60/90 dias</td>
	        <td>150.000,00</td>
	      </tr>
	      <tr>
	        <td>515</td>
	        <td>18/07/2022</td>
	        <td>Contrata��o de exames laboratoriais</td>
	        <td>N�o</td>
	        <td>45/90 dias</td>
	        <td>475.000,00</td>
	      </tr>
	      <tr>
	        <td>527</td>
	        <td>13/08/2022</td>
	        <td>Contrata��o de empresa especializada em servi�os de contru��o civil</td>
	        <td>N�o</td>
	        <td>15/30/45/60/75/90 dias</td>
	        <td>650.000,00</td>
	      </tr>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>