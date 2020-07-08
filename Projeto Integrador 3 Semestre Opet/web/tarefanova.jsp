<%-- 
    Document   : tarefanova
    Created on : 29/05/2020, 20:53:39
    Author     : All user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Criar nova Tarefa</title>
        <link rel="stylesheet" href="styles/novat.css">
    </head>
    <body>
        <div id="tela">
            <h1>Nova Tarefa</h1>
            <hr size="2px" color="black" width="80%">
        <form method="post" action="HAL9000">
            <label>Tipo</label><br>
            <input label="tipo" list="tipos" name="tipo"><br>
            <label for="descricao">Descrição da tarefa:</label><br>
            <textarea id="textarea" name="descricao" rows="2" cols="23" placeholder="digite seu texto aqui">
            </textarea><br>
            <label>data solicitacao:</label><br>
            <input type="text" value="08/07/2020" name="dtsolicitacao"><br>
            <label>data Realização:</label><br>
            <input type="text" value="" name="dtrealizacao"><br>
            <label>data Limite:</label><br>
            <input type="text" value="25/07/2020" name="dtlimite">
            <input type="number"  hidden="hidden" value="<%=request.getParameter("id") %>" name="idrequisitante"><br>
           
            <input type="test" hidden="hidden"value="<%=request.getParameter("usuario") %>" name="reqapelido"><br>
            
            <input type="number"hidden="hidden" value="0" name="idexecutor">
            <input  hidden="hidden" type="text"  value="novatarefa" name="logica">
            <input type="submit" value="Criar"/>
            
        </form>
        </div>
        <datalist id="tipos">
        <option value="servico">
        <option value="doacao">
        <option value="voluntariado">
        <option value="transporte">
        
</datalist>
    </body>
</html>
