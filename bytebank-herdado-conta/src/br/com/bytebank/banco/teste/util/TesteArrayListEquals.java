package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        // Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta contaCorrente = new ContaCorrente(22, 11);
        lista.add(contaCorrente);

        Conta contaCorrente2 = new ContaCorrente(33, 44);
        lista.add(contaCorrente2);

        Conta contaCorrente3 = new ContaCorrente(22, 11);

        boolean existe = lista.contains(contaCorrente2);

        System.out.println("Já existe? " + existe);

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }

}
