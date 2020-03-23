package com.br.lindomar;
import java.util.Scanner;

public class Cliente {
	private int codigo;
	private String nome;
	private String cpf;
	private Data dataNasc = new Data();
	private Scanner s = new Scanner(System.in);

	public void ler() {
		System.out.print("Codigo.: ");
		this.codigo = Integer.parseInt(s.nextLine());
		System.out.print("Nome...: ");
		this.nome = s.nextLine();
		System.out.print("CPF....: ");
		this.cpf = s.nextLine();
		System.out.println("Data");
		this.dataNasc.ler();
	}

	public void mostra() {
		System.out.println("Codigo.: " + this.codigo);
		System.out.println("Nome...: " + this.nome);
		System.out.println("CPF....: " + this.cpf);
		this.dataNasc.mostra();
	}
}
