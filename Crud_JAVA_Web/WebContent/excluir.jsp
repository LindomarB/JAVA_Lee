<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action='executa_excluir.jsp' method='post'>
		<label>Código:</label><br>
		<input type="text" name="codigo" value="<%=request.getParameter("codigo")%>"/><br>
		 
		<label>Descrição:</label><br>
		<input type="text" name="descricao"value="<%=request.getParameter("descricao")%>"/><br>
		
		
		<button type="submit">
			OK
		</button>
	</form>
</body>
</html>