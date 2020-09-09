// Diseñe un programa que solicite al Usuario ingresar
// el valor neto de un producto, y a partir de este que
// calcule su IVA (19%) y muestre el total a pagar.
// Consideraciones: mostrar sólo el 19% y además el total (neto+iva).
// Casos de prueba: neto = 100, entonces iva = 19, neto+iva=119.

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el valor neto:");
        int neto = lector.nextInt();

        double iva = neto*0.19;
        iva = neto*19/100;
        double total = neto + iva;
        total = neto*1.19;

        System.out.println("El valor neto es: "+neto);
        System.out.println("El IVA (19%) corresponde a: "+iva);
        System.out.println("El total a pagar es: "+total);
    }
}
