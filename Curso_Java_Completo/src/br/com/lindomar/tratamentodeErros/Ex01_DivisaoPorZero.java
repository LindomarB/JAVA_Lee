

package br.com.lindomar.tratamentodeErros;

import javax.swing.JOptionPane;

/**
 *
 * @author Lbassetti
 */
public class Ex01_DivisaoPorZero { 
    public static int divisao(int a,int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
        int num;
        int den;
        boolean continua = true; 
        
        do {
            try{
               num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numerador"));
                den = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o denominador"));
                JOptionPane.showMessageDialog(null,"Valor da Divisao: "+divisao(num,den));
                continua = false;
            }
            catch(ArithmeticException erro){
                JOptionPane.showMessageDialog(null,"Ocorreu  um erro \n"+erro+"\n Nâo é possivel realizar uma operação de divisão por zero");
               
            }
            catch(NumberFormatException erro1){
                JOptionPane.showMessageDialog(null,"Ocorreu  um erro \n"+erro1+"\n Digite somente Valores Inteiros");
               
            }
        } while (continua);
        
        
        
        
       
        
        
    }
    
}
