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
        <title>Alterar tarefa</title>
        <link rel="stylesheet" href="styles/alteratarefa.css">
    </head>
    <body>
       
        
        <div id="tela">
            <h1>Alterar tarefa</h1>
            <hr size="2px" color="black" width="80%">
            <form action='HAL9000' method='get'>
		
		<input type="text" hidden="hidden" name="idtarefa" value="<%=request.getParameter("idtarefa") %>"/>
		 
		
		<input type="text" hidden="hidden" name="idtipo"value="<%=request.getParameter("idtipo") %>"/>
                
		
                <label>Tipo:</label><br>
                <input list="tipos" name="tipo" placeholder="<%=request.getParameter("tiponome") %>"><br>
		
                <label>Descrição:</label><br>
		<input type="text" name="descricao"value="<%=request.getParameter("descricao") %>"/><br>
               
                <label>Dtsolicitacao:</label><br>
		<input type="text" name="dtsolicitacao"value="<%=request.getParameter("dtsolicitacao") %>"/><br>
                
                <label>Dtrealizacao:</label><br>
		<input type="text" name="dtrealizacao"value="<%=request.getParameter("dtrealizacao") %>"/><br>
                
                <label>Dtlimite:</label><br>
		<input type="text" name="dtlimite"value="<%=request.getParameter("dtlimite") %>"/><br>
                
               
		<input type="text" hidden="hidden" name="reqapelido"value="<%=request.getParameter("reqapelido") %>"/>
    
                
		<input type="text" hidden="hidden" name="idexc"value="<%=request.getParameter("idexc") %>"/>
                
                <label>Executor:</label><br>
		<input type="text" name="execapelido" Readonly value="<%=request.getParameter("excapelido") %>"/><br>
                
                
                <input  hidden="hidden" type="text"  value="alteratarefa" name="logica">
		<button type="submit">
			Alterar
		</button>
	</form>
        </div>        
        <datalist id="tipos">
        <option value="servico">
        <option value="doacao">
        <option value="voluntariado">
        <option value="transporte">
         
    </body>
</html>
