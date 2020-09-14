//Diseñe un programa que, dado un número ingresado por
// el Usuario, muestre la serie de Fibonacci hasta el
// número ingresado. Números son enteros positivos.
// 0, 1, 1, 2, 3, 5, 8, ... N

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = lector.nextInt();

        // primeros dos números de la serie
        long anterior = 0;
        long actual = 1;

        System.out.println(anterior);
        System.out.println(actual);

        long siguiente = 0;
        while( (anterior+actual) <= numero ) {
            siguiente = anterior + actual;

            System.out.println(siguiente);
            anterior = actual;
            actual = siguiente;
        }
    }
}
