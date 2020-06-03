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
    </head>
    <body>
        <form method="post" action="HAL9000">
            tipo: <input list="tipos" name="tipo"><br>
            <label for="descricao">Descrição da tarefa:</label><br>
            <textarea id="textarea" name="descricao" rows="4" cols="50" placeholder="digite seu texto aqui ">
                </textarea>
            <br><br>
            data solicitacao:<input type="text" value="25/05/2141" name="dtsolicitacao">
            data realizacao:<input type="text" value="" name="dtrealizacao">
            data limite:<input type="text" value="25/05/2020" name="dtlimite">
            id requisitinate e o mesmo do usuario logado:<input type="number" value="18" name="idrequisitante">
            id_executor: null<input type="number" value="17" name="idexecutor">
            <input  hidden="hidden" type="text"  value="novatarefa" name="logica">
            <input type="submit" value="Criar"/>
            
        </form>
        <datalist id="tipos">
        <option value="servico">
        <option value="doacao">
        <option value="voluntariado">
        
</datalist>
    </body>
</html>
