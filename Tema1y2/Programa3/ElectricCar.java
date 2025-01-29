package Tema1y2.Programa3;
//Crear una clase electricCar que contenga un motor eléctrico
public class ElectricCar {
    private Engine motor;
    
    public ElectricCar(Engine motor) {
        this.motor = motor;
    }
    
    public void avanzar() {
        System.out.println("Avanzando...");

    }

    public Engine getMotor() {
        return motor;
    }
    
}
