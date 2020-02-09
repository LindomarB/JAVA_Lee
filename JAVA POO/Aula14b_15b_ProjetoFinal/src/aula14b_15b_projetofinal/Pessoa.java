

package aula14b_15b_projetofinal;

/**
 *
 * @author Lbassetti
 */
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo; 
    protected double experiencia;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    
    
    protected final void  ganharXp(){
        this.setExperiencia(this.getExperiencia()+ 75.5);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome: " + nome + ", idade: " + idade + ", sexo: " + sexo + ", experiencia: " + experiencia + '}';
    }
    
    

}
