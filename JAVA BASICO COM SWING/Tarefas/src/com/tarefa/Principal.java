

package com.tarefa;

/**
 *
 * @author Lbassetti
 */
public class Principal {
    public static void main(String[] args) {
        Aluno vetor [] = new Aluno[5];
        System.out.println(vetor.length);
        
        // usar um laço for para preencer os outros valores ou um while 
        vetor[0] = new Aluno();
        vetor[0].Nome = "Lindomar";
        System.out.println(vetor[0].Nome);
    }

}
