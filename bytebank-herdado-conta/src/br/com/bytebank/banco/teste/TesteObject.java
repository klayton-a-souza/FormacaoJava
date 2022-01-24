package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {
    public static void main(String[] args) {

        System.out.println();

        ContaCorrente contaCorrente = new ContaCorrente(22, 33);
        ContaPoupanca contaPoupanca = new ContaPoupanca(33,22);
        Cliente cliente = new Cliente();

        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
    }

    static void println(Object o){}


}
