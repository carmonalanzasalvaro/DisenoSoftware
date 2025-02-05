package Clase.sesion2.coche_herencia;

public class Car {
    private String marca;
    private String modelo;
    private String color;
    private Engine engine;

    public Car(String marca, String modelo, String color, Engine engine) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.engine = engine;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }    
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
   
    public void avanzar() {
        System.out.println("Coche avanzando");
    }
    public void parar() {
        System.out.println("Coche frenando");
    }
    public void encender() {
        engine.encender();
    }
}
