
package aula02b_classes_e_objetos;

public class Aula02b_Classes_e_Objetos {

      
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic arco-iris";
        c1.cor = "Azul";
        c1.ponta =  0.5;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        System.out.println(" \t");
        Caneta c2 = new Caneta();
        c2.modelo = "Galopante Carmesim";
        c2.cor = "Vermelha";
        c2.ponta =  1.0;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    
} 

}