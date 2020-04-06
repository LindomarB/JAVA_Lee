package br.com.lindomar;

public class Sistema {
	
	private static double perimetroTotal;
	private static double areaTotal;

	public static double getAreaTotal() {
		return areaTotal;
	}

	public static void setAreaTotal(double areaTotal) {
		Sistema.areaTotal = areaTotal;
	}

	public double getPerimetroTotal() {
		return perimetroTotal;
	}

	public void setPerimetroTotal(double perimetroTotal1) {
		perimetroTotal = perimetroTotal1;
	}
	void registra(Triangulo t) {
		perimetroTotal = this.getPerimetroTotal()+t.calculaPerimetro();
		areaTotal = this.getAreaTotal()+t.calculaArea();
	}

}
