import java.util.ArrayList;
import java.util.Collections;

public class AtividadesListas {

    public static void main(String[] args) {

        String curso1 = "Python";
        String curso2 = "Java";
        String curso3 = "SpringBoot";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        // Método forEach
        cursos.forEach(curso -> {
            System.out.println("Nome do curso: " + curso);
        });

        /*
         * // foreach
         * for (String curso : cursos) {
         * System.out.println("Nome do curso: " + curso);
         * }
         * 
         * // for
         * for (int i = 0; i < cursos.size(); i++) {
         * System.out.println("Nome do curso: " + cursos.get(i));
         * }
         */

        // cursos.remove(curso1);

        // System.out.println("O nome do primeiro curso da lista e: " + cursos.get(0));

        System.out.println("-------------------------------");
        Collections.sort(cursos);
        cursos.forEach(curso -> {
            System.out.println("Nome do curso: " + curso);
        });

    }

}
