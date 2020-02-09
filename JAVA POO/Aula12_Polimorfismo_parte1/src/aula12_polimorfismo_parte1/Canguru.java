

package aula12_polimorfismo_parte1;

/**
 *
 * @author Lbassetti
 */
public class Canguru extends Mamifero {
    public void usarBolsa(){
        System.out.println("esta usando a bolsa");
    }
    @Override
    public void locomover(){
        System.out.println("pulando");
    }

}
