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
    public Engine() {
        tipo = "Motor por defecto";
    }

    public void encender() {
        System.out.println("Motor encendido");
    }

    @Override
    public String toString() { // toString() hacemos esto para que al imprimir un objeto de esta clase, nos muestre el tipo de motor
        return this.getClass().getSimpleName() + " [tipo=" + tipo + "]";
    }
}
