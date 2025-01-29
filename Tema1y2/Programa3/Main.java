package Tema1y2.Programa3;
//Crear una clase main que cree una instancia de motor "eléctrico" y haga una llamada al método encender
class Main {
    public static void main(String[] args) {
        
        Engine motor = new Engine("eléctrico");
        ElectricCar cocheElectrico= new ElectricCar(motor);

        System.out.println("Motor encender");
        motor.encender();
        System.out.println("Coche eléctrico encender");
        cocheElectrico.getMotor().encender();
        cocheElectrico.avanzar();
    }
}

