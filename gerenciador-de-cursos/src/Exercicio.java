import java.util.HashMap;
import java.util.Map;

public class Exercicio {

    public static void main(String[] args) {
        
        Map<Integer,String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

        //System.out.println(pessoas.keySet());

        pessoas.keySet().forEach(idade -> {System.out.println("Idade: " + idade);});
        System.out.println("-------------------------------------------------");
        pessoas.values().forEach(nome -> {System.out.println("Nome: "+ nome);});

        System.out.println("-------------------------------------------------");

        Curso javaColeCurso = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColeCurso.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColeCurso.adiciona(new Aula("Criando uma Aula", 20));
        javaColeCurso.adiciona(new Aula("Modelando com coleções", 22));
    
        Aluno aluno1 = new Aluno("Cypher", 987);
        Aluno aluno2 = new Aluno("Jett", 191);
        Aluno aluno3 = new Aluno("Sage", 161);
        Aluno aluno4 = new Aluno("KillJoy", 343);
    
        javaColeCurso.matricula(aluno1);
        javaColeCurso.matricula(aluno2);
        javaColeCurso.matricula(aluno3);
        javaColeCurso.matricula(aluno4);

        System.out.println("Quem é o aluno com matricula 987?");
        Aluno aluno = javaColeCurso.buscaMatriculado(987);
        System.out.println(aluno);


        
    }
    
}
