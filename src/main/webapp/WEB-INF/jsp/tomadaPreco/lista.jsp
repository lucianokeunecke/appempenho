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
	
 	<c:if test="${not empty mensagem}">
		<div class="alert ${tipoMensagem}">
		  <strong>Informa��o</strong> ${mensagem}
		</div>
	</c:if>	
	  
	  <h3>Cadastro de Processo Licitat�rio: Tomada de Pre�o</h3>
	  
	  <h4><a href="/tomadaPreco">Novo</a></h4>
	  
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>N�mero</th>
	        <th>Data da Expedi��o</th>
	        <th>Objeto da Licita��o</th>
	        <th>Permite Subcontrata��o</th>
	        <th>Condi��o de Pagamento</th>
	        <th>Valor Estimado Dota��o Or�ament�ria</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
	      
    	  <c:forEach var="b" items="${listagem}">
		      <tr>
		        <td>${b.id}</td>
		        <td>${b.numero}</td>
		        <td>${b.dataExpedicao}</td>
		        <td>${b.objetoLicitacao}</td>
		        <td>${b.permiteSubcontratacao}</td>
		        <td>${b.condicaoPagamento}</td>
		        <td>${b.valorEstimadoDotacaoOrcamentaria}</td>
		        <td><a href="/tomadaPreco/${b.id}/excluir">Excluir</a></td>
		      </tr>    	  
    	  </c:forEach>
	      
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>