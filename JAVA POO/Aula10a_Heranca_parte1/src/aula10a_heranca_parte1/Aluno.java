

package aula10a_heranca_parte1;

/**
 *
 * @author Lbassetti
 */
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    public void cancelarMatricula(){
        this.setMatricula(0);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

   
    

}
