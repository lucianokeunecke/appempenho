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
	
	  <h2>Cadastro de Fornecedor</h2>
	  <form action="/fornecedor/incluir" method="post">
	    <div class="mb-3 mt-3">
	      <label>Código:</label>
	      <input type="number" class="form-control" placeholder="Entre com o código" name="codigo" min="1" max="99999999">
	    </div>
	    <div class="mb-3 mt-3">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome" name="nome">
	    </div>
	    <div class="mb-3 mt-3">
	      <label>CNPJ/CPF:</label>
	      <input type="number" class="form-control" placeholder="Entre com o cnpj/cpf" name="cnpjCpf" min="1" max="99999999999999">
	    </div>
	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>	  
	  
</body>
</html>