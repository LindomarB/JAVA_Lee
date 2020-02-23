/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lindomar.arrays;

/**
 *
 * @author noteB00k
 */
public class Exemplo_ForEACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[] =new int [5];
        for (int i = 0; i < vetor.length; i++) {
             vetor[i] = i;
            
        }
        
        //exemplo de for EACH
        for (int j: vetor) {
            System.out.println("vetor = "+j);
            
        }
    }
    
}
