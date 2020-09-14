// Diseñe un programa que, dado un número ingresado por
// el Usuario, calcule y muestre el factorial de ese
// número.
// Consideraciones: el número es entero

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = lector.nextInt();

        System.out.println(numero + "! = " + factorial(numero));

        // otra forma
        int resultado = 1;
        for( int i=1; i<=numero; i++ ) {
            resultado = resultado*i;
        }
        System.out.println(numero + "! = " + resultado);

        // otra forma
        resultado = 1;
        int n = numero;
        while( n != 0 ) {
            resultado = resultado*n;
            n--;
        }
        System.out.println(numero + "! = " + resultado);
    }

    // version recursiva
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}