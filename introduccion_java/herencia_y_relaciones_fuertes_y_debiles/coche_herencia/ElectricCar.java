package introduccion_java.herencia_y_relaciones_fuertes_y_debiles.coche_herencia;

public class ElectricCar extends Car {

    // Constructor que inicializa todos los atributos y crea un motor internamente
    public ElectricCar(String marca, String modelo, String color) {
        super(marca, modelo, color, new Engine("Electric")); // El motor se crea dentro del constructor
    }

    @Override
    public String toString() {
        return "ElectricCar [marca=" + getMarca() + ", modelo=" + getModelo() + 
            ", color=" + getColor() + ", motor=" + getEngine().toString() + "]";
    }

    public static void main(String[] args) {
        // Crear instancia de ElectricCar
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", "Red");

        // Imprimir detalles del coche
        System.out.println(electricCar.toString());
        
        // Probar métodos
        electricCar.encender();
        electricCar.avanzar();
        electricCar.parar();
    }
}
