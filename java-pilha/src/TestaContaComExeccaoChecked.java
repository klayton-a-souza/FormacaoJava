public class TestaContaComExeccaoChecked {

    public static void main(String[] args) {

        Conta conta = new Conta();
        try{
            conta.depositar();
        }catch(MinhaExecao execao){
            System.out.println("Tratamento.....");
        }
        
        
    }
    
}
