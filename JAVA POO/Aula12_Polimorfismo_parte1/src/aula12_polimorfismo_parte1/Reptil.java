

package aula12_polimorfismo_parte1;

/**
 *
 * @author Lbassetti
 */
public class Reptil extends Animal {
    private String corescama;

    public String getCorescama() {
        return corescama;
    }

    public void setCorescama(String corescama) {
        this.corescama = corescama;
    }

    @Override
    public void locomover() {
        System.out.println("rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo mato");
    }

    @Override
    public void emitirSom() {
        System.out.println(" Som de REptil");
    }
    
}
