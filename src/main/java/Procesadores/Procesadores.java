package Procesadores;

public class Procesadores {
    String nombre;
    int nucleos, consumo;
    double velocidad;

    public Procesadores(String nombre, int nucleos, int consumo, double velocidad) {
        this.nombre = nombre;
        this.nucleos = nucleos;
        this.consumo = consumo;
        this.velocidad = velocidad;

    }
    public Procesadores() {}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNucleos() {
        return nucleos;
    }

    public int getConsumo() {
        return consumo;
    }

    public double getVelocidad() {
        return velocidad;
    }
}
