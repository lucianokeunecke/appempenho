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
	<div class="container mt-3">
	  <h2>AppEmpenho</h2>
	  <p>Projeto de Gest�o de Empenhos</p>
	  
	  <h3>Classe: Empenho</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descri��o</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>numero</td>
	        <td>int</td>
	        <td>N�mero do Empenho</td>
	      </tr>
	      <tr>
	        <td>data</td>
	        <td>LocalDateTime</td>
	        <td>Data da Emiss�o do Empenho</td>
	      </tr>
	      <tr>
	        <td>valor</td>
	        <td>float</td>
	        <td>Valor do Empenho</td>
	      </tr>
	    </tbody>
	  </table>
	  
	  
	  <h3>Classe: Fornecedor</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descri��o</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>codigo</td>
	        <td>int</td>
	        <td>C�digo do Fornecedor</td>
	      </tr>
	      <tr>
	        <td>nome</td>
	        <td>String</td>
	        <td>Nome/Raz�o Social do Fornecedor</td>
	      </tr>
	      <tr>
	        <td>cnpjCpf</td>
	        <td>float</td>
	        <td>CNPJ/CPF do Fornecedor</td>
	      </tr>
	    </tbody>
	  </table>
	  
	  
	  <h3>Classe: ProcessoLicitatorio</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descri��o</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>numero</td>
	        <td>int</td>
	        <td>N�mero do Processo Licitat�rio</td>
	      </tr>
	      <tr>
	        <td>dataExpedicao</td>
	        <td>LocalDateTime</td>
	        <td>Data da Expedi��o do Processo Licitat�rio</td>
	      </tr>
	      <tr>
	        <td>objetoLicitacao</td>
	        <td>String</td>
	        <td>Descri��o do Objeto da Licita��o</td>
	      </tr>
	    </tbody>
	  </table>	 
	  
	  
	  <h3>Classe: Concorrencia</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descri��o</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>eletronica</td>
	        <td>boolean</td>
	        <td>Indica se a Modalidade de Concorr�ncia � eletr�nica</td>
	      </tr>
	      <tr>
	        <td>prazoExecucao</td>
	        <td>String</td>
	        <td>Descri��o do prazo da execu��o</td>
	      </tr>
	      <tr>
	        <td>valorMinimoCapital</td>
	        <td>float</td>
	        <td>Valor m�nimo do capital</td>
	      </tr>
	    </tbody>
	  </table>	  
	   
	  
	  
	  
	</div>
</body>
</html>