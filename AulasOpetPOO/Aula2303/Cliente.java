import java.util.Scanner;

/**
 * @author opet
 * 
 * @since março 16, 2020
 * 
 * @version 1.0
 *
 */
public class Cliente {
	private int codigo = 1;
	private String nome;
	private String cpf;
	private Data dataNasc = new Data();
	private Scanner s = new Scanner(System.in);
	
	//CONSTRUTOR
	public Cliente(){
		this.codigo = 1000;
		//System.out.println("Construindo 1");
	}
	
	public Cliente(int codigo){
		this.codigo = codigo;
		System.out.println("Construindo 2");
	}
	
	public Cliente(int codigo, String nome, String cpf) {
		this(codigo);//chama outro construtor
		this.nome = nome;
		this.cpf = cpf;
	}

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
