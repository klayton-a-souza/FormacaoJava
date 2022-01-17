public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123,321);
        conta.deposita(200);
        
        try{
            conta.saca(200);
        }catch(SaldoInsuficienteException exception){
            System.out.println("Exception: " + exception.getMessage());
        }        

        System.out.println(conta.saldo);
    }
    
}
