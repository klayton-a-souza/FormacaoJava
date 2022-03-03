public class TesteCurso {

    public static void main(String[] args) {

        Curso javaColeCurso = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColeCurso.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColeCurso.adiciona(new Aula("Criando uma Aula", 20));
        javaColeCurso.adiciona(new Aula("Modelando com coleções", 22));

    }
}
