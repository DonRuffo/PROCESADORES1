package Procesadores;

public class Procesadores_moviles extends Procesadores {
    boolean optimizacion_energia;

    public Procesadores_moviles(boolean optimizacion_energia, String nombre, int nucleos, int consumo, double velocidad) {
        super(nombre, nucleos, consumo, velocidad);
        this.optimizacion_energia = optimizacion_energia;
    }

    public Procesadores_moviles() {
    }

    public void setOptimizacion_energia(boolean optimizacion_energia) {
        this.optimizacion_energia = optimizacion_energia;
    }

    public boolean isOptimizacion_energia() {
        return optimizacion_energia;
    }

    public void Imprimir_Datos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Nucleos: "+getNucleos());
        System.out.println("Consumo: "+getConsumo());
        System.out.println("Velocidad: "+getVelocidad());
        System.out.println("Optimización: "+isOptimizacion_energia());
    }
}
