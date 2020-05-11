package br.com.lindomar.bancocomDao.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class FabricaDeConexoes {
	private static String url = "jdbc:oracle:thin:@localhost:1521: XE";
	private static String usuario = "aluno";
	private static String senha = "aluno";
	private static Connection conexao = null;

	public static Connection pegaConexao() {
		if (conexao == null) {
			try {
				conexao = DriverManager.getConnection(url, usuario, senha);
			} catch (SQLException e) {
				System.out.println("Erro ao conectar: " + e);
			}
		}
		return conexao;
	}

	public static void fechaConexao() {

		if (conexao != null) {
			try {
				conexao.close();
				System.out.println("Fechou a conexao");
			} catch (SQLException e) {
				System.out.println("Erro ao fechar: " + e);
			}
		}

	}
}

