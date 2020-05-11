
package principal;

import dao.ConnectionFactory;
import dao.ProdutoDao;
import java.util.ArrayList;
import model.Produto;
import view.ProdutoView;

public class Run {
    public static void main(String[] args) {
        new ProdutoView().setVisible(true);
        // criar um Bean (objeto em memória que mapeia uma tabela)
        Produto p = new Produto();
	p.setDescricao("feijao99");
	p.setPreco(21.99);
        // criar um DAO
	ProdutoDao pd = new ProdutoDao();// estabelece a conexão
	// CREATE adiciona um registro
	//pd.inserir(p);
        
        
        //altera
        Produto palt = new Produto();
	palt.setDescricao("marmita 300kg");
	palt.setPreco(999.99);
        palt.setCodigo(6);
        // criar um DAO
	ProdutoDao pdalt = new ProdutoDao();// estabelece a conexão
	// CREATE adiciona um registro
	//pdalt.alterar(palt);
        
        //excluir
        //pdalt.excluir(7);
        
        //mostar
   
       /* System.out.println(pdalt.mostrarProduto("feijao"));
        ArrayList<Produto> lista = new ArrayList<Produto>();
        lista = pdalt.mostrarTodos();
        System.out.println(lista);*/
      
        
        
        
        
    }
}
