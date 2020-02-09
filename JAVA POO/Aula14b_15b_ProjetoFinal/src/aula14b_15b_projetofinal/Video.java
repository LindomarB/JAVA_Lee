

package aula14b_15b_projetofinal;

/**
 *
 * @author Lbassetti
 */
public class Video  implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int view;
    private int curtidas;
    private  boolean reproduzindo; 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int)(this.avaliacao + avaliacao)/2;
      
        this.avaliacao = nova;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    ///metodos da classe acoesVideo

    @Override
    public void play() {
        if(this.isReproduzindo()== false){
            this.setReproduzindo(true);
        }else{
            System.out.println("o video já esta reproduzindo");
        }        
    }

    @Override
    public void pause() {
       if(this.isReproduzindo()== true){
           this.setReproduzindo(false);
       }else{
           System.out.println("O Video já esta pausado");
       }
    }

    @Override
    public void like(){
        this.setCurtidas(this.getCurtidas()+1);
    }

    @Override
    public String toString() {
        return "Video{" + "titulo: " + titulo + ", avaliacao : " + avaliacao + ", views: " + view + ", curtidas: " + curtidas + ", reproduzindo: " + reproduzindo+ '}';
    }
    
    
}