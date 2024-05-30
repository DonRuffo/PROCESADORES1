package Procesadores;

public class Procesadores_Intel extends Procesadores_escritorio{
    boolean Targeta_video;

    public Procesadores_Intel() {}

    public Procesadores_Intel(Boolean targeta_video, int generacion, String socket, String nombre, int nucleos, int consumo, double velocidad) {
        super(generacion, socket,nombre, nucleos, consumo, velocidad);
        Targeta_video = targeta_video;
    }

    public void setTargeta_video(boolean targeta_video) {
        Targeta_video = targeta_video;
    }

    public boolean getTargeta_video() {
        return Targeta_video;
    }
    //Metodo
    public void imprimir_datos_escritorio() {
        System.out.println("El procesador de procesador contiene targeta de video:" + this.getTargeta_video());
    }
}
