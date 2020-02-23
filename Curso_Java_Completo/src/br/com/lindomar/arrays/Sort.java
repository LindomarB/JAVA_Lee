

package br.com.lindomar.arrays;

import java.util.Arrays;

/**
 *
 * @author Lbassetti
 */
public class Sort {
    public static void main(String[] args) {
        int vetor[] = {3,5,7,8,9,6,5,55,44,12,1,0,2};
        System.out.println("Original");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println( vetor[i]);
        }
        System.out.println("ordenado");
        Arrays.sort(vetor);
        for(int ordenado : vetor){
            System.out.println(""+ordenado);
        }
        for (int i : vetor) {
            
        }
           
    }

}
