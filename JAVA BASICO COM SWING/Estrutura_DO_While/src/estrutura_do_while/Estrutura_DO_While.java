/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura_do_while;

import java.util.Scanner;

/**
 *
 * @author noteB00k
 */
public class Estrutura_DO_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int cc  = 0;
        String resp = "s";
        do {
  
            cc += 1;
            
            System.out.println(cc);
            System.out.println("continuar s/n");
            resp = leia.nextLine();
        } while ("s".equals(resp));
        System.out.println(cc);
        
        
                
    }
}
