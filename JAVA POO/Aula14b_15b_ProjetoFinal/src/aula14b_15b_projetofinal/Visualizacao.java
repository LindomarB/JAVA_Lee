

package aula14b_15b_projetofinal;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalassitido(this.espectador.getTotalassitido()+1);
        this.filme.setView(this.filme.getView()+1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    
    }
    public void avaliar(double porcentagem){
        int tot = 0;
        if(porcentagem <= 20.0){
            tot = 3;
        }else if(porcentagem <=50.0){
            tot = 5;
        }else if(porcentagem <=90.0){
            tot = 9;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

}
