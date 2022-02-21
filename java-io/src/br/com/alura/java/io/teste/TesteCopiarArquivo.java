package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {

        InputStream fis = System.in; //new FileInputStream("lorem.txt");
        //System.in = Entrada pelo teclado.
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = System.out; //new FileOutputStream("lorem3.txt");    
        //System.out = Saida no console.     
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        //Dessa maneira o BufferedWriter fica guardando os valores que foram passado atravez do InputStream ate sair do laço

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()) {            
            bw.write(linha);
            bw.newLine();
            bw.flush(); // Esse metodo e para resolver o problema que o BuffereWriter fica guardando os valores, com ele toda vez que um nova linha seja inserida logo em seguida ela vai aparecer no console.
            linha = br.readLine();

        }

        br.close();
        bw.close();

    }

}
