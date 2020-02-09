package aula12_polimorfismo_parte1;

public class Aula12_Polimorfismo_parte1 {
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
        
        Canguru c = new Canguru();
        c.setPeso(55.6);
        System.out.println(c.getPeso());
    
}
}
    
