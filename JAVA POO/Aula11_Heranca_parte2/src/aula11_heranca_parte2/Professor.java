

package aula11_heranca_parte2;

/**
 *
 * @author Lbassetti
 */
public  final class Professor extends Pessoa {
    private String especialidade;
    private double salario;
    public void receberSalario(){
        this.setSalario(this.getSalario()+ 1100.00);
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
