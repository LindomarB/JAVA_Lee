/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura_while;

import java.util.Scanner;

/**
 *
 * @author noteB00k
 */
public class Estrutura_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int resp = 1;
        int s = 0;
        while(resp != 999){
            System.out.println("Digite um numero");
             s = leia.nextInt();
             s =  s += s;
            System.out.println("deseja continuar ?  999 para sair");
            resp = leia.nextInt();
        }
        System.out.println(s);       
  
    
    
}
}
    
