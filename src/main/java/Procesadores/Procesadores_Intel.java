package Procesadores;

public class Procesadores_Intel extends Procesadores_escritorio{
    boolean Targeta_video;

    public Procesadores_Intel(int Generacion,String Socket, Boolean targeta_video) {
        super(Generacion, Socket);
        Targeta_video = targeta_video;
    }

    public void setTargeta_video(boolean targeta_video) {
        Targeta_video = targeta_video;
    }

    public boolean isTargeta_video() {
        return Targeta_video;
    }
    //Metodo
    public void imprimir_datos_escritorio() {
        System.out.println("El procesador de procesador contiene targeta de video:"+ this.getTargeta_video());
    }
}
