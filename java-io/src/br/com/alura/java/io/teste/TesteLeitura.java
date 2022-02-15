package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("lorem.txt");// Entrada do arquivo binarios
        InputStreamReader isr = new InputStreamReader(fis);// Transformando dados binarios em caracters
        BufferedReader br = new BufferedReader(isr); // Consegue ler linha atravez do metodo readLine()

        String linha = br.readLine();

        System.out.println(linha);

        br.close();


    }

}
