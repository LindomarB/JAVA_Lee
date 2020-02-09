
package torneio_king_of_rua;

public class Lutador {
    ///atributes
   private String nome;
   private String nascionalidade;
   private int idade;
   private double altura;        
   private double peso;                
   private String categoria;        
   private int vitorias;        
   private int derrotas;        
   private int empates;
   ///Constructor
    public Lutador(String nome, String nascionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    
    
    ///Getters & Setters
     public String getNome(){
         return this.nome;
     }
     public void setNome(String nome){
         this.nome = nome;
     }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria(categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        if(this.getPeso()< 52.2){
            this.categoria= "Invalido lutador a baixo do peso minimo";
        }else if(this.getPeso()<=70.3){
            this.categoria="Leve";
        }else if (this.getPeso()<= 83.9){
            this.categoria="Médio";
        }else if (this.getPeso()<= 120.2){
            this.categoria="Pesado";
        }else {
            this.categoria="Invalida Lutador acima do peso maximo";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
     


///Metodos da Classe Lutador 


    public void apresentar(){
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Nascionalidade: "+this.getNascionalidade());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Altura: "+ this.getAltura());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Categoria: " +this.getCategoria());
        System.out.println("Ganhou: "+this.getVitorias());
        System.out.println("Perdeu: "+this.getDerrotas());
        System.out.println("Empatou:"+this.getEmpates());
    
    }
    public void status(){
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println("Ganhou: "+this.getVitorias()+" Lutas");
        System.out.println("Perdeu: "+this.getDerrotas()+" Lutas");
        System.out.println("Empatou:"+this.getEmpates()+" Lutas");
    
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    
   
   
   
   
            
    }
