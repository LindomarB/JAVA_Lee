package br.com.lindomar;

public abstract class Triangulo {
	private double lado1;
	private double lado2;
	private double lado3;
	
	/*contrutores*/
	public Triangulo() {
		this.setLado1(0);
		this.setLado2(0);
		this.setLado3(0);
	}
	public Triangulo(double lado1,double lado2,double lado3) {
		this.setLado1(lado1);
		this.setLado2(lado2);
		this.setLado3(lado3);	
	}
	
	
	
	/*getter and setters*/
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	
	
	/*metodos da classe triangulo*/
	public double calculaPerimetro() {
		
		return this.getLado1()+this.getLado2()+this.getLado3();
	}
	public abstract double calculaArea();
	public abstract boolean validaFormato();//todos os lados sao iguais?
	public boolean validaLados() {
		if(this.getLado1() < this.getLado2() + this.getLado3() && this.getLado2() < this.getLado1() + this.getLado3() && this.getLado3()<this.getLado2()+this.getLado1()) {
		System.out.println("è um triangulo negao");
		}else {
			System.out.println("Nao forma um triangulo");
		}
		return true;
	}
}
