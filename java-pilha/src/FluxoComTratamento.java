public class FluxoComTratamento {

    public static void main(String[] args) {
         System.out.println("Ini do main");
        try{
            metodo1();   
        }catch(Exception exception){
            String mensagem = exception.getMessage();
            System.out.println("Exception: " + mensagem);
            exception.printStackTrace();
        }
         
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExecao{
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExecao{
        System.out.println("Ini do metodo2");
        
        throw new MinhaExecao("Rapaz deu merda");

        //System.out.println("Fim do metodo2");
    }
}