

package aula11_heranca_parte2;

/**
 *
 * @author Lbassetti
 */
public final class Tecnico extends Aluno {
    private String registro;
    public void praticar(){
        System.out.println(this.getNome()+"  esta praticando");
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    
}
