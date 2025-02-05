package Clase.sesion2.coche_herencia;

public class HerencyElectricCar extends Car{

    public HerencyElectricCar(String marca, String modelo, String color, Engine engine) {
        super(marca, modelo, color, engine);
    }
    
    public static void main(String[] args) {
        Engine engine = new Engine("Electric");
        HerencyElectricCar electricCar = new HerencyElectricCar("Tesla", "Model S", "Red", engine);
        electricCar.encender();
        electricCar.avanzar();
        electricCar.parar();
    }
    
}
