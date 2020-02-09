package aula13a_Sobrecarga;

public class Aula13a_Sobrecarga {
    public static void main(String[] args) {
        Mamifero man = new Mamifero();
        man.setPeso(81.6);
        man.setCorpelo("Cinza");
        man.setIdade(3);
        man.alimentar();
        man.locomover();
        man.emitirSom();
        System.out.println(""+man.toString());
        System.out.println("cor do pelo "+man.getCorpelo());
        Lobo lobo = new Lobo();
        lobo.emitirSom();
        Cachorro cao = new Cachorro();
        cao.emitirSom();
        cao.reagir("ola");
        cao.reagir("VAi apanhar");
        cao.reagir(11,45);
        cao.reagir(21,00);
        cao.reagir(true);
        cao.reagir(false);
        cao.reagir(2,12.5);
        cao.reagir(17,4.5);
        
    
}
}
    
