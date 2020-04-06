package br.com.lindomar;

public class Equilatero extends Triangulo{
	
	
	/*contructor*/
	public Equilatero(double lado) {
		this.setLado1(lado);
		this.setLado2(lado);
		this.setLado3(lado);
	}

	@Override
	public double calculaArea() {
		System.out.println(Math.pow(this.getLado1(), 2)*Math.sqrt(3)/4);
		System.out.println("calculando area do equilatero");
		
		return 0;
	}

	@Override
	public boolean validaFormato() {
		System.out.println("diz se todos os lados sao iguais");
		if (this.getLado1()==this.getLado2() && this.getLado2()==this.getLado3() ) {
			System.out.println("sao iguais DJANHO");
			return true;
		}else {
			System.out.println("nao sao iguais me fi");
			return false;
		}
	}
}
