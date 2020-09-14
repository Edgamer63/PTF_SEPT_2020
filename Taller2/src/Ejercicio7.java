// Diseñe un programa que pida un número al Usuario y le
// indique si el número ingresado es primo. Luego de
// indicar si el número es primo o no, debe preguntar al
// Usuario si desea probar otro número.
// Consideraciones: sólo hacer primera parte (saber si es primo
// o no es primo; el número es entero.

// 1 (es primo por definición)
// 2 ; 2%1=0; 2%2=0 (es primo)
// 3 ; 3%1=0; 3%2=1; 3%3=0 (es primo)
// 4 ; 4%1=0; ***4%2=0; 4%3=1; 4%4=0 (no es primo)
// 5 ; 5%1=0; 5%2=1; 5%3=2; 5%4=1; 5%5=0 (es primo)
// 6 ; ***6%2=0; ***6%3=0; 6%4=2; 6%5=1; 6%6=0 (no es primo)

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        boolean pedir_nuevamente = true;

        while (pedir_nuevamente) {
            System.out.println("Ingrese un número:");
            int numero = lector.nextInt();
            lector.nextLine();

            boolean es_primo = true;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    es_primo = false;
                    break;
                }
            }

            if (es_primo) {
                System.out.println("El número " + numero + " es primo");
            } else {
                System.out.println("El número " + numero + " no es primo");
            }

            System.out.println("Desea probar otro número? (si)");
            String opcion = lector.nextLine();
            if (!opcion.equals("si")) {
                pedir_nuevamente = false;
            }
        }

        System.out.println("Fin");

    }
}
