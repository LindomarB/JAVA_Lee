package br.com.lindomar.bancocomDao.Model;


public class Pessoa {
	private int id;
	private String nome;
	private String nascimento;
	private String sexo;
	
	public Pessoa() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", nascimento=" + nascimento + ", sexo=" + sexo +"]"+"\n";
	}

}











/*CREATE TABLE PESSOA (
		PESSOA_ID NUMBER NOT NULL,
		PESSOA_NOME VARCHAR2(50) NOT NULL,
		PESSOA_NASCIMENTO DATE, PESSOA_SEXO VARCHAR2(1),
		CONSTRAINT PESSOA_PK PRIMARY KEY (PESSOA_ID));*/