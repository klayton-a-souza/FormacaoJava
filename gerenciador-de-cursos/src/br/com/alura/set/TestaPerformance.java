package br.com.alura.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {

        Collection<Integer> numeros = new ArrayList<Integer>();

        long inicio = System.currentTimeMillis();
        long inicioPrimeiroFor = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        long fimPrimeiroFor = System.currentTimeMillis();
        long tempoPrimeiroFor = fimPrimeiroFor - inicioPrimeiroFor;
        System.out.println("Tempo do primeiro for: " + tempoPrimeiroFor);

        long inicioSegundoFor = System.currentTimeMillis();

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fimSegundoFor = System.currentTimeMillis();
        long tempoSegundoFor = fimSegundoFor - inicioSegundoFor;
        System.out.println("Tempo do segundo for: " + tempoSegundoFor);

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);

        //Tempo gasto: (ArrayList = 1320)(HashSet = 18)

        //HashSet: (1º for = 10)(2º for = 21)(Total = 37)
        //ArrayList: (1º for = 5)(2º for = 1541)(Total = 1548)

    }

}