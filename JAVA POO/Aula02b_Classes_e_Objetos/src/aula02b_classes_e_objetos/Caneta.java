

package aula02b_classes_e_objetos;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga ;
    boolean tampada;
    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        String n = this.tampada == true? "Tampada":"Destampada";
        System.out.println("Tampa:"+n);
         
    }
    
    void rabiscar(){ 
        if(this.tampada == true){
            System.out.println("Erro nao posso rabiscar");
        }else{
            System.out.println("Estou rabiscando ");
        }
     
    }
    void tampar(){
        this.tampada =true;
    }
    void destampar(){
        this.tampada = false;
    }
}
