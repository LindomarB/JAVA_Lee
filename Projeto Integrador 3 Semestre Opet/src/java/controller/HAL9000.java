/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.TarefaDAO;
import DAO.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Tarefa;
import model.Usuario;

/**
 *
 * @author All user
 */
public class HAL9000 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>welcome to HAL9000 Controller</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HAL9000 at " + request.getContextPath() + "</h1>");
            out.print("<p>tipo: "+request.getParameter("tipo")+"</p>");
            out.print("<p> desc: "+request.getParameter("descricao")+"</p>");
            out.print("<p> data solici: "+request.getParameter("dtsolicitacao")+"</p>");
            out.print("<p>data reali: "+request.getParameter("dtrealizacao")+"</p>");
            out.print("<p>data limite: "+request.getParameter("dtlimite")+"</p>");
            out.print("<p> id do req: "+request.getParameter("idrequisitante")+"</p>");
            out.print("<p>id do exec: "+request.getParameter("idexecutor")+"</p>");
            
           
            ////////////////////INICIO LOGIN////////////////////////
            String acao = request.getParameter("logica");
            
            if(acao.equals("login")){
                TestaLogin teste = new TestaLogin();
                RequestDispatcher rd;
                if(teste.logar(request.getParameter("apelido"),request.getParameter("senha"))){
                    request.setAttribute("usuario", request.getParameter("apelido"));
                    rd = request.getRequestDispatcher("/logado.jsp");
                }else{
                    
                    request.setAttribute("mensagem", "Usuário não existente");
                    rd = request.getRequestDispatcher("/index.jsp");
                }
                    rd.forward(request,response);
            }
            /////////////////FIM LOGIM/////////////////////////////////////////
            
            ///////////////INICIO CADASTRA NOVO USUARIO////////////////////////
            if(acao.equals("cadastra")){
                RequestDispatcher rd;
                Usuario user = new Usuario();
                user.setNome(request.getParameter("nome"));
                user.setApelido(request.getParameter("apelido"));
                user.setSenha(request.getParameter("senha"));
                UsuarioDAO userDao = new UsuarioDAO();
                TestaLogin teste = new TestaLogin();
                if(teste.testaApelido(user.getApelido())){
                    request.setAttribute("mensagem", "Apelido ja utilizado escolha outro");
                    rd = request.getRequestDispatcher("/cadastro.jsp");
                    rd.forward(request,response);
                }
                userDao.adiciona(user);
                request.setAttribute("mensagem", "Usuário Criado com sucessor! voce já pode realizar o login");
                rd = request.getRequestDispatcher("/index.jsp");
                rd.forward(request,response);
                
            }
            ////////////////////FIM CADASTRA NOVO USUARIO///////////////////////
            
            /////////////////INICIO NOVA TAREFA/////////////////////
            if(acao.equals("novatarefa")){
                Tarefa t = new Tarefa();
                if(request.getParameter("tipo").equals("servico")){
                    t.setTipoId(1);
                }
                if(request.getParameter("tipo").equals("voluntariado")){
                    t.setTipoId(2);
                }
                if(request.getParameter("tipo").equals("doacao")){
                    t.setTipoId(3);
                }
                t.setTarefaDescricao(request.getParameter("descricao"));
                t.setDtsolicitacao(request.getParameter("dtsolicitacao"));
                t.setDtrealizaçao(request.getParameter("dtrealizacao"));
                t.setDtlimite(request.getParameter("dtlimite"));
                t.setIdRequisitante(Integer.parseInt(request.getParameter("idrequisitante")));
                t.setIdExecutor(Integer.parseInt(request.getParameter("idexecutor")));
                TarefaDAO tdao = new TarefaDAO();
                tdao.inserir(t);
            }
          
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
