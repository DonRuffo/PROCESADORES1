package Procesadores;

public class Procesadores_escritorio {
    int Generacion;
    String Socket;

    public Procesadores_escritorio(int generacion, String socket) {
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
