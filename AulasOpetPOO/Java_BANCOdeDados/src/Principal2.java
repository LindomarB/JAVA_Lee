import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal2 {
	public static void main(String[] args) {
		
		Connection conexao = null;
		String consulta = null;
		PreparedStatement pst= null;
		ResultSet resultado= null;
		/// conexao
		try {
		conexao = ConnectionFactory.pegaConexao();
		System.out.println("conectou com factory");
		//select
			consulta = "select * from cadastro_pessoa";
			pst = conexao.prepareStatement(consulta);
			resultado = pst.executeQuery();
		// MOSTRA NA TELA	
			while(resultado.next()) {
				System.out.println(resultado.getString("PESSOA_ID")+" "+resultado.getString("PESSOA_NOME"));
			}
		// INSERIR UM REGISTRO NO BANCO
			consulta = "INSERT INTO CADASTRO_PESSOA  (PESSOA_ID, PESSOA_NOME, PESSOA_DOB, PESSOA_SEXO)  VALUES( PESSOA_SEQUENCE.NEXTVAL, 'PIA DE PREDIO', '4/12/1986', 'M')";
			pst = conexao.prepareStatement(consulta);
			pst.executeUpdate();
			conexao.commit();
			
	//inserir no banco metodo 2 
			consulta = "INSERT INTO CADASTRO_PESSOA  (PESSOA_ID, PESSOA_NOME, PESSOA_DOB, PESSOA_SEXO)  VALUES( PESSOA_SEQUENCE.NEXTVAL, ?, ?, ?)";
			pst = conexao.prepareStatement(consulta);
			pst.setString(1, "jose das cova silva");
			pst.setString(2, "12/12/1222");
			pst.setString(3, "M");
			pst.executeUpdate();
			conexao.commit();
			
			
			
			
			
		} catch (SQLException e) {
			System.out.println("erro ao conectar "+e );			
		}finally {
			try {
				resultado.close();
				pst.close();
				ConnectionFactory.fechaConexao();
				
			} catch (SQLException e) {
				System.out.println("erro ao fechar "+e);
			}
		}
	}
	}
