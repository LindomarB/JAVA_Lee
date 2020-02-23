

package br.com.lindomar.arrays;

import java.util.Arrays;

/**
 *
 * @author Lbassetti
 */
public class CopiarArray {
    public static void main(String[] args) {
        int origem[]= {2,3,4,5,6};
        int destino[]= new int[8];
        int destino2[]= new int[8];
        System.out.println("Origem:");
        for(int j :origem){
            System.out.print(""+j);
        }
        System.out.println("");
        System.out.println("Destino");
        for(int j :destino){
            System.out.print(""+j);
        }
        System.arraycopy(origem, 0, destino, 1, origem.length);
        
        System.out.println(" ");
        System.out.println("novo destino");
        for(int j :destino){
            System.out.print(""+j);
        }
        ///copia com copyOf da classe Array
        destino2 = Arrays.copyOf(origem, 10);
        System.out.println("novo destino2");
        for(int j :destino2){
            System.out.print(""+j);
        }
    }
}
