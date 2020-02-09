

package aula10a_heranca_parte1;

/**
 *
 * @author Lbassetti
 */
public class Professor extends Pessoa {
    private String especialidade;
    private double salario;
    public void receberSalario(){
        this.setSalario(this.getSalario()+ 1000.00);
    
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

}
