import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	private static String url = "jdbc:oracle:thin:@localhost:1521: XE";
	private static String usuario = "aluno";
	private static String senha = "aluno";
	private static Connection conexao = null;
	public static Connection pegaConexao() {
		/// conexao
		if (conexao ==null) {
		try {
			conexao = DriverManager.getConnection(url,usuario,senha);
		} catch (SQLException e) {
			System.out.println("erro ao conectar "+e );			
		}
		System.out.println("conectou na factory");
		}
		return conexao;
		}
		public static void fechaConexao() {
				try {
					conexao.close();
					System.out.println("fechou a conexão");
				} catch (SQLException e) {
					System.out.println("erro ao fechar "+e);
				}
			}
		}
		
		

	

