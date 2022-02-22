package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("lorem3.txt");//Estabelecer um fluxo de entrada com arquivo
        Reader isr = new InputStreamReader(fis, "UTF-8");// Transformando dados bytes em caracteres
        BufferedReader br = new BufferedReader(isr); // Consegue ler linha atravez do metodo readLine()

        
        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();

    }

}
