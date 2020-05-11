import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521: XE";
		String usuario = "aluno";
		String senha = "aluno";
		Connection conexao = null;
		String consulta = null;
		PreparedStatement pst= null;
		ResultSet resultado= null;
		/// conexao
		try {
			conexao = DriverManager.getConnection(url,usuario,senha);
			System.out.println("conectado!!");
			
			
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
				conexao.close();
				System.out.println("fechou a conexão");
			} catch (SQLException e) {
				System.out.println("erro ao fechar "+e);
			}
		}
		
		
		
	}

}
