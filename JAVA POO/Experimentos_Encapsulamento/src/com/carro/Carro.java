package com.carro;

public class Carro implements Direcao {
    String cor;
    String modelo;
    double velocidademaxima;
    double velocidade;
    boolean ligado;
    
    //Constructor

    public void  Carro() {
        this.velocidademaxima = 210;
        this.velocidade = 0;
        this.ligado = false;
    }
    public void mostraCarro(){
        System.out.println("Modelo: " +this.getModelo());
        System.out.println("cor: " +this.getCor());
        System.out.println("Velocidade maxima: " + this.getVelocidademaxima()+ " Km/h");
        System.out.println("Velocidade atual: " + this.getVelocidade()+ " Km/h" );
        System.out.println("Está ligado:" +this.getLigado());
  
    }
    
    
    
    //get e set
    public void setCor(String c){
        this.cor = c;
    }
    public String getCor(){
        return this.cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidademaxima() {
        return velocidademaxima;
    }

    public void setVelocidademaxima(double velocidademaxima) {
        this.velocidademaxima = velocidademaxima;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
     /// metodos da interface
    @Override
    public void ligar() {
        if(this.getLigado()==false){
            this.setLigado(true);
        }
    }

    @Override
    public void desligar() {
         if(this.getLigado()== true){
            this.setLigado(false);
        }
    }

    @Override
    public void acelerrar() {
        if(this.getLigado()==true && this.getVelocidade() < 210){
           this.setVelocidade(this.getVelocidade()+70);
        }else if(this.getVelocidade()>= this.getVelocidademaxima()){
            this.setVelocidade(210.0);
            System.out.println("Velocidade maxima atingida 210 km/h");
        }
    }

    @Override
    public void frear() {
        if(this.getLigado()==true && this.getVelocidade() > 0){
            this.setVelocidade(this.getVelocidade()- 40);
        }
    }
    
    
    
    
}
