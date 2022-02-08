package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        Integer idadeRef = 29; // autoboxinng, é criado um objeto do tipo Integer
        int primitivo = new Integer(21); // que locoura!! unboxing

        List<Integer> lista = new ArrayList<>();
        lista.add(idadeRef); // ok
        lista.add(primitivo); // autoboxing

        int i1 = lista.get(0); // unboxing
        Integer i2 = lista.get(1); // ok

        System.out.println(i1); // 29
        System.out.println(i2); // 21

        Integer valorRef = Integer.valueOf(33); // Delegando a criação para método valueOf
        int valorPri = valorRef.intValue(); // Desembrulhando, pegando o valor primitivo do objeto wrapper

        System.out.println(valorPri); // 33

        Integer iParseado1 = Integer.valueOf("42"); // Parseando e devolvendo referencia
        int iParseado2 = Integer.parseInt("44"); // Parseando e devolvendo primitivo

        System.out.println(iParseado1); // 42
        System.out.println(iParseado2); // 44

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE); // 32 bites
        System.out.println(Integer.BYTES); // 4 Bytes

    }

}
