package executaveis;

import classes.Aluno;

public class Principal {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Jao do osso");
		System.out.println(aluno1.getNome());
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		System.out.println(aluno1.getMedia());
		
		
	}
}
