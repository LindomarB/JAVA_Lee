

package aula12_polimorfismo_parte1;

/**
 *
 * @author Lbassetti
 */
public class Peixe extends Animal{
    private String corescama;
    public void soltarBolha(){
        System.out.println("soltando bolhas! ");
    }

    public String getCorescama() {
        return corescama;
    }

    public void setCorescama(String corescama) {
        this.corescama = corescama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando ");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo COisas na agua");
    }

    @Override
    public void emitirSom() {
        System.out.println(" NAO EMITE SOM");
    }
    

}
