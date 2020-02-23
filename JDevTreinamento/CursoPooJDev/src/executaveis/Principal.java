package executaveis;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Disciplina;

public class Principal {
	public static void main(String[] args) {

		Aluno al = new Aluno();
	/*	String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno");
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade do Aluno"));
		String dataNascimento = JOptionPane.showInputDialog(null, "Data de nascimento DD/MM/AAAA");
		String matricula = JOptionPane.showInputDialog(null, "Matricula Do Aluno");
		String cpf = JOptionPane.showInputDialog(null, "Numero do CPF");
		String mae = JOptionPane.showInputDialog(null, "Nome Mae");
		String pai = JOptionPane.showInputDialog(null, " Nome Pai");
		String dataMatricula = JOptionPane.showInputDialog(null, "Data da Matricula");
		String escola = JOptionPane.showInputDialog(null, "Nome Instituição");
		String serieMatriculado = JOptionPane.showInputDialog(null, "Serie do Aluno");
		String disciplina1 = JOptionPane.showInputDialog(null, "1ª Disciplina: ");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 1"));
		String disciplina2 = JOptionPane.showInputDialog(null, "2ª Disciplina: ");
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 2"));
		String disciplina3 = JOptionPane.showInputDialog(null, "3ª Disciplina: ");
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 3"));
		String disciplina4 = JOptionPane.showInputDialog(null, "4ª Disciplina: ");
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 4"));
	*/
	/////automatico
			String nome = "lindomar";
			int idade = 32;
			String dataNascimento= "18/02/1989";
			String matricula= "1201900046";
			String cpf="0665";
			String 	mae="EDNA";
			String 	pai="DARCI";
			String 	dataMatricula="20/02/2020";
			String 	escola="UniOpet";
			String 	serieMatriculado= "3º periodo";
			/*String 	disc1= "HTML";
			double nota1= 5.0;
			String disc2= "Java Basico";
			double nota2= 3.0;
			String disc3=" Java Poo";
			double nota3 = 2.0;
			String 	disc4= "Banco de dados";
			double nota4= 8.0;*/
			/////

		al.setNome(nome);
		al.setIdade(idade);
		al.setDataNascimento(dataNascimento);
		al.setMatricula(matricula);
		al.setNumeroCpf(cpf);
		al.setNomeMae(mae);
		al.setNomePai(pai);
		al.setDataMatricula(dataMatricula);
		al.setNomeEscola(escola);
		al.setSerieMatriculado(serieMatriculado);
		/*al.getDisciplina().setDisciplina1(disciplina1);// pega a getDisciplina() chama o metodo dentro da classe Disciplina e seta o atributo
		al.getDisciplina().setNota1(nota1);
		al.getDisciplina().setDisciplina2(disciplina2);
		al.getDisciplina().setNota2(nota2);
		al.getDisciplina().setDisciplina3(disciplina3);
		al.getDisciplina().setNota3(nota3);
		al.getDisciplina().setDisciplina4(disciplina4);
		al.getDisciplina().setNota4(nota4);*/
	
		
		//Disciplinas por list
		/*Disciplina disciplina1 = new  Disciplina();// cria o objeto
		disciplina1.setDisciplina(disc1);//seta os dados do nome
		disciplina1.setNota(nota1);  // set od dados de nota
		al.getDisciplinas().add(disciplina1); // adiciona o objeto criaqdo a list
		
		Disciplina disciplina2 = new  Disciplina();
		disciplina2.setDisciplina(disc2);
		disciplina2.setNota(nota2); 
		al.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new  Disciplina();
		disciplina3.setDisciplina(disc3);
		disciplina3.setNota(nota3); 
		al.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new  Disciplina();
		disciplina4.setDisciplina(disc4);
		disciplina4.setNota(nota4); 
		al.getDisciplinas().add(disciplina4);*/
		
		
		//disciplina list dinamico
		for (int i = 1; i <= 4; i++) {
			String nomeDisciplina = JOptionPane.showInputDialog(null, "Disciplina " +i+" :");
			double notaDisciplina = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota "+i+" :"));
		
			Disciplina disciplina = new  Disciplina();// cria o objeto
			disciplina.setDisciplina(nomeDisciplina);//seta os dados do nome
			disciplina.setNota(notaDisciplina);  // set od dados de nota
			
			al.getDisciplinas().add(disciplina); // adiciona o objeto criaqdo a list
			
		}
		
		
	
		
		
		System.out.println(al.toString());
	
		
		// utilizei a classe math.ceil para arredondar para cima o valor que veio do
		// metodo getMedia()
		System.out.println(al.getMedia());
		System.out.println("Situaçao do aluno: " + (al.isAprovado() ? "Aprovado" : "Reprovado"));
		
		
		// O treco de codigo a baixo foi usado somente para a didatica do aprendizado dos metosdos equals e hashcode
		/*Aluno aluno1 =new Aluno();
		Aluno aluno2 =new Aluno();
		
		aluno1.setNome("Lindomar");
		aluno2.setNome("Lindomar");
		
		//System.out.println("Aluno1 "+aluno1);
		//System.out.println("Aluno2 "+aluno2);
		if(aluno1.equals(aluno2)) {
			System.out.println("São iguais");
		}else {
			System.out.println("Diferentes");
		}
		//System.out.println(aluno1.hashCode());
		//System.out.println(aluno2.hashCode());*/
	}
}
