package br.com.lindomar.bancocomDao.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
CREATE TABLE PESSOA (
PESSOA_ID NUMBER NOT NULL,
PESSOA_NOME VARCHAR2(50) NOT NULL,
PESSOA_NASCIMENTO DATE,
PESSOA_SEXO VARCHAR2(1),
CONSTRAINT PESSOA_PK PRIMARY KEY (PESSOA_ID));

CREATE SEQUENCE PESSOA_CONTADOR
MINVALUE 1
MAXVALUE 1000
INCREMENT BY 1
START WITH 1;
 */

public class PessoaDAO { // classe que executa o CRUD de pessoa

	public PessoaDAO() {
		// 1º Conexao
		conexao = FabricaDeConexoes.pegaConexao();
		System.out.println("Conectou");
	}

	private Connection conexao = null;
	private String clausula = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;

	public void adiciona(Pessoa p) {

		// 2º Inserir um registro e forma mais elegante
		clausula = "INSERT INTO PESSOA (PESSOA_ID, PESSOA_NOME, PESSOA_NASCIMENTO, PESSOA_SEXO) VALUES(PESSOA_CONTADOR.NEXTVAL, ?, ?, ?)";
		try {
			pst = conexao.prepareStatement(clausula);
			pst.setString(1, p.getNome());
			pst.setString(2, p.getNascimento());
			pst.setString(3, p.getSexo());
			pst.executeUpdate();
			conexao.commit();
			System.out.println("Inseriu registro");
		} catch (SQLException e) {
			System.out.println("Erro ao inserir: " + e);
		} finally {
			if (conexao != null) {
				try {
					pst.close();
					// FabricaDeConexoes.fechaConexao();
				} catch (SQLException e) {
					System.out.println("Erro ao fechar: " + e);
				}
			}
		}
	}

	public List<Pessoa> consulta() {
		// 3º Consultar registros
		clausula = "SELECT * FROM PESSOA";
		ArrayList<Pessoa> lista = new ArrayList<>();
		try {
			pst = conexao.prepareStatement(clausula);
			rs = pst.executeQuery();
			// 4º carregar os dados para uma lista
			while (rs.next()) {
				Pessoa paux = new Pessoa();
				paux.setId(rs.getInt("PESSOA_ID"));
				paux.setNome(rs.getString("PESSOA_NOME"));
				paux.setNascimento(rs.getString("PESSOA_NASCIMENTO"));
				paux.setSexo(rs.getString("PESSOA_SEXO"));
				lista.add(paux);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao consultar: " + e);
		} finally {
			if (conexao != null) {
				try {
					rs.close();
					pst.close();
					// FabricaDeConexoes.fechaConexao();
				} catch (SQLException e) {
					System.out.println("Erro ao fechar: " + e);
				}
			}
			return lista;
		}
	}

	public void altera(Pessoa p) {
		 try {
			pst = conexao.prepareStatement("UPDATE PESSOA SET  PESSOA_NOME=? WHERE PESSOA_ID=?");
			// pst.setInt(4,p.getId());
			 pst.setString(1, p.getNome());
		     pst.setString(2, p.getNascimento());
			 //pst.setString(3, p.getSexo());
			 pst.setInt(3,p.getId());
			 pst.execute();
			 pst.close();
			 conexao.commit();
		} catch (SQLException e) {
			System.out.println("erro ao alterar " +e);
		}
		
	}

	public void remove(Pessoa p) {
		// código para remover um registro do banco
		try {
			pst = conexao.prepareStatement("DELETE FROM PESSOA WHERE PESSOA_ID=?");
			pst.setInt(1,p.getId());
			pst.execute(); 
			System.out.println("removeu registro");
			conexao.commit();
		} catch (SQLException e) {
			System.out.println("erro ao remover"+e);
			e.printStackTrace();
		}
		
	}

	public void fechaConexao() {
		if (conexao != null) {
			FabricaDeConexoes.fechaConexao();
		}
	}
}