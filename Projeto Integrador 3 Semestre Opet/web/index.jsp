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
        <link rel="stylesheet" href="styles/index.css">
        <title>LOGIN</title>
        <script mconst adUnitPath = '/6355419/Travel/Europe/France/Paris';
const supportedSizes = [[728, 90], [300, 250]];

googletag.defineSlot(adUnitPath, supportedSizes, 'leaderboard0')
  .setTargeting('test', 'infinitescroll')
  .addService(googletag.pubads());></script>
    </head>
    <body>
       
        <div id="tela">
        <h1>Login</h1>
        <hr size="2px" color="black" width="80%">
        <form method="post" action="HAL9000">
            <p>Login:<input type="text" name="apelido"/></p>
            <p>Senha:<input type="password" name="senha"/></p>
            <input  hidden="hidden" type="text"  value="login" name="logica">
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
        <div id="ads"><p><b>aqui vai um banner de ads</b></p></div>
        
    </body>
</html>
