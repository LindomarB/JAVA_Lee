/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_idade_votacao_com_if_else;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author noteB00k
 */
public class Teste_Idade_Votacao_com_If_Else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  leia = new Scanner(System.in);
        Calendar cal = GregorianCalendar.getInstance();
        int atual = cal.get(Calendar.YEAR);
        System.out.println("digite o ano que vc nasceu: ");
        int nasc = leia.nextInt();
        int s = (atual - nasc);
        System.out.println("Voce tem  "+ s+ " Anos");
        if(s <= 15){
            System.out.println("Voce é muito novo para votar");
        }else if((s >= 16 && s <= 17)||(s >=70)){
            System.out.println("seu voto e facultativo");
        }else{
            System.out.println("Seu voto é Obrigátorio");
        }
    }
    
}
