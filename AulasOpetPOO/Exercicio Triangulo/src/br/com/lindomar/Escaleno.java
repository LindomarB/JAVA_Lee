package br.com.lindomar;

public class Escaleno extends Triangulo {
	
	/*construtor*/
	public Escaleno(double lado1,double lado2,double lado3) {
		super(lado1,lado2,lado3);
	}

	@Override
	public double calculaArea() {
		double semiPerimetro= this.calculaPerimetro()/2;
		double area;
		area= Math.sqrt(semiPerimetro*(semiPerimetro-this.getLado1())*(semiPerimetro-this.getLado2())*(semiPerimetro-this.getLado3()));
		System.out.println("calculando area do escaleno "+area);
		return 0;
	}

	@Override
	public boolean validaFormato() {
		System.out.println("diz se todos os lados sao iguais");
		if (this.getLado1()!=this.getLado2() && this.getLado2()!=this.getLado3() && this.getLado1()!=this.getLado3() ) {
			System.out.println("os lados sao todos diferentes satanaiz");
			return true;
		}else {
			System.out.println("os lados nao sao diferentes");
			return false;
		}
	}

}
