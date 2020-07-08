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
        <title>Conclui tarefa</title>
        <link rel="stylesheet" href="styles/conc.css">
    </head>
    <body>
      
        <div id="principal">
        <form action='HAL9000' method='post'>
            <h2>Concluir Tarefa</h2>
            <hr size="2px" color="black" width="80%">
		
		<input type="text" hidden="hidden" name="idtarefa" value="<%=request.getParameter("idtarefa") %>"/><br>
		 
		
		<input type="text"hidden="hidden" name="idtipo"value="<%=request.getParameter("idtipo") %>"/><br>
		
               <label>Tipo da tarefa:</label><br>
               <input type="text" name="tiponome"value="<%=request.getParameter("tiponome") %>"/></br>
               <label>Descricao:</label><br>
               <input type="text" name="descricao"value="<%=request.getParameter("descricao") %>"/><br>
                
                <label>Data solicitacao:</label><br>
		<input type="text" name="dtsolicitacao"value="<%=request.getParameter("dtsolicitacao") %>"/><br>
                
                <label style="color: red">Data realizacao:</label><br>
		<input type="text" style="color: red" name="dtrealizacao"value="<%=request.getParameter("dtrealizacao") %>"/><br>
                
                <label>Data limite:</label><br>
		<input type="text"  name="dtlimite"value="<%=request.getParameter("dtlimite") %>"/><br>
                
		<input type="text" hidden="hidden" name="idreq"value="<%=request.getParameter("idreq") %>"/>
                
                <label>apelido req:</label><br>
		<input type="text" name="reqapelido"value="<%=request.getParameter("reqapelido") %>"/><br>
                
               
		<input type="text" hidden="hidden"  name="idexc"value="<%=request.getParameter("id") %>"/>
                
                <label >exc apelido:</label><br>
		<input type="text"  name="execapelido"value="<%=request.getParameter("usuario") %>"/><br>
		<input  hidden="hidden" type="text"  value="concluirtarefa" name="logica">
                <button type="submit">
			OK
		</button>
        </form>
        </div>        
    </body>
</html>
