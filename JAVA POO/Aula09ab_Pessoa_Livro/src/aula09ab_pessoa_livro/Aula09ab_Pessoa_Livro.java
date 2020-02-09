package aula09ab_pessoa_livro;
public class Aula09ab_Pessoa_Livro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("JAO LEITERO",36, "Masculino");
        Livro c = new Livro("Zoonoze", "zezin Autor", 300,2,false,pessoa);
        Pessoa pes = new Pessoa("Jandira",40, "Feminino'");
        Livro d = new Livro("Comendo JAca", "zezin Autor", 120,5,false,pes);
        d.abrir();
        d.folear(4);
        d.detalhes();
        d.fechar();
        c.abrir();
        c.avancarPag();
        c.detalhes();
        c.fechar();
    }
    
}

