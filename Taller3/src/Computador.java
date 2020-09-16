// Construya la clase Computador con atributos memoria (megabytes) y procesador (gigaflops).
// La memoria y el procesador no pueden ser manipulados desde fuera de la clase. Debe además
// crear el constructor.
// Luego, cree una instancia de la clase Computador, asignándole 4096 megabytes de memoria y
// 5.43 gigaflops de procesador.

public class Computador {
    private int memoria;
    private double procesador;

    public Computador(int memoria, double procesador) {
        this.memoria = memoria;
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public double getProcesador() {
        return procesador;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "memoria=" + memoria +
                ", procesador=" + procesador +
                '}';
    }
}
