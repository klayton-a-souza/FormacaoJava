package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExercicioMethodReferences {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Wild Cards");
		palavras.add("Livro 1: O começo de Tudo");
		palavras.add("George R.R Martin");

		palavras.sort((s1, s2) -> {
			return Integer.compare(s1.length(), s2.length());
		});

		System.out.println("01: " + palavras);

		palavras.sort(Comparator.comparing(s -> s.length()));

		System.out.println("03: " + palavras);

		palavras.sort(Comparator.comparing(String::length));

		System.out.println("04: " + palavras);
		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);

		System.out.println("06: " + palavras);
		System.out.println();
		
		palavras.forEach(System.out::println);
		
		
		
		

	}

}
