public class TestaFor {

    public static void main(String[] args) {

/*         for (int contador = 0; contador <= 10; contador++) {
            System.out.println(contador);
        }

        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        for (int contador = 0; contador <= 10; contador++) {
            System.out.println(contador);
        }

        for (int i = 0; i <= 100; i += 3) {
            System.out.println(i);
        }

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        } */
        int fatorial = 1;
        for (int i = 1; i <= 11; i++) {
            fatorial *= i;            
            System.out.println("Fatorial de " + i + "= " + fatorial);
        }
    }

}
