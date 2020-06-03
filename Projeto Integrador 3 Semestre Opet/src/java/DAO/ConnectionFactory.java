package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {
     
    private static String url = "jdbc:oracle:thin:@localhost:1521: XE";
    private static String usuario = "aluno";
    private static String senha = "aluno";
    private static Connection conexao =null;

    public static Connection getConexao() {
        
            try {
                if (conexao == null) {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    conexao = DriverManager.getConnection(url, usuario, senha);
             
                    return conexao;
                } 
            }catch (Exception e) {
                    throw new RuntimeException("erro no CF"+e);
            }
            return conexao;
   
   
	
}

}