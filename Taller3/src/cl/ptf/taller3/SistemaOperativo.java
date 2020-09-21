// Construya la clase SistemaOperativo a partir de la clase Programa.
// La clase SistemaOperativo posee el atributo notebook de la clase Computador.
//
// Inicialice notebook con valores al azar para la memoria (entre 4096 y 32768 megabytes)
// y el procesador (entre 0.25 y 10 gigaflops).


package cl.ptf.taller3;

import java.util.Random;

public class SistemaOperativo extends Programa {
    private Computador notebook;

    public SistemaOperativo(int consumoMemoria, double cargaTrabajo) {
        super(consumoMemoria, cargaTrabajo);

        Random rnd = new Random();
        int memoria = 4096 + rnd.nextInt(32768 + 1 - 4096);
        // rnd.nextInt(32768) -> [0, 32768[ -> [0, 32767]
        // rnd.nextInt(32768+1) -> [0, 32769[ -> [0, 32678]
        // rnd.nextInt(32768+1) + 4096 -> [4096, 36864]
        // rnd.nextInt(32768+1-4096) + 4096 -> [4096, 32768]
        // rnd.nextInt(28673) + 4096 -> [4096, 32768]
        double procesador = Math.random() * (10 - 0.25) + 0.25;
        // Math.random() -> [0, 1[
        // Math.random()*10 -> [0, 10[ -> [0, 9.99] aprox
        // Math.random()*(10-0.25) + 0.25 -> [0.25, 10[ -> [0.25, 9.99]

        // Inicialice en la clase SistemaOperativo la velocidad de red con un valor al azar
        // (entre 1 y 950 Mbps).
        int red = 1 + rnd.nextInt(950);
        notebook = new Computador(memoria, procesador, red);
    }


    // En la clase SistemaOperativo, implemente el método ejecutar que recibe
    // como parámetro un Programa. Antes de ejecutar el programa el SO debe
    // comprobar si tiene memoria suficiente para ejecutarlo, mostrando cuánto
    // tiempo (en segundos) le tomará ejecutar el programa. Considere en la
    // operación, la carga de trabajo del SO, además de la del programa.
    public void ejecutar(Programa p) {
        //this.getConsumoMemoria(); // consumo memoria Sistema Operativo
        //p.getConsumoMemoria(); // consumo memoria Programa a ejecutar
        //notebook.getMemoria(); //capacidad de memoria del Notebook
        int memoria_disponible = notebook.getMemoria() - this.getConsumoMemoria();
        if( memoria_disponible >= p.getConsumoMemoria() ) {
            //this.getCargaTrabajo(); // carga de trabajo en gflop del SO
            //p.getCargaTrabajo(); // carga de trabajo en gflop del Programa
            //this.notebook.getProcesador(); // capacidad en gflop/s de Notebook
            double carga_trabajo_total = p.getCargaTrabajo() + this.getCargaTrabajo();

            double tiempo_segundos = carga_trabajo_total / notebook.getProcesador();
            System.out.println("La ejecución tomará "+tiempo_segundos+" segundos.");
        } else {
            System.out.println("No hay memoria disponible para ejecutar el programa.");
        }

    }

    // Incluya a nivel de SistemaOperativo el método enviarArchivo y envíe un archivo entre dos Computadores.
    // Para enviarArchivo se requiere conocer el peso del archivo en megabytes y el Computador de destino; la
    // transferencia se realizará a la menor velocidad de red disponible entre ambos Computadores.
    // Indique el tiempo estimado de transferencia del archivo.
    public void enviarArchivo( int peso_archivo, Computador destino ) {
        // notebook.getRed(); // velocidad de transferencia de red en Mbps origen
        // destino.getRed(); // velocidad de transferencia de red en Mbps destino
        // peso_archivo; // peso en MB del archivo a transferir (1 MB = 8 bits)
    }

    public Computador getNotebook() {
        return notebook;
    }

}
