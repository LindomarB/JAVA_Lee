<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProdutoDao"%>
<%@page import="model.Produto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tienda del Chavo</title>
</head>
<body>
	<form action="index.jsp" method="post">
		<label>Descriçâo</label>
		<br>
		<input type="text" name="descricao">
		<br>
		<button type="submit">Ok</button>
	</form>
	<%
	try{
		out.print("<table>");   
		out.print("<tr>"); 
		out.print("<th>Código</th><th>Descrição</th><th>Preço</th><th>Editar</th><th>Excluir</th>");
		
		
		//Produto p = new Produto();
		
	        
		ProdutoDao pdalt = new ProdutoDao();// estabelece a conexão
	
	        
	        //mostar
	   
	        out.print(pdalt.mostrarProduto("<p>feijaoweb</b>"));
	        ArrayList<Produto> lista = new ArrayList<Produto>();
	        lista = pdalt.mostrarTodos();
	        System.out.println(lista); 
		
		
			//ArrayList<Produto> lista = prd.mostrarTodos();
			String teste ="OH LONG JHONSON!";
			for(int num =0; num< 10;num++){
				out.print("<tr>");
				out.print("<td>"+teste+"</td>");
				out.print("</tr>");
			}

	
		
		out.print("</tr>"); 
		out.print("</table>"); 
		
	}catch(Exception erro){
		throw new RuntimeException("ERRO NO INDEX"+erro);
	}
	%>
	<a href="inserir.jsp">novo</a>
</body>
</html>