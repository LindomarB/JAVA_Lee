

package aula12_polimorfismo_parte1;
public class Mamifero extends Animal {
    private String corpelo;
    @Override
    public void locomover(){
        System.out.println("Correndo!");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("SOm do mamifero");
    }

    public String getCorpelo() {
        return corpelo;
    }

    public void setCorpelo(String corpelo) {
        this.corpelo = corpelo;
    }
    

}