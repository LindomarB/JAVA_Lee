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
import model.Tarefa;

/**
 *
 * @author All user
 */
public class TarefaDAO {
    private Connection conexao;
	private String clausula = null;
	private PreparedStatement pst = null;
	private Statement st;
	private ResultSet rs = null;
	private String teste;

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}

	public TarefaDAO() {
		conexao = new ConnectionFactory().getConexao();
	}

	public void inserir(Tarefa t) {
		clausula = "insert into tarefa(tarefa_id,tipo_id,tarefa_descricao,data_solicitacao,data_realizacao,data_limite,id_requisitante,id_executor) values(tarefa_contador.nextval,?,?,?,?,?,?,?)";
		
		try {
			pst = conexao.prepareStatement(clausula);
			pst.setInt(1, t.getTipoId());
			pst.setString(2, t.getTarefaDescricao());
                        pst.setString(3,t.getDtsolicitacao());
                        pst.setString(4,t.getDtrealizaçao());
                        pst.setString(5,t.getDtlimite());
                        pst.setInt(6, t.getIdRequisitante());
                        pst.setInt(7, t.getIdExecutor());
			pst.execute();
			conexao.commit();
			pst.close();

		} catch (SQLException e) {
                        System.out.println("erro ao inserir");
			e.printStackTrace();
			
		}
	}

	/*public void alterar(Tarefa p) {
		clausula = "update produto set produto_descricao=?,produto_preco=? where produto_id=?";
		try {
			pst = conexao.prepareStatement(clausula);
			pst.setString(1, p.getDescricao());
			pst.setDouble(2, p.getPreco());
			pst.setInt(3, p.getCodigo());
			pst.executeUpdate();
			conexao.commit();
			pst.close();

		} catch (SQLException e) {
			System.out.println("Erro ao alterar: " + e);
		}
	}

	public void excluir(int valor) {
		clausula = "delete from produto where produto_id = " + valor;
		try {
			st = conexao.createStatement();
			st.execute(clausula);
			conexao.commit();
			st.close();

		} catch (SQLException e) {
			System.out.println("Erro ao deletar: " + e);
		}
	}*/

	private ArrayList<Tarefa> lista = new ArrayList<>();

	public ArrayList<Tarefa> mostrarTodos() {
		clausula = "SELECT tarefa_id,TIPO_ID,TIPO_NOME,TAREFA_DESCRICAO,TAREFA.DATA_SOLICITACAO,tarefa.data_realizacao,tarefa.data_limite,REQ.USUARIO_ID as ID_REQ,REQ.USUARIO_APELIDO  as requer,EXC.USUARIO_ID as ID_EXC,EXC.USUARIO_APELIDO as executor\n" +
"FROM TAREFA\n" +
"JOIN\n" +
"TIPO ON\n" +
"TIPO.ID = TAREFA.TIPO_ID\n" +
"JOIN USUARIO REQ ON \n" +
"req.usuario_id= tarefa.id_requisitante join usuario exc on\n" +
"exc.usuario_id= tarefa.id_executor";
		try {
			st = conexao.createStatement();
			rs = st.executeQuery(clausula);
			while (rs.next()) {
				Tarefa t = new Tarefa();
				t.setTarefaId(rs.getInt("TAREFA_ID"));
				t.setTipoId(rs.getInt("Tipo_ID"));
                                t.setTipoNome(rs.getString("TIPO_NOME"));
				t.setTarefaDescricao(rs.getString("TAREFA_DESCRICAO"));
				t.setDtsolicitacao(rs.getString("DATA_SOLICITACAO"));
				t.setDtrealizaçao(rs.getString("DATA_REALIZACAO"));
				t.setDtlimite(rs.getString("DATA_LIMITE"));
                                t.setIdRequisitante(rs.getInt("ID_REQ"));
                                t.setApelidoRequisitante(rs.getString("requer"));
                                t.setIdExecutor(rs.getInt("ID_EXC"));
                                t.setApelidoExecutor(rs.getString("executor"));
				
				lista.add(t);
			}

		} catch (SQLException e) {
			System.out.println("erro ao mostrar todos: " + e);

		}
		return lista;
	}
        
        
        
        public ArrayList<Tarefa> mostrarTarefaUsuario(String nome) {
		clausula = "SELECT tarefa_id,TIPO_ID,TIPO_NOME,TAREFA_DESCRICAO,TAREFA.DATA_SOLICITACAO,tarefa.data_realizacao,tarefa.data_limite,REQ.USUARIO_ID as ID_REQ,REQ.USUARIO_APELIDO  as requer,EXC.USUARIO_ID as ID_EXC,EXC.USUARIO_APELIDO as executor\n" +
"FROM TAREFA\n" +
"JOIN\n" +
"TIPO ON\n" +
"TIPO.ID = TAREFA.TIPO_ID\n" +
"JOIN USUARIO REQ ON \n" +
"req.usuario_id= tarefa.id_requisitante join usuario exc on\n" +
"exc.usuario_id= tarefa.id_executor where REQ.USUARIO_APELIDO like '"+nome+"'";
		try {
			st = conexao.createStatement();
			rs = st.executeQuery(clausula);
			while (rs.next()) {
				Tarefa t = new Tarefa();
				t.setTarefaId(rs.getInt("TAREFA_ID"));
				t.setTipoId(rs.getInt("Tipo_ID"));
                                t.setTipoNome(rs.getString("TIPO_NOME"));
				t.setTarefaDescricao(rs.getString("TAREFA_DESCRICAO"));
				t.setDtsolicitacao(rs.getString("DATA_SOLICITACAO"));
				t.setDtrealizaçao(rs.getString("DATA_REALIZACAO"));
				t.setDtlimite(rs.getString("DATA_LIMITE"));
                                t.setIdRequisitante(rs.getInt("ID_REQ"));
                                t.setApelidoRequisitante(rs.getString("requer"));
                                t.setIdExecutor(rs.getInt("ID_EXC"));
                                t.setApelidoExecutor(rs.getString("executor"));
				//idtarefa,idtipo,tiponome,descricao,dtsolicitacao,dtrealizacao,dtlimite,idreq,reqapelido,idexc,excapelido
				lista.add(t);
			}

		} catch (SQLException e) {
			System.out.println("erro ao mostrar todos: " + e);

		}
		return lista;
	}

	public ArrayList<Tarefa> mostrarTarefa(String tarefaNome) {
            clausula = "SELECT tarefa_id,TIPO_ID,TIPO_NOME,TAREFA_DESCRICAO,TAREFA.DATA_SOLICITACAO,tarefa.data_realizacao,tarefa.data_limite,REQ.USUARIO_ID as ID_REQ,REQ.USUARIO_APELIDO  as requer,EXC.USUARIO_ID as ID_EXC,EXC.USUARIO_APELIDO as executor\n" +
"FROM TAREFA\n" +
"JOIN\n" +
"TIPO ON\n" +
"TIPO.ID = TAREFA.TIPO_ID\n" +
"JOIN USUARIO REQ ON \n" +
"req.usuario_id= tarefa.id_requisitante join usuario exc on\n" +
"exc.usuario_id= tarefa.id_executor where tarefa_descricao like '%" + tarefaNome + "%'";
		
                try {
			st = conexao.createStatement();
			rs = st.executeQuery(clausula);
			while (rs.next()) {
				Tarefa t = new Tarefa();
				t.setTarefaId(rs.getInt("TAREFA_ID"));
				t.setTipoId(rs.getInt("Tipo_ID"));
                                t.setTipoNome(rs.getString("TIPO_NOME"));
				t.setTarefaDescricao(rs.getString("TAREFA_DESCRICAO"));
				t.setDtsolicitacao(rs.getString("DATA_SOLICITACAO"));
				t.setDtrealizaçao(rs.getString("DATA_REALIZACAO"));
				t.setDtlimite(rs.getString("DATA_LIMITE"));
                                t.setIdRequisitante(rs.getInt("ID_REQ"));
                                t.setApelidoRequisitante(rs.getString("requer"));
                                t.setIdExecutor(rs.getInt("ID_EXC"));
                                t.setApelidoExecutor(rs.getString("executor"));
				
				lista.add(t);
			}

		} catch (SQLException e) {
			System.out.println("Erro ao mostrar o produto: " + e);

		}
		return lista;
	}
}
