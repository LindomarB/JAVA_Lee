

package aula11_heranca_parte2;

/**
 *
 * @author Lbassetti
 */
public final class Bolsista extends Aluno{
    private int bolsa;
    public void renovarBolsa(){
        System.out.println("Renovando a bolsa");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
   
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando a mensalidade do bolsista ");
    }

}
