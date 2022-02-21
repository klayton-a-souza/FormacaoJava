package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {

        /*
         * OutputStream fos = new FileOutputStream("lorem2.txt");
         * Writer osw = new OutputStreamWriter(fos);
         * BufferedWriter bw = new BufferedWriter(osw);
         */

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        bw.write("Nesta aula, daremos inicio ao nosso curso focado no pacote java.io.");
        bw.newLine();
        bw.newLine();
        bw.write("Atualmente, nenhuma aplicacao funciona isoladamente e nao receba ou envie dados.");

        bw.close();

    }

}
