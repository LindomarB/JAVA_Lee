package com.br.lindomar;

public class Cliente {
	private int codigo;
	private String nome;
	private String cpf;
	protected Data nasc = new Data();
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Data getNasc() {
		return nasc;
	}
	public void setNasc(Data nasc) {
		this.nasc = nasc;
	}
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", nasc=" + nasc + "]";
	}

}

