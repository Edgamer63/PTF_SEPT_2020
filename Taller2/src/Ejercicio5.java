import java.util.Scanner;

// Diseñe un programa que calcule y muestre la suma de los números
// pares e impares (por separado), hasta un número ingresado por el Usuario.
// n = 10; impares = 1+3+5+7+9 = 25; pares=2+4+6+8+10=30
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = lector.nextInt();

        int suma_pares = 0;
        int suma_impares = 0;
        for( int i=1; i<=numero; i++ ) {
            if( i%2 == 0 ) {
                //suma_pares = suma_pares+i;
                suma_pares += i;
            } else {
                suma_impares += i;
            }
        }

        System.out.println("La suma de los números pares hasta "+numero+" es "+suma_pares);
        System.out.println("La suma de los números impares hasta "+numero+" es "+suma_impares);
    }
}
