<%-- 
    Document   : cadastro
    Created on : 27/05/2020, 17:04:51
    Author     : All user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Usuario</title>
        <link rel="stylesheet" href="styles/cadastro.css">
    </head>
    <body>
        <div id="tela"><h2>Cadastrar</h2>
            <hr size="2px" color="black" width="80%">
        <form method="get" action="HAL9000">
            <p>Nome:<input type="text" name="nome"/></p>
            <p>Apelido:<input type="text" name="apelido"style='margin-right: 10px;'/></p>
            <p>Senha:<input type="text" name="senha" /></p>
            <input  hidden="hidden" type="text"  value="cadastra" name="logica">
            <input type="submit" value="cadastrar"style='margin-left: 140px;border-radius: 5px;'/>
           <%
            String mensagem = (String) request.getAttribute("mensagem");
		if (mensagem != null) {
                        out.print("<script>window.alert('"+mensagem+"')</script>");
                   
		}
        %> </div>
        <div id='ads'>outra div</div>
        </form>
    </body>
</html>
