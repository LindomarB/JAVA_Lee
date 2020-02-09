/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.repita;


import javax.swing.JOptionPane;
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double n; 
    int cont = 0;
    double s = 0;
    do{    
       n = Double.parseDouble(JOptionPane.showInputDialog(null, "<html>Digite um valor<br><b>0 para sair</b> <html>"));
       cont++;
       s +=n;
    }while(n!= 0);
        JOptionPane.showMessageDialog(null,"<html> voce digitou " + cont+" numeros <br> A soma e " + s+"</html>");
    }
    
}
