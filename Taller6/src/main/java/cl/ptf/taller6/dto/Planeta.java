package cl.ptf.taller6.dto;

import java.util.Objects;

public class Planeta {
    private int id;
    private String nombre;
    private int periodoRotacion;
    private int periodoOrbital;
    private int diametro;
    private String clima;
    private String gravedad;
    private String terreno;
    private String aguaSuperficial;
    private long poblacion;

    public Planeta(int id, String nombre, int periodoRotacion, int periodoOrbital, int diametro, String clima, String gravedad, String terreno, String aguaSuperficial, long poblacion) {
        this.id = id;
        this.nombre = nombre;
        this.periodoRotacion = periodoRotacion;
        this.periodoOrbital = periodoOrbital;
        this.diametro = diametro;
        this.clima = clima;
        this.gravedad = gravedad;
        this.terreno = terreno;
        this.aguaSuperficial = aguaSuperficial;
        this.poblacion = poblacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeriodoRotacion() {
        return periodoRotacion;
    }

    public void setPeriodoRotacion(int periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    public int getPeriodoOrbital() {
        return periodoOrbital;
    }

    public void setPeriodoOrbital(int periodoOrbital) {
        this.periodoOrbital = periodoOrbital;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public String getAguaSuperficial() {
        return aguaSuperficial;
    }

    public void setAguaSuperficial(String aguaSuperficial) {
        this.aguaSuperficial = aguaSuperficial;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", periodoRotacion=" + periodoRotacion +
                ", periodoOrbital=" + periodoOrbital +
                ", diametro=" + diametro +
                ", clima='" + clima + '\'' +
                ", gravedad='" + gravedad + '\'' +
                ", terreno='" + terreno + '\'' +
                ", aguaSuperficial='" + aguaSuperficial + '\'' +
                ", poblacion=" + poblacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planeta planeta = (Planeta) o;
        return id == planeta.id &&
                periodoRotacion == planeta.periodoRotacion &&
                periodoOrbital == planeta.periodoOrbital &&
                diametro == planeta.diametro &&
                poblacion == planeta.poblacion &&
                nombre.equals(planeta.nombre) &&
                clima.equals(planeta.clima) &&
                gravedad.equals(planeta.gravedad) &&
                terreno.equals(planeta.terreno) &&
                aguaSuperficial.equals(planeta.aguaSuperficial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, periodoRotacion, periodoOrbital, diametro, clima, gravedad, terreno, aguaSuperficial, poblacion);
    }
}
