package aula11_heranca_parte2;

public class Aula11_Heranca_parte2 {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("joa da silva");
        v1.setIdade(30);
        v1.setSexo("Masculino");
        System.out.println(""+v1.toString());
        System.out.println("=========================");
        Aluno al = new Aluno();
        al.setNome("zezin da raocha");
        al.setIdade(21);
        al.setSexo("Masculino");
        al.setCurso("Computero");
        al.setMatricula(123456);
        System.out.println(""+al.toString());
        System.out.println("mat:"+al.getMatricula() + " Curso: "+al.getCurso());
        al.pagarMensalidade();
        System.out.println("=========================");
        Bolsista bl = new Bolsista();
        bl.setNome("Janaina Tubaina");
        bl.setIdade(21);
        bl.setSexo("feminino");
        bl.setCurso("Letras");
        bl.setMatricula(678910);
        bl.setBolsa(25);
        System.out.println(""+bl.toString());
        System.out.println("mat:"+bl.getMatricula() + " Curso: "+bl.getCurso()+ " Bolsa: "+bl.getBolsa());
        bl.pagarMensalidade();
        System.out.println("=========================");
        Tecnico tc = new Tecnico();
        tc.setNome("Adriana Banana");
        tc.setIdade(27);
        tc.setSexo("feminino");
        tc.setCurso("WEB desing");
        tc.setMatricula(88889999);
        System.out.println(""+tc.toString());
        System.out.println("mat:"+tc.getMatricula() + " Curso: "+tc.getCurso());
        tc.pagarMensalidade();
        System.out.println("=========================");
        Professor pf = new Professor();
        pf.setNome("PROCOPIO");
        pf.setIdade(55);
        pf.setSexo("Indefinido");
        pf.setEspecialidade("QUiMICO");
        pf.setSalario(100.00);
        System.out.println(""+pf.toString());
        System.out.println("Especialidade: "+pf.getEspecialidade()+ " Salario: "+pf.getSalario());
        pf.receberSalario();
        System.out.println("novo salario :"+pf.getSalario());
    }
    
}
