package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Klayton");
        cliente.setProfissao("Dev");
        cliente.setCpf("111.222.333-44");

        ContaCorrente contaCorrente = new ContaCorrente(222, 333);
        contaCorrente.setTitular(cliente);
        contaCorrente.deposita(222.3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("contaCorrente.bin"));
        oos.writeObject(contaCorrente);
        oos.close();
    }

}
