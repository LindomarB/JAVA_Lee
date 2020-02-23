package br.com.aula19_02;

public class Conta {
	int numero;
	String titular;
	double saldo;
	double limite;//// final?--

	void saca(double valor) {
		if (valor >= 0 && valor <= this.saldo + this.limite) {
			this.saldo -= valor;
		} else if (saldo < valor) {
			System.out.println("Saldo insuficiente");
		} else {
			System.out.println("Erro Voce nao pode realizar esta operaçao.");
		}

	}

	void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + ", limite=" + limite + "]";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	void transferir(Conta conta1, double valor) {
		this.setSaldo(this.getSaldo()-valor);
		conta1.setSaldo(conta1.getSaldo()+valor);
	}
}
