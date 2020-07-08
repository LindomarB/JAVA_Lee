<%-- 
    Document   : excluirtarefa
    Created on : 01/06/2020, 17:37:45
    Author     : All user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Excuir tarefa</title>
        <link rel="stylesheet" href="styles/exclui.css">
    </head>
    <body>
        <div id="tela">
        <form action='HAL9000' method='post'>
            <h1>Excluir tarefa</h1>
            <hr size="2px" color="black" width="80%">
		
		<input type="text"hidden="hidden" name="idtarefa" Readonly value="<%=request.getParameter("idtarefa") %>"/>
		 
		
		<input type="text" hidden="hidden"name="idtipo" Readonly value="<%=request.getParameter("idtipo") %>"/>
		
                <label>tiponome:</label><br>
		<input type="text" name="tiponome"value="<%=request.getParameter("tiponome") %>"Readonly/><br>
                
                <label>Descrição:</label><br>
		<input type="text" name="descricao"value="<%=request.getParameter("descricao") %>"Readonly/><br>
                
                <label>Dtsolicitacao:</label><br>
		<input type="text" name="dtsolicitacao"value="<%=request.getParameter("dtsolicitacao") %>"Readonly/><br>
                
                <label>Dtrealizacao:</label><br>
		<input type="text" name="dtrealizacao"value="<%=request.getParameter("dtrealizacao") %>"Readonly/><br>
                
                <label>Dtlimite:</label><br>
		<input type="text" name="dtlimite"value="<%=request.getParameter("dtlimite") %>"Readonly/><br>
                
               
		<input type="text"hidden="hidden" name="idreq"value="<%=request.getParameter("idreq") %>"Readonly/>
                
                
		<input type="text" hidden="hidden"name="reqapelido"value="<%=request.getParameter("reqapelido") %>"Readonly/>
                
                
		<input type="text"  hidden="hidden" name="idexc"value="<%=request.getParameter("idexc") %>"Readonly/>
                
                <label>Executor:</label><br>
		<input type="text" name="execapelido"value="<%=request.getParameter("excapelido") %>"Readonly/><br>
                <input  hidden="hidden" type="text"  value="excluirtarefa" name="logica">
		<button type="submit">
			Excluir
		</button>
        </form>
        </div>
    </body>
</html>
