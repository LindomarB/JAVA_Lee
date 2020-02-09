

package aula12_polimorfismo_parte1;

/**
 *
 * @author Lbassetti
 */
public class Ave extends Animal {
    private String corpena;
    public void fazerNinho(){
        System.out.println("ave esta fazendo um ninho ");
    }

    public String getCorpena() {
        return corpena;
    }

    public void setCorpena(String corpena) {
        this.corpena = corpena;
    }
    @Override
    public void locomover() {
        System.out.println("AVUANDO");
    }

    @Override
    public void alimentar() {
        System.out.println("CISCANDO");
    }

    @Override
    public void emitirSom() {
        System.out.println(" Som de AVE");
    }
}
