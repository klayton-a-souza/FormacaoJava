package br.com.bytebank.banco.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDeserializacao {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("contaCorrente.bin"));
        ContaCorrente contaCorrente = (ContaCorrente)ois.readObject();
        System.out.println(contaCorrente.getTitular().getNome());
    }
    
}
