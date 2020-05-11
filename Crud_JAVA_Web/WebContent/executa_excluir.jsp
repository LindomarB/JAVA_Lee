<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<%@ page import="dao.ProdutoDao"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	try{
		
		ProdutoDao produtodao= new ProdutoDao();
		produtodao.excluir(Integer.parseInt(request.getParameter("codigo")));
		response.sendRedirect("index.jsp");
	}catch(Exception erro){
		throw new  RuntimeException("Erro executa Excluir>"+erro);
	}

	
	
	
	
	
	%>
</body>
</html>