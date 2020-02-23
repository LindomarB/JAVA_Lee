package br.com.aula19_02;

public class Principal {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.numero= 8989;
		c1.titular= "Astolfo";
		c1.limite =5000;
		c1.saldo = 3000;
		
		System.out.println(c1.toString());
		c1.saca(1000);
		System.out.println(c1.toString());
		c2.numero= 9090;
		c2.titular= "maria";
		c2.limite =2000;
		c2.saldo = 1000;
		System.out.println(c2.toString());
		c2.saca(1000);
		System.out.println(c2.toString());
		c2.transferir(c1,500);
		
		System.out.println("apos a transferencia");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	
		
		
		
	
	}
}










