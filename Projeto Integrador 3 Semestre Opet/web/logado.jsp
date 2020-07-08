<%-- 
    Document   : logado
    Created on : 27/05/2020, 08:29:32
    Author     : All user
--%>

<%@page import="DAO.UsuarioDAO"%>
<%@page import="model.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Tarefa"%>
<%@page import="DAO.TarefaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logado</title>
        <link rel="stylesheet" href="lg.css">
    </head>
    <body>
        <%
           String nome = (String)request.getAttribute("usuario");
        out.println("<h2 style='text-align: center;'>Bem-vindo "+ nome+ "</h2>");
        Usuario usr = new Usuario();
        UsuarioDAO userdao= new UsuarioDAO();
        ArrayList<Usuario> u = userdao.mostrarUsuario(nome);
        
       String num="";
       for (Usuario elem : u) {
             num = elem.getId();
            
              
           }
       
      
       
       
       
        %>
        
        <div id="t1">
            <a href='tarefanova.jsp?usuario=<%=nome%>&id=<%=num%>'><button>Criar nova tarefa</button></a>
        </div>    
        <div id="t2">
        <h2>Tarefas abertas</h2>
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
                                
                               
                                out.print("<td><a href ='concluitarefa.jsp?idtarefa="+elemento.getTarefaId()+"&idtipo="+elemento.getTipoId()+"&descricao="+elemento.getTarefaDescricao()+"&tiponome="+elemento.getTipoNome()+"&dtrealizacao="+elemento.getDtrealizaçao()+"&dtsolicitacao="+elemento.getDtsolicitacao()+"&dtlimite="+elemento.getDtlimite()+"&idreq="+elemento.getIdRequisitante()+"&reqapelido="+elemento.getApelidoRequisitante()+"&idexc="+elemento.getIdExecutor()+"&excapelido="+elemento.getApelidoExecutor()+"&usuario="+nome+"&id="+num+"'>clique</a></td>");
                                
                               
				out.print("</tr>");
                    }	
	
	%>
        </table>
        </div>
        <div id="t3">
        <h2>Suas Tarefas</h2>
        
        
        <table border='1'>
		<tr>
                    <th>Tipo</th><th>Descriçao</th><th>requisitante</th><th>executor</th><th>dataS</th><th>dataR</th><th>dataL</th><th>editar</th><th>excluir</th>
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
                                out.print("<td><a href ='alterartarefa.jsp?idtarefa="+elemento2.getTarefaId()+"&idtipo="+elemento2.getTipoId()+"&descricao="+elemento2.getTarefaDescricao()+"&tiponome="+elemento2.getTipoNome()+"&dtrealizacao="+elemento2.getDtrealizaçao()+"&dtsolicitacao="+elemento2.getDtsolicitacao()+"&dtlimite="+elemento2.getDtlimite()+"&idreq="+elemento2.getIdRequisitante()+"&reqapelido="+elemento2.getApelidoRequisitante()+"&idexc="+elemento2.getIdExecutor()+"&excapelido="+elemento2.getApelidoExecutor()+"'>editar</a></td>");
                                out.print("<td><a href ='excluirtarefa.jsp?idtarefa="+elemento2.getTarefaId()+"&idtipo="+elemento2.getTipoId()+"&descricao="+elemento2.getTarefaDescricao()+"&tiponome="+elemento2.getTipoNome()+"&dtrealizacao="+elemento2.getDtrealizaçao()+"&dtsolicitacao="+elemento2.getDtsolicitacao()+"&dtlimite="+elemento2.getDtlimite()+"&idreq="+elemento2.getIdRequisitante()+"&reqapelido="+elemento2.getApelidoRequisitante()+"&idexc="+elemento2.getIdExecutor()+"&excapelido="+elemento2.getApelidoExecutor()+"'>excluir</a></td>");
                                
				
				
                               
                               
				out.print("</tr>");
                    }	
	
	%>
        </table>
        </div>
        <div id="t4">
            <h2>Tarefas Concluidas</h2>
             <table border='1'>
		<tr>
                    <th>Tipo</th><th>Descriçao</th><th>requisitante</th><th>executor</th><th>dataS</th><th>dataR</th><th>dataL</th>
                </tr> 
        <%
            TarefaDAO tdd = new TarefaDAO();
     
                ArrayList<Tarefa> lista3 = tdd.mostrarTodosCompletados();
                for (Tarefa elemento3 : lista3) {
                        out.print("<tr>");
				out.print("<td>"+elemento3.getTipoNome()+"</td>");
				out.print("<td>"+elemento3.getTarefaDescricao()+"</td>");
				out.print("<td>"+elemento3.getApelidoRequisitante()+"</td>");
				out.print("<td>"+elemento3.getApelidoExecutor()+"</td>");
                                out.print("<td>"+elemento3.getDtsolicitacao()+"</td>");
                                out.print("<td>"+elemento3.getDtrealizaçao()+"</td>");
                                out.print("<td>"+elemento3.getDtlimite()+"</td>");
				
				
                               
                               
				out.print("</tr>");
                    }	
	
	%>
        </table>
        </div>
       
    </body>
</html>
