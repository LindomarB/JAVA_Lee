<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Produto"%>  
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
			Produto produto = new Produto();
			ProdutoDao produtodao= new ProdutoDao();
			if(request.getParameter("descricao").equals("")||request.getParameter("preco").equals("")){
				response.sendRedirect("index.jsp");
			}else{
				produto.setDescricao(request.getParameter("descricao"));
				produto.setPreco(Double.parseDouble(request.getParameter("preco")));
				produto.setCodigo(Integer.parseInt(request.getParameter("codigo")));
				produtodao.alterar(produto);
				response.sendRedirect("index.jsp");
			}
		}catch(Exception erro){
			throw new  RuntimeException("Erro executa alterar>"+erro);
		}
	
	
	%>
</body>
</html>