<%-- 
    Document   : concluitarefa
    Created on : 01/06/2020, 18:27:40
    Author     : All user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        idtarefa,idtipo,tiponome,descricao,dtsolicitacao,dtrealizacao,dtlimite,idreq,reqapelido,idexc,excapelido
        
        
    <br0<br><br>
        aqui eu jogo os datos todos por traz e se ele clickar em ok para concluir esta tarefa
        <br>
        <h2> ao clicar em ok ele altera no db somente a parte do executor e a data.</h2>
        <form action='HAL9000' method='post'>
		<label>id tarefa:</label><br>
		<input type="text" name="idtarefa" value="<%=request.getParameter("idtarefa") %>"/><br>
		 
		<label>Id tipo:</label><br>
		<input type="text" name="idtipo"value="<%=request.getParameter("idtipo") %>"/><br>
		
                <label>tiponome:</label><br>
		<input type="text" name="tiponome"value="<%=request.getParameter("tiponome") %>"/><br>
                
                <label>Descrição:</label><br>
		<input type="text" name="descricao"value="<%=request.getParameter("descricao") %>"/><br>
                
                <label>Dtsolicitacao:</label><br>
		<input type="text" name="dtsolicitacao"value="<%=request.getParameter("dtsolicitacao") %>"/><br>
                
                <label style="color: red">Dtrealizacao:</label><br>
		<input type="text" style="color: red" name="dtrealizacao"value="<%=request.getParameter("dtrealizacao") %>"/><br>
                
                <label>Dtlimite:</label><br>
		<input type="text" name="dtlimite"value="<%=request.getParameter("dtlimite") %>"/><br>
                
                <label>id req:</label><br>
		<input type="text" name="idreq"value="<%=request.getParameter("idreq") %>"/><br>
                
                <label>apelido req:</label><br>
		<input type="text" name="reqapelido"value="<%=request.getParameter("reqapelido") %>"/><br>
                
                <label style="color: red">id exc:</label><br>
		<input type="text" style="color: red" name="idexc"value="<%=request.getParameter("idexc") %>"/><br>
                
                <label style="color: red">exc apelido:</label><br>
		<input type="text" style="color: red" name="execapelido"value="<%=request.getParameter("excapelido") %>"/><br>
		<button type="submit">
			OK
		</button>
    </body>
</html>
