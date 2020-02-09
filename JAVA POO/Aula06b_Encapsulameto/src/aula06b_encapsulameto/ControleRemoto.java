

package aula06b_encapsulameto;


public class ControleRemoto implements Controlador {
    //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //contrutor

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    //setter & getter
    private int getVolume(){
        return this.volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }
    
    //METODOS ABSTRATOS

    @Override
    public void ligar() {
        this.setLigado(true);

    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----Menu------");
        System.out.println("esta ligado: " +this.getLigado());
        System.out.println("esta tocando: "+this.getTocando());
        System.out.print("Volume: " +this.getVolume());
        for (int i = 0; i < this.getVolume(); i+=10) {
            System.out.print(" I");
           
        }
         System.out.println("\t");
    
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()== true){
            this.setVolume(this.getVolume()+1);
        }
    
    }

    @Override
    public void menosVolume1() {
        if(this.getLigado()== true){
            this.setVolume(this.getVolume()-1);
        }
    
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado()== true && this.getVolume()> 0 ){
            this.setVolume(0);
        }
    
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado()== true && this.getVolume() == 0 ){
            this.setVolume(50);
        }
    
    }

    @Override
    public void play() {
        if(this.getLigado()== true && !(this.getTocando() == true) ){
            this.setTocando(true);
        }
    
    }

    @Override
    public void pause() {
        if(this.getLigado()== true && this.getTocando() == true){
            this.setTocando(false);
        }

    }
    
    
    
    
    
 
}
