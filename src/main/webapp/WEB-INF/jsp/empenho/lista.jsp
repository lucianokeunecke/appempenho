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

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  
	  <h3>Cadastro de Empenho</h3>
	  
	  <h4><a href="/empenho">Novo</a></h4>
	  
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nº do Empenho</th>
	        <th>Data da Emissão</th>
	        <th>Valor do Empenho</th>
	        <th>Fornecedor</th>
	        <th>Quantidade de Processos Licitatórios</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
	    
    	  <c:forEach var="b" items="${listagem}">
		      <tr>
		        <td>${b.id}</td>
		        <td>${b.numero}</td>
		        <td>${b.data}</td>
		        <td>${b.valor}</td>
		        <td>${b.fornecedor.nome}</td>
		        <td>${b.processosLicitatorios.size()}</td>
		        <td><a href="/empenho/${b.id}/excluir">Excluir</a></td>
		      </tr>    	  
    	  </c:forEach>
	    
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>