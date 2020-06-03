/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;

/**
CREATE TABLE USUARIO (
USUARIO_ID NUMBER NOT NULL,
USUARIO_NOME VARCHAR2(50) NOT NULL,
USUARIO_APELIDO VARCHAR2(50) NOT NULL,
USUARIO_SENHA VARCHAR(10) NOT NULL,
CONSTRAINT USUARIO_PK PRIMARY KEY (USUARIO_ID);

CREATE UNIQUE INDEX APELIDO ON USUARIO (USUARIO_APELIDO);

CREATE SEQUENCE USUARIO_CONTADOR
MINVALUE 1
MAXVALUE 100
INCREMENT BY 1
START WITH 1;
 */
public class UsuarioDAO {
    private Connection conexao = null;
    private String clausula = null;
    private PreparedStatement pst = null;
    private Statement st;
    private ResultSet rs = null;
    public  UsuarioDAO() {
		// 1 Conexao
		conexao = ConnectionFactory.getConexao();
	}
    public void adiciona(Usuario user) {

		clausula = "INSERT INTO USUARIO (USUARIO_ID, USUARIO_NOME, USUARIO_APELIDO, USUARIO_SENHA) VALUES(USUARIO_CONTADOR.NEXTVAL, ?, ?, ?)";
		try {
			pst = conexao.prepareStatement(clausula);
			pst.setString(1, user.getNome());
			pst.setString(2, user.getApelido());
			pst.setString(3, user.getSenha());
			pst.executeUpdate();
			conexao.commit();
			
		} catch (SQLException e) {
			
		} finally {
			if (conexao != null) {
				try {
                                    pst.close();
				} catch (SQLException e) {
					
				}
			}
		}
                
                
                
                
                
	}
    
    public List<Usuario> consulta() {
		// 3 Consultar registros
		clausula = "SELECT * FROM USUARIO";
		ArrayList<Usuario> lista = new ArrayList<>();
		try {
			pst = conexao.prepareStatement(clausula);
			rs = pst.executeQuery();
			//  carrega os dados para uma lista
			while (rs.next()) {
				Usuario user = new Usuario();
				user.setId(rs.getString("USUARIO_ID"));
				user.setNome(rs.getString("USUARIO_NOME"));
				user.setApelido(rs.getString("USUARIO_APELIDO"));
				user.setSenha(rs.getString("USUARIO_SENHA"));
				lista.add(user);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao consultar: " + e);
		} finally {
			if (conexao != null) {
				try {
					rs.close();
					pst.close();
					
				} catch (SQLException e) {
					System.out.println("Erro ao fechar: " + e);
				}
			}

		}
                return lista;
	}
    
    public ArrayList<Usuario> mostrarUsuario(String usuarioApelido,String usuarioSenha) {
		clausula = "select * from USUARIO where USUARIO_APELIDO ='"+usuarioApelido+"' AND USUARIO_SENHA= '"+usuarioSenha+"'";
                ArrayList<Usuario> lista = new ArrayList<>();
		try {
			st = conexao.createStatement();
			rs = st.executeQuery(clausula);
			while (rs.next()) {
				Usuario user= new Usuario();
				user.setId(rs.getString("USUARIO_ID"));
				user.setNome(rs.getString("USUARIO_NOME"));
				user.setApelido(rs.getString("USUARIO_APELIDO"));
                                user.setSenha(rs.getString("USUARIO_SENHA"));
				lista.add(user);
			}

		} catch (SQLException e) {
			System.out.println("Erro ao mostrar o produto: " + e);

		}
		return lista;
	}
     public ArrayList<Usuario> mostrarUsuario(String usuarioApelido) {
		clausula = "select * from USUARIO where USUARIO_APELIDO ='"+usuarioApelido+"'";
                ArrayList<Usuario> lista = new ArrayList<>();
		try {
			st = conexao.createStatement();
			rs = st.executeQuery(clausula);
			while (rs.next()) {
				Usuario user= new Usuario();
				user.setId(rs.getString("USUARIO_ID"));
				user.setNome(rs.getString("USUARIO_NOME"));
				user.setApelido(rs.getString("USUARIO_APELIDO"));
                                user.setSenha(rs.getString("USUARIO_SENHA"));
				lista.add(user);
			}

		} catch (SQLException e) {
			System.out.println("Erro ao mostrar o produto: " + e);

		}
		return lista;
	}
    
    
}
