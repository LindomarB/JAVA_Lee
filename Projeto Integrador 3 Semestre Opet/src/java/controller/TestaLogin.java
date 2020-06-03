/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.UsuarioDAO;
import java.util.List;
import model.Usuario;

/**
 *
 * @author All user
 */
public class TestaLogin {
    
    
    public boolean logar(String nome,String senha){
        Usuario usuario = new Usuario();
        usuario.setApelido(nome);
        usuario.setSenha(senha);
        UsuarioDAO usuarioDao = new UsuarioDAO();
        List<Usuario> lista = usuarioDao.mostrarUsuario(nome, senha);
            String usr="a";
            String pwd="b";
            for (Usuario usuario1 : lista) {
                usr = usuario1.getApelido();
                pwd = usuario1.getSenha();
            }
        if(usuario.getApelido().equals(usr)&& usuario.getSenha().equals(pwd)){
            return true;
    
        }  else{
            return false;
        }
    }
        
        public Boolean testaApelido(String nome){
        Usuario usuario = new Usuario();
        usuario.setApelido(nome);
        UsuarioDAO usuarioDao = new UsuarioDAO();
        List<Usuario> lista2 = usuarioDao.mostrarUsuario(nome);
            String usr="a";
            for (Usuario usuario1 : lista2) {
                usr = usuario1.getApelido();
            }
        if(usuario.getApelido().equals(usr)){
            return true;
    
        }  else{
            return false;
        } 
        
           
        
        
    
}
}