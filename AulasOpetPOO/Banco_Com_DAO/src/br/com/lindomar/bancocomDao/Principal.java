package br.com.lindomar.bancocomDao;


import java.util.ArrayList;
import java.util.List;

import br.com.lindomar.bancocomDao.Model.Pessoa;
import br.com.lindomar.bancocomDao.Model.PessoaDAO;

public class Principal {
	public static void main(String[] args) {

		// criar um Bean (objeto em memória que mapeia uma tabela)
		Pessoa p = new Pessoa();
		p.setNome("maria");
		p.setNascimento("10/12/1960");
		p.setSexo("f");

		// criar um DAO
		PessoaDAO pd = new PessoaDAO();// estabelece a conexão
		// CREATE adiciona um registro
		pd.adiciona(p);

		List<Pessoa> lista = new ArrayList<>();
		// READ consulta registros
		lista = pd.consulta();
		
		//UPDATE altera um registro
		/*Pessoa palt = new Pessoa();
		palt.setId(4);
		palt.setNome("uM NOME OU UM INPUT");
		palt.setNascimento("DATEQUALQUER");
		pd.altera(palt);*/
		
		//DELETE remove um registro
		p.setId(7);
		pd.remove(p); 
		//mostrar
		System.out.println(lista);
		
		pd.fechaConexao();

	}
	
	
	
}


