package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Produto;


public class ProdutoDao {
   private Connection conexao =null; 
   private String clausula = null;
   private PreparedStatement pst = null;
   private Statement st;
   private ResultSet rs = null;
   
   public ProdutoDao(){
       conexao = new ConnectionFactory().getConexao();
   }
   public void inserir(Produto p){
        clausula = "insert into produto(produto_id,produto_descricao,produto_preco) values(produto_sequence.nextval,?,?)";
	//clausula ="insert into teste (id,nome,preco) values (nextval('produto_sequence'),'mucilon',35.7);";
        try {
           pst = conexao.prepareStatement(clausula);
           pst.setString(1, p.getDescricao());
           pst.setDouble(2, p.getPreco());
           pst.execute();
           conexao.commit();
           pst.close();
     
	} catch (SQLException e) {
		//e.printStackTrace();
                System.out.println("erro ao alterar");
	} 
    }
   
   public void alterar(Produto p){
        clausula = "update produto set produto_descricao=?,produto_preco=? where produto_id=?";
	try {    
            pst = conexao.prepareStatement(clausula);
            pst.setString(1,p.getDescricao());
            pst.setDouble(2,p.getPreco());
            pst.setInt(3,p.getCodigo());
            pst.executeUpdate();
            conexao.commit();
            pst.close();
            
	} catch (SQLException e) {
		System.out.println("Erro ao alterar: " + e);
	} 
    }
   
    public void excluir(int valor){
        clausula = "delete from produto where produto_id = "+valor;
	try {
            st = conexao.createStatement();
            st.execute(clausula);
            conexao.commit();
            st.close();
            
	} catch (SQLException e) {
		System.out.println("Erro ao deletar: " + e);
	} 
    }
    
    private ArrayList<Produto> lista = new ArrayList<>();
    public ArrayList<Produto> mostrarTodos(){
        clausula = "select * from produto";
	try {
            st = conexao.createStatement();
            rs = st.executeQuery(clausula);
            while(rs.next()){
                Produto produto = new Produto();
                produto.setCodigo(rs.getInt("PRODUTO_ID"));
                produto.setDescricao(rs.getString("PRODUTO_DESCRICAO"));
                produto.setPreco(rs.getDouble("PRODUTO_PRECO"));
                lista.add(produto);
            }
           
	} catch (SQLException e) {
		System.out.println("erro ao mostrar todos: " + e);

        } 
        return lista;
    }
    
    
    public ArrayList<Produto> mostrarProduto(String produtoNome){
        clausula = "select * from produto where produto_descricao like '%"+produtoNome+"%'";
	try {
            st = conexao.createStatement();
            rs = st.executeQuery(clausula);
            while(rs.next()){
                Produto produto = new Produto();
                produto.setCodigo(rs.getInt("PRODUTO_ID"));
                produto.setDescricao(rs.getString("PRODUTO_DESCRICAO"));
                produto.setPreco(rs.getDouble("PRODUTO_PRECO"));
                lista.add(produto);
            }
            
	} catch (SQLException e) {
		System.out.println("Erro ao mostrar o produto: " + e);

        } 
        return lista;
    }
}
    
   

   













