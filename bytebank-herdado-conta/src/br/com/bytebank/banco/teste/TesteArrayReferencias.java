package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        int numeroDeContas = 5;
        ContaCorrente[] contas = new ContaCorrente[numeroDeContas];

        ContaCorrente contaCorrente = new ContaCorrente(22, 11);
        contas[0] = contaCorrente;
        
        ContaCorrente contaCorrente2 = new ContaCorrente(22, 22);
        contas[1] = contaCorrente2;

        System.out.println(contas[1].getNumero());

    }

}
