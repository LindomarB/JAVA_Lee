

package aula13a_Sobrecarga;

/**
 *
 * @author Lbassetti
 */
public class Cachorro {
    public void emitirSom(){
        System.out.println("Au au au!!!");
    }
    public void reagir(String frase){
        if ("ola".equals(frase) || "toma comida".equals(frase)){
            System.out.println("abanar e latir");
        }else{
            System.out.println("Rosnar");
        }
    
    } 
    public void reagir(int hora, int min){
        if(hora <12){
            System.out.println("Abanar");
        }else if(hora > 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e latir");
        }
        
    }
    public void reagir(boolean dono){
        String resp;
        resp =(dono==true)?"Abanar":"Latir e Rosnar";
        System.out.println(resp);
            }
    public void reagir(int idade, double peso ){
       if (idade <5){
           if(peso <10){
               System.out.println("Abanar");
           }else{
               System.out.println("Latir");
           }
       }else if(peso <10){
           System.out.println("Rosnar");
       }else{
           System.out.println("Ignorar");
       }
    
    }
}
