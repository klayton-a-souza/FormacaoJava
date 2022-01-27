package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

    public static void main(String[] args) {
        
        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        ArrayList<String> nomes = new ArrayList<String>();

        Conta contaCorrente = new ContaCorrente(22, 11);
        lista.add(contaCorrente);

        Conta contaCorrente2 = new ContaCorrente(33, 44);
        lista.add(contaCorrente2);

        System.out.println("Tamanho: " + lista.size());

        System.out.println(lista.size()); // Tamanho da lista
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        Conta contaCorrente3 = new ContaCorrente(55, 66);
        lista.add(contaCorrente3);

        Conta contaCorrente4 = new ContaCorrente(77, 88);
        lista.add(contaCorrente4);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("---------------------------------------");

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }

}
