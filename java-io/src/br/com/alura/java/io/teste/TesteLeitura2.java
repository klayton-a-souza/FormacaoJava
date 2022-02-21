package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            //System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US); 
            //Essa linha fala para o compilador qual regra deve usar, no brasil os 
            //valores são separados por virgulas, diferente dos estados unidos que
            //separado por ponto. Logo escrevendo essa linha de codigo indicamos para
            //o compilador qual regra deve usar.
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            
            System.out.format("%s - %04d-%d %25s: %.2f %n", tipoConta, agencia, numero, titular, saldo);

            //System.out.println(tipoConta + agencia + numero + titular + saldo);

            linhaScanner.close();

            /*
             * String[] valores = linha.split(",");
             * System.out.println(Arrays.toString(valores));
             * System.out.println(valores[3]);
             */

        }

        scanner.close();
    }
}
