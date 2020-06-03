<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProdutoDao"%>
<%@page import="dao.ConnectionFactory"%>
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
    <div style='background-color:#808080;width:22%;height: auto;margin-left: 30%;'>
	<%
        
	try{
		out.print("<table border='1'>");   
		out.print("<tr>"); 
		out.print("<th>Código</th><th>Descrição</th><th>Preço</th><th>Editar</th><th>Excluir</th>");
                out.print("</tr>"); 
		
		
	
	
		

	        
	        ProdutoDao pd = new ProdutoDao();
                if(request.getParameter("descricao")==""|| request.getParameter("descricao")==null){
                    ArrayList<Produto> lista = pd.mostrarProduto(request.getParameter("descricao"));
                    for(int num =0; num < lista.size();num++){
				out.print("<tr>");
				out.print("<td>"+lista.get(num).getCodigo()+"</td>");
				out.print("<td>"+lista.get(num).getDescricao()+"</td>");
				out.print("<td>"+lista.get(num).getPreco()+"</td>");
				out.print("<td><a href ='alterar.jsp?codigo="+lista.get(num).getCodigo()+"&descricao="+lista.get(num).getDescricao()+"&preco="+lista.get(num).getPreco()+"'>clique</a></td>");
				out.print("<td><a href ='excluir.jsp?codigo="+lista.get(num).getCodigo()+"&descricao="+lista.get(num).getDescricao()+"'>clique</a></td>");
				out.print("</tr>");
			}
                }else{
                     ArrayList<Produto> lista = pd.mostrarProduto(request.getParameter("descricao"));
                    for(int num =0; num < lista.size();num++){
				out.print("<tr>");
				out.print("<td>"+lista.get(num).getCodigo()+"</td>");
				out.print("<td>"+lista.get(num).getDescricao()+"</td>");
				out.print("<td>"+lista.get(num).getPreco()+"</td>");
				out.print("<td><a href ='alterar.jsp?codigo="+lista.get(num).getCodigo()+"&descricao="+lista.get(num).getDescricao()+"&preco="+lista.get(num).getPreco()+"'>clique</a></td>");
				out.print("<td><a href ='excluir.jsp?codigo="+lista.get(num).getCodigo()+"&descricao="+lista.get(num).getDescricao()+"'>clique</a></td>");
				out.print("</tr>");
			}
                }
		
		
	
	
		
		
		out.print("</table>"); 
		
	}catch(Exception erro){
		throw new RuntimeException("ERRO NO INDEX"+erro);
	}
	%>
	<a href="inserir.jsp">novo</a>
</div>
</body>
</html>