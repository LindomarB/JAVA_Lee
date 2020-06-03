<%-- 
    Document   : index
    Created on : 26/05/2020, 23:02:09
    Author     : All user
--%>

<%@page import="java.util.Calendar"%>
<%@page import="java.text.DateFormat"%>
<%@page import="DAO.TarefaDAO"%>
<%@page import="java.util.Date"%>
<%@page import="model.Tarefa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 >Tela de login</h1>
        <div id="tela">
        <form method="post" action="HAL9000">
            <br>
            Login:<input type="text" name="apelido"/><br>
            Senha:<input type="password" name="senha"/>
            <input  hidden="hidden" type="text"  value="login" name="logica">
            <input  hidden="hidden" type="text"  value="null "name="descricao">
            <input type="submit" value="login" name="logica"/>
            <p>ainda não possui conta <a href="cadastro.jsp">click aqui</a></p>
        </form> 
        <%
            String mensagem = (String) request.getAttribute("mensagem");
		if (mensagem != null) {
			out.println(mensagem);
                   
		}
        %>
        
        </div>
        
    </body>
</html>
