package banco;
//Atributos
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos Personalizados
    public void estadoAtual(){
        System.out.println("--------------------------------------");
        System.out.println("Conta:"+ this.getNumConta());
        System.out.println("Tipo:"+ this.getTipo());
        System.out.println("Dono:"+ this.getDono());
        System.out.println("Saldo: R$"+ this.getSaldo());
        System.out.println("Status :"+ this.getStatus());
    
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);        
        if ("CC".equals(t)){
            this.setSaldo(50);
            }else if ("CP".equals(t)){
            this.setSaldo(150);
           }
        System.out.println("Conta aberta com sucesso!!");
    }
       
    public void fecharConta(){
        if(this.getSaldo()>0){
        System.out.println("Conta ainda não pode ser fechada´. pois ainda tem saldo");
        } else if (this.getSaldo()<0){
         System.out.println("Conta não pode ser fechada ainda tem dbito");
        }else{
        this.setStatus(false);
        System.out.println("Conta fechada com sucesso");
        }
    }
       
    public void depositar(float v){
        
       if(this.getStatus()){
       this.setSaldo(this.getSaldo()+ v);
       System.out.println("Deposito realizado");
       }else{
       System.out.println("Impossivel realizar deposito!");
       }
    }
      
    public void sacar(float v){
        
          if(this.getStatus()){
            if (this.getSaldo() >= v){
          this.setSaldo(this.getSaldo()-v);
           System.out.println("Saque realizado na conta" + this.getDono());
           }else {
           System.out.println("Saldo insuficiente para saque");
        } 
              
     }else {
    System.out.println("Impossivel sacar de uma conta fechada!");
    }
        }
      
    
    public void pagarMensal(){
        int v = 0 ;
        if ("CC".equals(this.getTipo())){
            v = 12;
        }else if("CP".equals(this.getTipo())){
            v=20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()- v);
            System.out.println("Mensalidade paga por"+ this.getDono());
        }else {
            System.out.println("Impossivel pagar conta fechada");
        }
        
        
        }
    
    
    
//Método Construtor
        public ContaBanco(){
        this.saldo =0;
        this.status= false;
        
        
        }
        
        
        
        //Método Especiais 
    public int getNumConta() {
        return this.numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
