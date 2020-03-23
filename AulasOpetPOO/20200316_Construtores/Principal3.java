/**
 * Altere a classe Conta para conter
 * três construtores:
 * 1 - sem parâmetros
 * 2 - somente com o número
 * 3 - somente com o limite
 * 4 - com o número e o limite
 * Teste a criação de contas usando os
 * contrutores criados
 */

/**
 * @author opet
 * 
 * @since março 16, 2020
 * 
 * @version 1.0
 *
 */
public class Principal3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Contador de Objects antes de construir qualquer object "+Conta.contador);
		Conta c1 = new Conta();
		System.out.println("Contador de Objects c[1]: "+Conta.contador);
		c1.mostra();
		System.out.println("chamada pelo metodo"+c1.getContador());
		
		Conta c2 = new Conta(33);
		System.out.println("Contador de Objects c[2]: "+Conta.contador);
		c2.mostra();
		
		Conta c3 = new Conta(3000.0);
		System.out.println("Contador de Objects c[3]: "+Conta.contador);
		c3.mostra();
		
		Conta c4 = new Conta(22, 4000);
		System.out.println("Contador de Objects c[4]: "+Conta.contador);
		c4.mostra();
		
	}

}
