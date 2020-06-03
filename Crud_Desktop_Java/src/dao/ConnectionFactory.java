package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {
     
    private static String url = "jdbc:oracle:thin:@localhost:1521: XE";
    private static String usuario = "MERCADO";
    private static String senha = "MERCADO";
    private static Connection conexao = null;

    public Connection getConexao() {
        if (conexao == null) {
            try {
                conexao = DriverManager.getConnection(url, usuario, senha);
                    System.out.println("conectou!");
                } catch (SQLException e) {
                    System.out.println("Erro ao conectar: " + e);
                }
            }
            return conexao;
	}

}
