import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso2 {

    public static void main(String[] args) {

        Curso javaColeCurso = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColeCurso.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColeCurso.adiciona(new Aula("Criando uma Aula", 20));
        javaColeCurso.adiciona(new Aula("Modelando com coleções", 22));

        List<Aula> aulasImutaveis = javaColeCurso.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis); //Criando uma copia da lista imutavel 

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColeCurso.getTempoTotal());

        System.out.println(javaColeCurso);

        

        /*
         * aulas.forEach(aula -> {
         * System.out.println("Aula: " + aula.getTitulo() + ", com duração de: " +
         * aula.getTempo());
         * });
         */

    }
}