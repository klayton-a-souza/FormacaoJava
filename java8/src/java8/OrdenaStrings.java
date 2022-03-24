package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		// palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.sort(Comparator.comparing(s -> s.length()));

		// palavras.sort(Comparator.comparing(String::length));

		// Implementações equivalentes

		System.out.println(palavras);

		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);

		palavras.forEach(System.out::println);

	}

}
