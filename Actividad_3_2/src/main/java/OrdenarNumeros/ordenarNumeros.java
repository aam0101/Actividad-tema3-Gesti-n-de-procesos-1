package OrdenarNumeros;
// OrdenarNumeros.ordenarNumeros.java
import java.util.*;

public class ordenarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        while (sc.hasNext()) {
            String token = sc.next();
            try {
                numeros.add(Integer.parseInt(token));
            } catch (NumberFormatException e) {
                // ignorar tokens no válidos
            }
        }
        Collections.sort(numeros);
        for (int n : numeros) {
            System.out.println(n);
        }
        sc.close();
    }
}
