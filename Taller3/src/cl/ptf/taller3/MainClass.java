package cl.ptf.taller3;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        //Computador asus = new Computador(4096, 5.43);
        //System.out.println(asus.toString());

        // Cree una instancia de la clase SistemaOperativo y haga que ejecute un Programa.
        // El SO debe tener un consumo al azar de memoria (entre 1536 y 4096 megabytes) y
        // carga de trabajo (entre 10 y 1000 gigaflop).
        // El programa debe tener un consumo de memoria y carga de trabajo asignado por el
        // Usuario (por teclado).
        Random rnd = new Random();
        int consumoMemoria = 1536 + rnd.nextInt(4096 + 1 - 1536);
        double cargaTrabajo = Math.random() * (1000 - 10) + 10;
        SistemaOperativo windows = new SistemaOperativo(consumoMemoria, cargaTrabajo);

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese consumo memoria del programa (MB):");
        consumoMemoria = lector.nextInt();
        System.out.println("Ingrese carga de trabajo del programa (gflop):");
        cargaTrabajo = lector.nextDouble();

        Programa chrome = new Programa(consumoMemoria, cargaTrabajo);
        windows.ejecutar(chrome);
    }
}
