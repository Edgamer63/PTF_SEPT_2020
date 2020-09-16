// Diseñe un programa que cuente la cantidad de caracteres especiales
// en una frase en base a un diccionario.

// frase= hola! mi nombre es juan. #fondeateEnTuCasa
// diccionario= !.#&%¿?  (son caracteres especiales)

public class Ejercicio10 {
    public static void main(String[] args) {
        String frase = "hola! mi nombre es juan. #fondeateEnTuCasa !!!";
        String diccionario = "!.#&%¿?";

        int cantidad_especiales = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if( diccionario.contains(String.valueOf(c)) ) {
                cantidad_especiales++;
            }
        }

        System.out.println("La frase tiene "+cantidad_especiales+" caracteres especiales.");
    }
}
