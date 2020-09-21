package cl.ptf.taller3;// Construya la clase cl.ptf.taller3.Computador con atributos memoria (megabytes) y procesador (gigaflops).
// La memoria y el procesador no pueden ser manipulados desde fuera de la clase. Debe además
// crear el constructor.
// Luego, cree una instancia de la clase cl.ptf.taller3.Computador, asignándole 4096 megabytes de memoria y
// 5.43 gigaflops de procesador.

// Incluya en la clase Computador el atributo red, que representa la velocidad (en Mbps)
// a la cual puede transmitir archivos el computador.
public class Computador {
    private int memoria;
    private double procesador;
    private int red;

    public Computador(int memoria, double procesador, int red) {
        this.memoria = memoria;
        this.procesador = procesador;
        this.red = red;
    }

    public int getMemoria() {
        return memoria;
    }

    public double getProcesador() {
        return procesador;
    }

    public int getRed() {
        return red;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "memoria=" + memoria +
                ", procesador=" + procesador +
                ", red=" + red +
                '}';
    }
}
