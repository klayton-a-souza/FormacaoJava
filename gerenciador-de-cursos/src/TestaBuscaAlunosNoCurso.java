public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {

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

        System.out.println("Quem é o aluno com matricula 191?");
        Aluno aluno = javaColeCurso.buscaMatriculado(191);
        System.out.println(aluno);

    }

}
