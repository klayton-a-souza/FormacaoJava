package br.com.alura.set;

import java.util.HashSet;
import java.util.Set;

public class TesteSets {

    public static void main(String[] args) {

        Set<String> agente = new HashSet<>();
        agente.add("Cypher");
        agente.add("Sage");
        agente.add("KillJoy");
        agente.add("Sova");
        agente.add("Jett");

        System.out.println(agente.size());        
        agente.add("Cypher"); //Set não aceita valor duplicado

        for (String nome : agente) {
            System.out.println("Agente: " + nome);            
        }

        System.out.println(agente.size());

        //agente.forEach(aluno -> {System.out.println("Agente: " + aluno);});

    }

}
