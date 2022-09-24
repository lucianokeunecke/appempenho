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
	  
	  <h3>Cadastro de Fornecedor</h3>
	  
	  <h4><a href="/fornecedor">Novo</a></h4>
	  
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Código</th>
	        <th>Razão Social/Nome do Fornecedor</th>
	        <th>CNPJ/CPF</th>
	        <th>Usuário</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
	    
    	  <c:forEach var="b" items="${listagem}">
		      <tr>
		        <td>${b.id}</td>
		        <td>${b.codigo}</td>
		        <td>${b.nome}</td>
		        <td>${b.cnpjCpf}</td>
		        <td>${b.usuario.nome}</td>
		        <td><a href="/fornecedor/${b.id}/excluir">Excluir</a></td>
		      </tr>    	  
    	  </c:forEach>
    	  
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>