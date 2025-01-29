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

// Para ver el diagrama UML asociado, consulta el archivo UML_Person_Class_Simple.png en el mismo directorio:
// UML_Person_Class_Simple.png