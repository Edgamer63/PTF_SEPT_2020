// Diseñe un programa que imprima 100 letras al azar desde un String
// caracteres= aeiouAEIOU
// palabra= uIaEUAoa... (largo 100)

import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) {
        String caracteres = "aeiouAEIOU";
        Random rnd = new Random();

        // rnd.nextInt(5);   retorna un número al azar entre 0 y 4
        for (int i = 0; i < 100; i++) {
            int pos = rnd.nextInt(caracteres.length());
            System.out.print(caracteres.charAt(pos));
        }
    }
}
