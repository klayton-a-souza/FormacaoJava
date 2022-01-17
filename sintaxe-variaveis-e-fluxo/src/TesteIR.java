public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;

        if((salario >= 1900.0) && (salario <= 2800.0)){
            System.out.println("O seu IR é de 7.5% e você pode deduzir na declaração o valor de R$ 142.00");
        }if ((salario >= 2800.01) && (salario <= 3751.0)) {
            System.out.println("O seu IR é de 15% e você pode deduzir na declaração o valor de R$ 350.00");
        }if ((salario >= 3751.01) && (salario <= 4664.00)){
            System.out.println("O seu IR é de 22.5% e você pode deduzir na declaração o valor de R$ 636.00");
        }

    }
    
}
