package com.br.lindomar;

public class Data {
	private String dia;
	private String mes;
	private String ano;
	
	
	@Override
	public String toString() {
		return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
}
