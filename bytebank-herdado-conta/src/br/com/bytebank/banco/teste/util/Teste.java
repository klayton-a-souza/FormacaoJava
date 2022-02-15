package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

    public static void main(String[] args) {

        Conta contaCorrente1 = new ContaCorrente(22, 33);
        contaCorrente1.deposita(330.0);
        Conta contaPoupanca1 = new ContaPoupanca(22, 44);
        contaPoupanca1.deposita(440.0);
        Conta contaCorrente2 = new ContaCorrente(22, 11);
        contaCorrente2.deposita(111.0);
        Conta contaPoupanca2 = new ContaCorrente(22, 22);
        contaPoupanca2.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(contaCorrente1);
        lista.add(contaPoupanca1);
        lista.add(contaCorrente2);
        lista.add(contaPoupanca2);

        for (Conta conta : lista) {
            System.out.println(conta);
        }

        NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        lista.sort(comparator);

        System.out.println("----------------------------------------------------------");

        for (Conta conta : lista) {
            System.out.println(conta);
        }

    }
}

class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

        if (c1.getNumero() < c2.getNumero()) {
            return -1;
        }
        if (c1.getNumero() > c2.getNumero()) {
            return 1;
        }

        return 0;
    }

}
