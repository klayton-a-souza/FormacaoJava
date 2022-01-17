public class TestaConversao {
    public static void main (String[] args){

        double salario = 1270.50;
        //Transformando um valor double para int
        int valor = (int) salario;

        System.out.println("Salario em double: " + salario);
        System.out.println("Salario convertido para int: " +valor);

        //long numeroGrande = 871263876123l;
        //short valorPequeno = 21313;
        //byte valorB = 127;

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1+valor2;

        System.out.println("Valor total da soma " + total);

    }
    
}
