package Clase.sesion2.coche_herencia;

public class Engine {
    String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Engine(String tipo) {
        this.tipo = tipo;
    }

    public void encender() {
        System.out.println("Motor encendido");
    }

}
