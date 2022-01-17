public class TestaLacos2 {
    public static void main(String[] args) {
        for (int linha = 0; linha <= 10; linha++) {
            for (int coluna = 0; coluna < 10 /*coluna <= linha*/; coluna++) {               
                //Fazendo a alteração que esta comentada acima o if abaixo nao e necessario, pelo fato que ja estou fazendo a verificação
                if (coluna > linha){
                    break;
                }
                System.out.print("*");
             }
            System.out.println();
             
        }
    }
    
}
