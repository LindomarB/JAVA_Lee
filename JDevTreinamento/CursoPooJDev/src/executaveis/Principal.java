package executaveis;

import javax.swing.JOptionPane;

import classes.Aluno;

public class Principal {
	public static void main(String[] args) {
		
	//solicita entrada de dados pelo teclado do usuario
	String nome = JOptionPane.showInputDialog("Nome do Aluno");
	int idade = Integer.parseInt(JOptionPane.showInputDialog("idade"));
	String dataNascimento = JOptionPane.showInputDialog("data de nascimento");
	String matricula = JOptionPane.showInputDialog("matricula");
	String numeroCpf = JOptionPane.showInputDialog("cpf ");
	String nomeMae = JOptionPane.showInputDialog("nome da mãe");
	String nomePai = JOptionPane.showInputDialog("nome do pai");
	String dataMatricula = JOptionPane.showInputDialog("data da matricula");
	String nomeEscola = JOptionPane.showInputDialog("nome da escola");
	String nomeCurso = JOptionPane.showInputDialog("serie matriculada/ nome do curso");
	double nota1 = Double.parseDouble(JOptionPane.showInputDialog("nota 1"));
	double nota2 = Double.parseDouble(JOptionPane.showInputDialog("nota 2"));
	double nota3 = Double.parseDouble(JOptionPane.showInputDialog("nota 3"));
	double nota4 = Double.parseDouble(JOptionPane.showInputDialog("nota 4"));
	
	//instancia um objeto da classe aluno
	Aluno aluno1 = new Aluno();
	
	// utilizando as variaveis popula o objeto com as informações inseridas pelo usuario
	
	aluno1.setNome(nome);
	aluno1.setIdade(idade);
	aluno1.setDataNascimento(dataNascimento);
	aluno1.setMatricula(matricula);
	aluno1.setNumeroCpf(numeroCpf);
	aluno1.setNomeMae(nomeMae);
	aluno1.setNomePai(nomePai);
	aluno1.setDataMatricula(dataMatricula);
	aluno1.setNomeEscola(nomeEscola);
	aluno1.setSerieMatriculado(nomeCurso);
	aluno1.setNota1(nota1);
	aluno1.setNota2(nota2);
	aluno1.setNota3(nota3);
	aluno1.setNota4(nota4);
	
	
	
	

	
	
	System.out.println("media "+aluno1.getMedia());
	System.out.println(aluno1);
	
	
	
	
	
	
	System.out.println("media "+aluno1.getMedia());
	System.out.println("aprovado: "+(aluno1.getAlunoAprovado()?"aprovado":"reprovado"));
	}
}
