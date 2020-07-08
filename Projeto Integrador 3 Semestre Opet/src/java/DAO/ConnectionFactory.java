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
                            ///rerornar depois da conexao  alterar a sessao com dia mes e ano
                            ////to_char(campo_data, 'dd/mm/yyyy' )

                    return conexao;
                } 
            }catch (Exception e) {
                    throw new RuntimeException("erro no CF"+e);
            }
            return conexao;
   
   
	
}

}