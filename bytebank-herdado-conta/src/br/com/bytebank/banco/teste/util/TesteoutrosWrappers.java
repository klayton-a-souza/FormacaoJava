package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteoutrosWrappers {

    public static void main(String[] args) {

        Integer idaeRef = Integer.valueOf(29);  //AutoBoxing
        System.out.println(idaeRef.intValue()); // Unboxing

        Double dRef = Double.valueOf(3.2);
        System.out.println(dRef.doubleValue());

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number refNumero = Float.valueOf(29.9f); //Number a classe mãe dos numericos, assim como a classe Number herda da classe Object
        
        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);
        lista.add(25.6f);

        

        


    }

}
