package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {

        //Shift + Alt + O => para organizar os imports

        /*
         * OutputStream fos = new FileOutputStream("lorem2.txt");
         * Writer osw = new OutputStreamWriter(fos);
         * BufferedWriter bw = new BufferedWriter(osw);
         */

        // BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        // PrintStream ps = new PrintStream("lorem2.txt");
        //PrintStream ps = new PrintStream(new File("lorem2.txt"));
        PrintWriter ps = new PrintWriter("lorem3.txt", "UTF-8");
        
        ps.println("Nesta aula, daremos início ao nosso curso focado no pacote java.io.");
        ps.println();
        ps.println();
        ps.println("Atualmente, nenhuma aplicacão funciona isoladamente e nao receba ou envie dados.");
        ps.close();

    }

}
