

package aula14b_15b_projetofinal;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totalassitido;

    public Gafanhoto(String nome, int idade, String sexo,String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalassitido = 0;
    }
    
    
    public void levelUp(){
    
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

   

    public int getTotalassitido() {
        return totalassitido;
    }

    public void setTotalassitido(int totalassitido) {
        this.totalassitido = totalassitido;
    }

   /* @Override
    public String toString() {
        return "Gafanhoto{"+super.toString()+ "login=" + login + ", totalassitido=" + totalassitido + '}';
    }*/
    
}
