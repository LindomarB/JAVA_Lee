package torneio_king_of_rua;

import java.util.Random;

public class Luta {
    private  Lutador desafiante;
    private Lutador desafiado;
    private int round;
    private boolean aprovado;
    
    
    
    public void marcarLuta( Lutador l1,Lutador l2 ){
        if(l1.getCategoria()==l2.getCategoria()&& l1!=l2){
            this.aprovado = true;
            this.desafiante = l1;
            this.desafiado = l2;
        }else{
            this.aprovado = false;
            this.desafiante = null;
            this.desafiado = null;
        
        }
    
    }
    public void Lutar(){
        if(this.isAprovado()==true){
            System.out.println("Desafiante");
            this.desafiante.apresentar();
            System.out.println("Desafiado");
            this.desafiado.apresentar();
            Random aleatorio = new Random();
            int vencedor =  aleatorio.nextInt(3);
            System.out.println("Variavel Vencedor deu valor:" + vencedor);
            System.out.println("========RESULTADO DA LUTA============");
            switch (vencedor) {
                case 0:
                    System.out.println("A luta terminou em Empate entre os gigantes");
                    System.out.println(this.desafiado.getNome()+" e " +this.desafiante.getNome());
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitoria do Desafiado "+ this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitoria do Desafiante "+ this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                default:
                    break;
            }
        
        
        
        }else{
            System.out.println("Luta nao pode ocorrer!");
        }
        System.out.println("=====================================");
    
    }
    
    //setter and getters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    

}
