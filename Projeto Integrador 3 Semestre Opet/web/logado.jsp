<%-- 
    Document   : logado
    Created on : 27/05/2020, 08:29:32
    Author     : All user
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Tarefa"%>
<%@page import="DAO.TarefaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
           String nome = (String)request.getAttribute("usuario");
        out.println("<h2>Bem-vindo "+ nome+ "</h2>");
        %>
        <p>talves aqui eu deva colocar dus listas uma geral sem o botao de editar e excluir soment com o<br> botao de realizar(alterar) e outro 
        tabela somente de tarefas do usuario contendo editar e excluir</p>
        <h3>talves eu deva colocar uma outra tabela com uma consulta somente das tabelas onde o executor seja null</h3>
        <h2> Tabela de tarefas concluidas</h2>
        <table border='1'>
		<tr>
		<th>Tipo</th><th>Descriçao</th><th>requisitante</th><th>executor</th><th>conclur</th>
                </tr> 
        <%
            TarefaDAO pd = new TarefaDAO();
     
                ArrayList<Tarefa> lista = pd.mostrarTodos();
                for (Tarefa elemento : lista) {
                        out.print("<tr>");
				out.print("<td>"+elemento.getTipoNome()+"</td>");
				out.print("<td>"+elemento.getTarefaDescricao()+"</td>");
				out.print("<td>"+elemento.getApelidoRequisitante()+"</td>");
				out.print("<td>"+elemento.getApelidoExecutor()+"</td>");
                                
                               
                                out.print("<td><a href ='concluitarefa.jsp?idtarefa="+elemento.getTarefaId()+"&idtipo="+elemento.getTipoId()+"&descricao="+elemento.getTarefaDescricao()+"&tiponome="+elemento.getTipoNome()+"&dtrealizacao="+elemento.getDtrealizaçao()+"&dtsolicitacao="+elemento.getDtsolicitacao()+"&dtlimite="+elemento.getDtlimite()+"&idreq="+elemento.getIdRequisitante()+"&reqapelido="+elemento.getApelidoRequisitante()+"&idexc="+elemento.getIdExecutor()+"&excapelido="+elemento.getApelidoExecutor()+"'>clique</a></td>");
                                
                               
				out.print("</tr>");
                    }	
	
	%>
        </table>
        <h2>Suas Tarefas</h2>
        <a href="tarefanova.jsp">Criar nova tarefa</a>
        <table border='1'>
		<tr>
                    <th>Tipo</th><th>Descriçao</th><th>requisitante</th><th>executor</th><th>dataS</th><th>dataR</th><th>dataL</th><th>editar</th><th>escluir</th>
                </tr> 
        <%
            TarefaDAO td = new TarefaDAO();
     
                ArrayList<Tarefa> lista2 = td.mostrarTarefaUsuario(nome);
                for (Tarefa elemento2 : lista2) {
                        out.print("<tr>");
				out.print("<td>"+elemento2.getTipoNome()+"</td>");
				out.print("<td>"+elemento2.getTarefaDescricao()+"</td>");
				out.print("<td>"+elemento2.getApelidoRequisitante()+"</td>");
				out.print("<td>"+elemento2.getApelidoExecutor()+"</td>");
                                out.print("<td>"+elemento2.getDtsolicitacao()+"</td>");
                                out.print("<td>"+elemento2.getDtrealizaçao()+"</td>");
                                out.print("<td>"+elemento2.getDtlimite()+"</td>");
                                out.print("<td><a href ='alterartarefa.jsp?idtarefa="+elemento2.getTarefaId()+"&idtipo="+elemento2.getTipoId()+"&descricao="+elemento2.getTarefaDescricao()+"&tiponome="+elemento2.getTipoNome()+"&dtrealizacao="+elemento2.getDtrealizaçao()+"&dtsolicitacao="+elemento2.getDtsolicitacao()+"&dtlimite="+elemento2.getDtlimite()+"&idreq="+elemento2.getIdRequisitante()+"&reqapelido="+elemento2.getApelidoRequisitante()+"&idexc="+elemento2.getIdExecutor()+"&excapelido="+elemento2.getApelidoExecutor()+"'>clique</a></td>");
                                out.print("<td><a href ='excluirtarefa.jsp?idtarefa="+elemento2.getTarefaId()+"&idtipo="+elemento2.getTipoId()+"&descricao="+elemento2.getTarefaDescricao()+"&tiponome="+elemento2.getTipoNome()+"&dtrealizacao="+elemento2.getDtrealizaçao()+"&dtsolicitacao="+elemento2.getDtsolicitacao()+"&dtlimite="+elemento2.getDtlimite()+"&idreq="+elemento2.getIdRequisitante()+"&reqapelido="+elemento2.getApelidoRequisitante()+"&idexc="+elemento2.getIdExecutor()+"&excapelido="+elemento2.getApelidoExecutor()+"'>clique</a></td>");
                                
				
				
                               
                               
				out.print("</tr>");
                    }	
	
	%>
        </table>
    </body>
</html>
