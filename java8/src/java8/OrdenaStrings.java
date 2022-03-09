package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("ditora casa do codigo");
		palavras.add("caelum");

		Comparator<String> comparador = new ComporadorPorTamanho();
		// Collections.sort(palavras,comparador);
		palavras.sort(comparador);
		System.out.println(palavras);

//		for (String s : palavras) {
//			System.out.println(s);
//		}
//		
//		palavras.forEach(a -> {System.out.println("Palavra: " + a);});
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);

	}

}
