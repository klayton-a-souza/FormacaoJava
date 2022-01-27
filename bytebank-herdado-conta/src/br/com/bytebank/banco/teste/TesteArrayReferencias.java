package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        int numeroDeContas = 5;
        Object[] referencias = new Conta[numeroDeContas];

        ContaCorrente contaCorrente = new ContaCorrente(22, 11);
        referencias[0] = contaCorrente;

        ContaPoupanca contaCorrente2 = new ContaPoupanca(22, 22);
        referencias[1] = contaCorrente2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        /*
         * System.out.println(contaCorrente2.getNumero());
         * 
         * Object referenciaGenerica = referencias[1];
         * 
         * System.out.println(referencias[1].getNumero());
         */
        ContaPoupanca ref = (ContaPoupanca) referencias[1]; // type cast, deixando claro para o compilador qual tipo vai
                                                            // ser trabalhado.
        System.out.println(contaCorrente2.getNumero());
        System.out.println(ref.getNumero());

    }

}
