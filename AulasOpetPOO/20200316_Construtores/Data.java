import java.util.Scanner;

public class Data {
	private int dia, mes, ano;
	private Scanner s = new Scanner(System.in);

	public void mostra() {
		System.out.println("Data...: " + this.dia + "/" + this.mes + "/" + this.ano);
	}

	public void ler() {
		System.out.print("dia....: ");
		this.dia = Integer.parseInt(s.nextLine());
		System.out.print("mes....: ");
		this.mes = Integer.parseInt(s.nextLine());
		System.out.print("ano....: ");
		this.ano = Integer.parseInt(s.nextLine());
	}
}
