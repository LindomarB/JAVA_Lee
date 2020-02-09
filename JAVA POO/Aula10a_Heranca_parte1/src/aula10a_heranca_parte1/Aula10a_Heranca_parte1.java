package aula10a_heranca_parte1;
public class Aula10a_Heranca_parte1 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Jao");
        System.out.println("p1 do tipo pessoa: " +p1.getNome());
        System.out.println("===================================");
        
        Aluno p2 = new Aluno();
        p2.setNome("Beatriz");
        System.out.println("p2 do tipo aluno: "+p2.getNome());
        System.out.println("===================================");
        Professor p3 = new Professor();
        p3.setNome("Ramirão");
        System.out.println("p3 do tipo Professor: "+ p3.getNome());
        p3.setSalario(1);
        System.out.println("atual :"+p3.getSalario());
        p3.receberSalario();
        System.out.println("caiu o pagode:" +p3.getSalario());
         System.out.println("===================================");
         Funcionario p4 = new Funcionario();
         p4.setNome("Ana");
         p4.setSetor("Recpaçao");
         p4.setTrabalhando(true);
        // p4.mudarTrabalho();
         System.out.println("p4 do tipo Funcionario: "+p4.getNome());
         System.out.println("setor "+p4.getSetor());
         String r = p4.isTrabalhando()?"Sim":"Não";
         System.out.println("esta trabalhando agora? "+r);
    }
    
}
