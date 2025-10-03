package Aleatorios;
// aleatorios.java
import java.util.*;

public class aleatorios {
    public static void main(String[] args) {
        Random rand = new Random();
        int cantidad = 40;
        for (int i = 0; i < cantidad; i++) {
            System.out.print(rand.nextInt(101)); // 0..100
            if (i < cantidad - 1) System.out.print(" ");
        }
        System.out.println();
    }
}
