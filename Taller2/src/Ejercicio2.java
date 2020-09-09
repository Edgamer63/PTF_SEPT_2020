// Diseñe un programa que, dados dos números ingresados
// por el Usuario, indique cuál es el mayor, el menor o
// si son iguales.
// Consideraciones: los números son enteros

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = lector.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = lector.nextInt();

        if( numero1 > numero2 ) {
            System.out.println("El número "+numero1+" es mayor que "+numero2);
        } else if( numero2 > numero1 ) {
            System.out.println("El número "+numero2+" es mayor que "+numero1);
        } else {
            System.out.println("El número "+numero1+" y "+numero2+" son iguales");
        }
    }
}
