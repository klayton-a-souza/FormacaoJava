package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

    public static void main(String[] args) {

        Conta contaCorrente1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        contaCorrente1.setTitular(clienteCC1);
        contaCorrente1.deposita(333.0);

        Conta contaPoupanca1 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        contaPoupanca1.setTitular(clienteCC2);
        contaPoupanca1.deposita(444.0);

        Conta contaCorrente2 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        contaCorrente2.setTitular(clienteCC3);
        contaCorrente2.deposita(111.0);

        Conta contaPoupanca2 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        contaPoupanca2.setTitular(clienteCC4);
        contaPoupanca2.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(contaCorrente1);
        lista.add(contaPoupanca1);
        lista.add(contaCorrente2);
        lista.add(contaPoupanca2);

        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }

        /*
         * NumeroDaContaComparator nComparator = new NumeroDaContaComparator();
         * TitularDaContaComparator tComparator = new TitularDaContaComparator();
         */
        lista.sort(new TitularDaContaComparator());

        Collections.sort(lista, new NumeroDaContaComparator()); 
        Collections.sort(lista);//Orden natural
        //Collections.reverse(lista);
        //Collections.shuffle(lista); Embaralhando os elementos da lista
        //Collections.rotate(list, distance); Rotaciona valores da lista

        System.out.println("----------------------------------------------------------");

        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }

    }
}

class TitularDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();
        return nomeC1.compareTo(nomeC2);

    }

}

class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

        /* return c1.getNumero() - c2.getNumero(); */
        return Integer.compare(c1.getNumero(), c2.getNumero());

    }

}
