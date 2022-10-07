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

	<c:set var="ativaBotao" value="" />

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	
	  <h2>Cadastro de Empenho</h2>
	  <form action="/empenho/incluir" method="post">
	  
	    <div class="mb-3 mt-3">
	      <label>N�mero:</label>
	      <input type="number" class="form-control" placeholder="Entre com o n�mero" name="numero" min="1" max="99999999">
	    </div>
	    
		<div class="mb-3 mt-3">
			<label>Data:</label> 
			<input type="datetime-local" class="form-control" placeholder="Entre com a data" name="data">
		</div>
	    
	    <div class="mb-3 mt-3">
	      <label>Valor:</label>
	      <input type="number" step="0.01" value="0.00" placeholder="0.00" class="form-control" placeholder="Entre com o valor" name="valor">
	    </div>	    
	    
	    <div class="mb-3 mt-3">
	    
	      <c:if test="${not empty fornecedores}">	
	      	<label>Fornecedor:</label>
			  <select name="fornecedor" class="form-control" id="sel1">
				  <c:forEach var="f" items="${fornecedores}">
				   	<option value="${f.id}">${f.nome}</option>
				  </c:forEach>
			  </select>	  
		  </c:if>
		  
	      <c:if test="${empty fornecedores}">	
	      	<label>N�o existem Fornecedores cadastrados</label>
	      	<c:set var="ativaBotao" value="disabled" />
		  </c:if>    
		      
	    </div>	    
	    
	    <div class="mb-3 mt-3">	    
		    <c:if test="${not empty processosLicitatorios}">
		      <label>Lista de Processos Licitat�rios:</label>
			  	<c:forEach var="p" items="${processosLicitatorios}">
					<div class="checkbox">
					  <label><input type="checkbox" name="processosLicitatorios" value="${p.id}"> ${p.objetoLicitacao}</label>
					</div>	      
			  	</c:forEach>
		    </c:if>
		    <c:if test="${empty processosLicitatorios}">
		      <label>N�o existem Processos Licitat�rios cadastrados</label>
		      <c:set var="ativaBotao" value="disabled" />
		    </c:if>
	    </div>	    
	    
	    <button ${ativaBotao} type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>	  
	  
</body>
</html>