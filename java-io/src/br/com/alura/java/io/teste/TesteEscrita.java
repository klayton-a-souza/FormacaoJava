package br.com.alura.java.io.teste;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        
        bw.write("Nesta aula, daremos inicio ao nosso curso focado no pacote java.io.");
        bw.newLine();
        bw.newLine();
        bw.write("Atualmente, nenhuma aplicacao funciona isoladamente e nao receba ou envie dados.");

        bw.close();

    }

}
