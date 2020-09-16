// Diseñe un programa que descomponga un número entero en una serie de sumas
// ej: 123456 => 6*1 + 5*10 + 4*100 + 3*1000 + 2*10000 + 1*100000

public class Ejercicio11 {
    public static void main(String[] args) {
        int numero = 123456;

        /*
        numero_texto = "123456"   (String.valueOf( ) )
        Math.pow(10, 0..n-1) (1, 10, 100, 1000
        Math.pow(10,0) === 10^0 = 1
        Math.pow(10,1) === 10^1 = 10
        Math.pow(10,2) === 10^2 === 10*10 = 100
        ...
        Math.pow(10,5) === 10^5 === 10*10*10*10*10 = 100000
         */

        String numero_string = String.valueOf( numero );
        for(int i=0; i<numero_string.length(); i++) {
            char n = numero_string.charAt(i);
            double factor = Math.pow(10, numero_string.length() - i - 1);

            System.out.print(n + "*" + (int) factor);
            if (i < numero_string.length() - 1) System.out.print(" + ");
        }

        // imprimo un salto de linea
        System.out.println("");

        /*
        123456/10 = 12345   ; resto = 6 (123456%10 = 6)
        12345/10 = 1234     ; resto = 5
        1234/10 = 123       ; resto = 4
        ...
        1/10 = 0 = aux      ; resto = 1
        0
         */
        int aux = numero;
        int factor = 1;
        while( aux != 0 ) {
            System.out.print(aux%10+"*"+factor);

            aux = aux/10;
            factor = factor*10;
            if( aux != 0 ) System.out.print(" + ");
        }
    }
}
