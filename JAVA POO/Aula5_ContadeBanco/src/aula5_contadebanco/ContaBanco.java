

package aula5_contadebanco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(this.getTipo().equals("cc")){
            this.setSaldo(50);
        }else if (this.getTipo().equals("cp")){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
        
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com " +this.getSaldo()+" necessario saque para fechamento");
        }else if (this.getSaldo()<0){
            System.out.println("Sr "+this.getDono()+" sua conta possui debitos contate o gerente de sua agência");
        }else {
            this.setStatus(false);
            System.out.println("A CONTA FOI ENCERRADA!");
        }
        
         
    
    }
    
    public void deposita(double v ){
        if(this.getStatus()== true){
           this.setSaldo(this.getSaldo()+v) ;
        }else{
            System.out.println("esta conta nao existe!");
        }
    
    }
    
    public void sacar(double v){
        if(this.getStatus()== true){
            if(this.getSaldo() < v){
           this.setSaldo(this.getSaldo()- v) ;
            }else if (this.getSaldo()>0){
                System.out.println("Voce nao possui saldo suficiante para esta operação");
            }
        }else{
            System.out.println("esta conta nao existe!");
        }
    }
    
    public void pagarMensal(){
        double valorMensalidade;
        valorMensalidade = this.getTipo().equals("cc")? 12.0 : 20.0;
        if(this.getStatus()== true){
            if(this.getSaldo()>valorMensalidade){
            this.setSaldo(this.getSaldo()-valorMensalidade);
            }else{
                System.out.println("valor insuficiente para debitar mensalidade");
            }
        }else{
            System.out.println("conta invalida para debito de mensalidade!");
        }
    }
    
    //METODOS ESPECIAIS
    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);         
    }
    // getter and setters
    public void setnumConta(int n){
        this.numConta = n;
 
    }
    public int getnumConta(){
        return this.numConta;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return this.dono;
    }
    public void setSaldo(double s){
        this.saldo = s;    
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setStatus(boolean st){
        this.status = st;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void mostra(){
        System.out.println("Numero da conta: " +this.getnumConta());
        System.out.println("tipo: " +this.getTipo());
        System.out.println("Nome do Cliente:" +this.getDono());
        System.out.println("Saldo: " +this.getSaldo());
        System.out.println("A conta esta ativa: " +this.getStatus());
    }
 
    
    
    
    
    
    
    
    
    
}

