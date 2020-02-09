
package aula5_contadebanco;


public class Aula5_ContadeBanco {

   
    public static void main(String[] args) {
     ContaBanco c1 = new ContaBanco();
     c1.setnumConta(81935446);
     c1.abrirConta("cp");
     c1.setDono("Malak Silva ");
     c1.setStatus(true);
     c1.mostra();
     c1.fecharConta();
        System.out.println("  ");
     ContaBanco c2 = new ContaBanco();
     c2.abrirConta("cc");
     c2.mostra();
    }
    
}
