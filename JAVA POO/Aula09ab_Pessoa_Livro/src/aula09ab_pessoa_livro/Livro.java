

package aula09ab_pessoa_livro;
public class Livro implements Publicacoes {
    private String titulo;
    private String autor;
    private int totpaginas;
    private int paginaatual;
    private boolean aberto;
    private Pessoa leitor;
    
    public void detalhes(){
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Total de paginas: "+this.getTotpaginas());
        System.out.println("Pagina Atual:"+this.getPaginaatual());
        String r = this.isAberto()?"SIM":"NÃO";
        System.out.println("Esta Aberto: "+r);
        System.out.println("Leitor:" + leitor.getNome());
        System.out.println("Sexo : "+leitor.getSexo());
    }
    
    //contrutor

    public Livro(String titulo, String autor, int totpaginas, int paginaatual, boolean aberto,Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totpaginas = totpaginas;
        this.paginaatual = paginaatual;
        this.aberto = aberto;
        this.leitor = leitor;
    }
    //sets & gets

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotpaginas() {
        return totpaginas;
    }

    public void setTotpaginas(int totpaginas) {
        this.totpaginas = totpaginas;
    }

    public int getPaginaatual() {
        return paginaatual;
    }

    public void setPaginaatual(int paginaatual) {
        this.paginaatual = paginaatual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    // metodos da interface

    @Override
    public void abrir() {
        if (this.isAberto()== false){
            System.out.println("abrindo o livro");
            this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()== true){
            System.out.println("fechando o livro o livro");
            this.setAberto(true);
        }
    }

    @Override
    public void folear(int p) {
        if(p > this.getTotpaginas()){
        this.setPaginaatual(0);
            System.out.println("erro voce nao pode folear "+p+ " paginas pois o livro so possui " +this.getTotpaginas()+" paginas");
        }else{
            this.setPaginaatual(p);
        }
    }
    @Override
    public void avancarPag() {
        if (this.isAberto()== true && this.getPaginaatual()!=0 && this.getPaginaatual()< this.getTotpaginas()){
            this.setPaginaatual(this.getPaginaatual()+1);
        }else{
            System.out.println("Erro nao pode avancar para outra pagina ");
        }
    }

    @Override
    public void voltarPag() {
        if (this.isAberto()== true && this.getPaginaatual()<= this.getTotpaginas()&& this.getPaginaatual()!=0 ){
            this.setPaginaatual(this.getPaginaatual()-1);
        }else{
            System.out.println("Erro nao pode voltar mais paginas para outra pagina ");
        }
    }
    
    
    
            
}
