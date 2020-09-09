// Diseñe un programa que, dados dos números ingresados
// por el Usuario, calcule y muestre la suma de ellos.
// Consideraciones: los números son enteros.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = lector.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = lector.nextInt();

        int suma = numero1 + numero2;
        System.out.println("La suma de "+numero1+" y "+numero2+" es: "+suma);
    }
}
