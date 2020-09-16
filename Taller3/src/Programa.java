// Construya la clase Programa con atributos consumoMemoria (megabytes) y cargaTrabajo
// (gigaflop); el consumo de memoria y la carga de trabajo no deben poder ser
// modificados desde el exterior de la clase. Debe además crear el constructor de la clase.

public class Programa {
    private int consumoMemoria;
    private double cargaTrabajo;

    public Programa(int consumoMemoria, double cargaTrabajo) {
        this.consumoMemoria = consumoMemoria;
        this.cargaTrabajo = cargaTrabajo;
    }

    public int getConsumoMemoria() {
        return consumoMemoria;
    }

    public double getCargaTrabajo() {
        return cargaTrabajo;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "consumoMemoria=" + consumoMemoria +
                ", cargaTrabajo=" + cargaTrabajo +
                '}';
    }
}
