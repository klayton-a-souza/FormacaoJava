public class TestaWhile {
    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 10) {
            System.out.println(contador);
            //contador++; tambem funciona, mas so funciona se você somar o valor com + 1
            contador += 1;            
        }

        System.out.println(contador);
    }
    
}
