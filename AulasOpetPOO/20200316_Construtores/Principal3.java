/**
 * Altere a classe Conta para conter
 * tr�s construtores:
 * 1 - sem par�metros
 * 2 - somente com o n�mero
 * 3 - somente com o limite
 * 4 - com o n�mero e o limite
 * Teste a cria��o de contas usando os
 * contrutores criados
 */

/**
 * @author opet
 * 
 * @since mar�o 16, 2020
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
		System.out.println("chamada pelo metodo :"+Conta.getContador());
		
		Conta c2 = new Conta(33);
		System.out.println("Contador de Objects c[2]: "+Conta.contador);
		c2.mostra();
		System.out.println("chamada pelo metodo :"+Conta.getContador());
		
		Conta c3 = new Conta(3000.0);
		System.out.println("Contador de Objects c[3]: "+Conta.contador);
		c3.mostra();
		System.out.println("chamada pelo metodo :"+Conta.getContador());
		
		Conta c4 = new Conta(22, 4000);
		System.out.println("Contador de Objects c[4]: "+Conta.contador);
		c4.mostra();
		System.out.println("chamada pelo metodo :"+Conta.getContador());
		
	}

}
