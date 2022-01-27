package br.com.bytebank.banco.teste;

import java.util.MissingFormatArgumentException;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencias {

    public static void main(String[] args) {
        GuardadorDeReferencias guardadorDeReferencias = new GuardadorDeReferencias();

        Conta contaCorrente = new ContaCorrente(22,11);
        guardadorDeReferencias.adiciona(contaCorrente);

        Conta contaCorrente2 = new ContaCorrente(33,44);
        guardadorDeReferencias.adiciona(contaCorrente2);

        int tamanho = guardadorDeReferencias.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta referencia = (Conta) guardadorDeReferencias.getReferencia(1);
        System.out.println(referencia.getNumero());

        

        
    }
    
}
