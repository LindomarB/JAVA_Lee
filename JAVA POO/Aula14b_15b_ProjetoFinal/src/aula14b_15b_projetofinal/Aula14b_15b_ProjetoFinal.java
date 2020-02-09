/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14b_15b_projetofinal;

/**
 *
 * @author noteB00k
 */
public class Aula14b_15b_ProjetoFinal {

    public static void main(String[] args) {
         
           Gafanhoto g = new Gafanhoto("Jorge", 36, "masc", "jorgyy");
           Video v = new Video();
           v.setTitulo("ELA JOGA CUIZCUIZ 3");
           v.setAvaliacao(0);
           v.setView(2);
           v.setCurtidas(30);
           v.play();
           v.like();
           
         /*  System.out.println(v.toString());
           v.pause();
           System.out.println(v.toString());
           Gafanhoto p = new Gafanhoto("JAO", 20, "masc","boladao");
           System.out.println(p.toString());*/
           
           Visualizacao z = new Visualizacao(g , v );
           
           z.avaliar();
           z.avaliar(2);
           z.avaliar(100.0) ;
          
           
          
           Visualizacao a = new Visualizacao(g , v );
           Visualizacao b = new Visualizacao(g , v );
           
           
           System.out.println(b.toString());
         
     
           
           
    }
    
}
