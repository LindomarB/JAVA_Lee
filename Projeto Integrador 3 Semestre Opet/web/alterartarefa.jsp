<%-- 
    Document   : alterartarefa
    Created on : 01/06/2020, 17:32:53
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
        nao e preciso mostrar todos esses campos ao usuario somente <br>
        o que for pertinente a elem,<br>
        por traz ira carregar todos esses dados para enviar ao controller e executar a açao no banco<br>
        <h2>so e possivel alterar se a tarefa for do proprio usuario logado. obs ele pode alterar tarefas já concluidas?</h2>
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
                
                <label>Dtrealizacao:</label><br>
		<input type="text" name="dtrealizacao"value="<%=request.getParameter("dtrealizacao") %>"/><br>
                
                <label>Dtlimite:</label><br>
		<input type="text" name="dtlimite"value="<%=request.getParameter("dtlimite") %>"/><br>
                
                <label>id req:</label><br>
		<input type="text" name="idreq"value="<%=request.getParameter("idreq") %>"/><br>
                
                <label>apelido req:</label><br>
		<input type="text" name="reqapelido"value="<%=request.getParameter("reqapelido") %>"/><br>
                
                <label>id exc:</label><br>
		<input type="text" name="idexc"value="<%=request.getParameter("idexc") %>"/><br>
                
                <label>exc apelido:</label><br>
		<input type="text" name="execapelido"value="<%=request.getParameter("excapelido") %>"/><br>
		<button type="submit">
			OK
		</button>
	</form>
    </body>
</html>
