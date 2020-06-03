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
        <title>JSP Page</title>
    </head>
    <body>
        <div><h2>pagina para cadastros do user</h2></div>
        <form method="get" action="HAL9000">
            nome:<input type="text" name="nome"/><br>
            apelido:<input type="text" name="apelido"/><br>
            senha:<input type="text" name="senha"/><br>
            <input  hidden="hidden" type="text"  value="cadastra" name="logica">
            <input type="submit" value="cadastrar"/>
           <%
            String mensagem = (String) request.getAttribute("mensagem");
		if (mensagem != null) {
			out.println(mensagem);
                   
		}
        %> 
        </form>
    </body>
</html>
