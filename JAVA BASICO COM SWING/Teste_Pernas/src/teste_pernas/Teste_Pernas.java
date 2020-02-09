/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_pernas;

import java.util.Scanner;

/**
 *
 * @author noteB00k
 */
public class Teste_Pernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite quantas pernas");
        int resp = leia.nextInt();
        leia.close();
        switch(resp){
            case 1:
                System.out.println("Saci");
                break;
            case 2:
                System.out.println("Bìpede");
                break;
            case 3:
                System.out.println("Negão do ZAPZAP");
                break;    
            case 4:
                System.out.println("Quadrupéde");
                break;        
            case 6:case 8 : //assim se faz dois cases em java
                System.out.println("Aranha");
                break;
            default:
                System.out.println("ET");
                break;        
        }
   }
    
}
