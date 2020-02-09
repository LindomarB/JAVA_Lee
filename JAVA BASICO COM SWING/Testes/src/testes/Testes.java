/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Testes {

    public static void main(String[] args) {
        Scanner  leia = new Scanner(System.in);
        Calendar cal = GregorianCalendar.getInstance();
        int atual = cal.get(Calendar.YEAR);
        System.out.println("digite o ano que vc nasceu: ");
        int nasc = leia.nextInt();
         int s = (atual - nasc);
        System.out.println("Voce tem  "+ s+ " Anos");
        String voto = s >= 18 && s <=70? "Obrigatório":"facultativo";
        System.out.println("Seu voto é : "+ voto); 
           
      }
    
}
