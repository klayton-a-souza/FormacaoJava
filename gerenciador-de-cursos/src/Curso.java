import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);// Devolve uma lista que so e possivel fazer leitura
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);

    }

    public int getTempoTotal() {
        int tempoTotal = 0;
        for (Aula aula : aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    @Override
    public String toString() {
        return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + ", " + "\nAulas: " + this.aulas
                + "]";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int numeroMatricula) {
        return matriculaParaAluno.get(numeroMatricula);

    }

    // LinkedHashMap: A ordem que os elementos são adicionados e mantida.
    // HashMap: A ordem dos elementos não e garantida.
    // Hashtable: Segundo quando e trabalhado com varios threads

}
