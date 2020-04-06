package br.com.lindomar;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		JOptionPane.showConfirmDialog(null, "Lindomar Bassetti \n Mayara Dourada");
		Triangulo a = new Equilatero(10);
		Sistema s = new Sistema();
		
		System.out.println(a.getLado1());
		a.calculaArea();
		a.calculaPerimetro();
		a.validaFormato();
		a.validaLados();
		System.out.println("perimetro de equilatero "+a.calculaPerimetro());
		s.registra(a);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		Triangulo b = new Escaleno(7,4,9);
		b.validaLados();
		b.calculaArea();
		b.validaFormato();
		b.calculaPerimetro();
		System.out.println("perimetro de escaleno "+b.calculaPerimetro());
		s.registra(b);
		System.out.println("soma total de perimetro ="+s.getPerimetroTotal());
	}
}
