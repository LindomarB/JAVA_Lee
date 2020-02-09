

package com.vetor;

import java.util.Scanner;

/**
 *
 * @author Lbassetti
 */
public class Testematriz {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vetor [][] = new int [3][3];
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                System.out.println("digite um valor");
                vetor[i][j] = leia.nextInt(); 
                
            }
            
        }
         for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                System.out.print(vetor[i][j]+"\t");
            }
             System.out.println(" ");
        }
    }

}
