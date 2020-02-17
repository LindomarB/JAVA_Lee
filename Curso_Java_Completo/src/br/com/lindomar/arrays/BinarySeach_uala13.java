

package br.com.lindomar.arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Lbassetti
 */
public class BinarySeach_uala13 {
    public static void main(String[] args) {
        int vetor[] = {0,1,3,5,4,7,8,9,11,15,18};
    int valor =998;
    while(valor !=999){
         valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser  pesquisado 999 para cancelar"));
        int resultado = Arrays.binarySearch(vetor, valor);
        if(resultado >0){
            JOptionPane.showMessageDialog(null,"Valor: "+valor+" encontrado na possiÃ§ao: "+resultado+" do Array");
        }else{
            JOptionPane.showMessageDialog(null,"Valor NÃ£o encontrado ");
        }
    }
}
}
