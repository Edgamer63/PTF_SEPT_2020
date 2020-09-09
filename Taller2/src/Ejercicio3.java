import java.util.Scanner;

// Diseñe un programa que, dado un número ingresado por
// el Usuario, indique si es positivo, negativo, par o
// impar.
// Consideraciones: el número es entero

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = lector.nextInt();

        if( numero > 0 ) {
            System.out.println(numero+" es positivo");
        } else if( numero < 0 ) {
            System.out.println(numero+" es negativo");
        } else {
            System.out.println(numero+" no es positivo ni negativo");
        }

        if( numero%2 == 0 ) {
            System.out.println(numero+" es par");
        } else {
            System.out.println(numero+" es impar");
        }
    }
}
