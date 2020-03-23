import java.util.Scanner;

public class Conta {
	private int numero;
	Cliente titular = new Cliente();
	private double saldo = 0;
	private double limite = 1000;
	private Scanner s = new Scanner(System.in);
	static int contador;
	


	public Conta() {
		System.out.println("Construtor 1");
		Conta . contador ++;
	}
	
	public Conta(int numero) {
		this.numero = numero;
		System.out.println("Construtor 2");
		Conta . contador ++;
	}
	
	public Conta(double limite) {
		this.limite = limite;
		System.out.println("Construtor 3");
		Conta . contador ++;
	}
	
	public Conta(int numero, double limite) {
		this(numero);//um construtor pode fazer uma chamada a outro desde que seja única e na primeira linha
		this.limite = limite;
		System.out.println("Construtor 3");
		Conta . contador ++;
	}
	
	public static int getContador() {
		return contador;
	}

	boolean deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		} else {
			return false;
		}
	}

	boolean saca(double valor) {
		if ((valor > 0) && (valor <= this.saldo + this.limite)) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	void mostra() {
		System.out.println("Numero.: " + this.numero);
		System.out.println("Titular ");
		this.titular.mostra();
		System.out.println("Limite.: R$ " + this.limite);
		System.out.println("Saldo..: R$ " + this.saldo);
		System.out.println();
	}

	/* versão 1
	boolean transfere(double valor, Conta destino) {
		if ((valor > 0) && (valor <= this.saldo + this.limite)) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		}else {
			return false;
		}
	}
	*/
	
	boolean transfere(double valor, Conta destino) {
		if(this.saca(valor)) 
			return destino.deposita(valor);
		else
			return false;
	}
	
	void ler() {
		
		System.out.print("Numero.: ");
		this.numero = Integer.parseInt(s.nextLine());
		System.out.println("Titular ");
		this.titular.ler();;
		//System.out.print("Limite.: R$ ");
		//this.limite = Double.parseDouble(s.nextLine());
		//System.out.print("Saldo..: R$ ");
		//this.saldo = Double.parseDouble(s.nextLine());
	}
	
}
