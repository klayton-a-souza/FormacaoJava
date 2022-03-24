package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Curso {

	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

}

public class ExemploCursos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));

		// Aqui esta sendo utilizado o filter para filtrar cursos que possui um
		// detrminado numero de alunos.
		// cursos.stream().filter(c -> c.getAlunos() >= 113)
		// .forEach(c -> System.out.println("Nome cursos: " + c.getNome()));
		// ;

		// Aqui esta sendo mostrado o numero d alunos dos cursos que foram filtrados,
		// utilizando o metodo "map" para isso
		// cursos.stream().filter(c -> c.getAlunos() >= 113).map(c -> c.getAlunos())
		// .forEach(total -> System.out.println("Quantidade alunos: " + total));
		;

		// Utilizando o mapToInt e possiveis trabalhar como funçoes como o sum() que
		// soma os valores
		// int sum = cursos.stream().filter(c -> c.getAlunos() >=
		// 113).mapToInt(Curso::getAlunos).sum();

		// System.out.println("Somatoria de alunos: " + sum);

		// Filtrando cursos com mais de 50 alunos
		// cursos.stream().filter(c -> c.getAlunos() > 50).forEach(total ->
		// System.out.println(total.getNome()));

		// cursos.stream().filter(c -> c.getAlunos() >= 100).findFirst().ifPresent(c ->
		// System.out.println(c.getNome()));

		cursos.forEach(c -> System.out.println("Antes: " + c.getNome()));

		cursos.stream().filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
				.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));

		cursos = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());

		cursos.forEach(c -> System.out.println("Depois: " + c.getNome()));
		
		
		OptionalDouble average = cursos.stream().mapToInt(c -> c.getAlunos()).average();
		
		System.out.println(average.getAsDouble());
		
		List<Curso> cursosFiltrados = cursos.stream().filter(c -> c.getAlunos() > 50).collect(Collectors.toList());
		
		cursosFiltrados.forEach(c -> System.out.println(c.getNome()));

	}

}
