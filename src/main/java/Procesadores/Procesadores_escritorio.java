package Procesadores;

public class Procesadores_escritorio extends Procesadores{
    int Generacion;
    String Socket;

    public Procesadores_escritorio(int generacion, String socket, String nombre, int nucleos, int consumo, double velocidad) {
        super(nombre, nucleos, consumo, velocidad);
        Generacion = generacion;
        Socket = socket;
    }

    public void setGeneracion(int generacion) {
        Generacion = generacion;
    }

    public void setSocket(String socket) {
        Socket = socket;
    }

    public int getGeneracion() {
        return Generacion;
    }

    public String getSocket() {
        return Socket;
    }

    //Metodos
    public void imprimir_datoa_escritorio(){
        System.out.println("Generacion: " + this.getGeneracion());
        System.out.println("Socket: " + this.getSocket());
    }

}
