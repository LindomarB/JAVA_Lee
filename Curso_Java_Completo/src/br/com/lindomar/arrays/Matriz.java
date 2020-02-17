

package br.com.lindomar.arrays;

/**
 *
 * @author Lbassetti
 */
public class Matriz {
    public static void main(String[] args) {
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        //int matriz[][] = {{1,2,3},{4,5,6,8},{7,8,9},{}};// mostraria linhas 4 e colunas da posicao um 4
        //matriz.length mostrea linhas
        //matriz[]i.length  mostra colunas
        System.out.println("linhas: " +matriz.length);
        System.out.println("colunas: " +matriz[1].length);//mostra quantas colunas tem nas linha um
        for (int i = 0; i < matriz.length; i++) {  ///// percorre a linha 
            for (int j = 0; j < matriz[i].length; j++) { ///percore as colunas
                int[] is = matriz[j];
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
}
