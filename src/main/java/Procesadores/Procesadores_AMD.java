package Procesadores;

public class Procesadores_AMD extends Procesadores_escritorio {
    boolean sensortemp;

   public Procesadores_AMD(int generacion, String socket, String nombre, int nucleos, int consumo, double velocidad, boolean sensortemp) {
       super(generacion, socket, nombre, nucleos, consumo, velocidad);
       this.sensortemp = sensortemp;
   }

   public Procesadores_AMD() {}

    public void setSensortemp(boolean sensortemp) {
        this.sensortemp = sensortemp;
    }

    public boolean getSensortemp() {
        return sensortemp;
    }

}
