public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){        

        if(this.saldo >= valor){
            this.saldo -= valor;            
            return true;         
        }
        return false;        
    }

    public boolean transferir(double valor, Conta destino){
        if(this.saldo >= valor){
            sacar(valor);
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }
    
}