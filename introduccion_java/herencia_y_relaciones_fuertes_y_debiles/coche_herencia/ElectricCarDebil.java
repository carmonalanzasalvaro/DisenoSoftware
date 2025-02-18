package introduccion_java.herencia_y_relaciones_fuertes_y_debiles.coche_herencia;

public class ElectricCarDebil extends Car{

    public ElectricCarDebil(String marca, String modelo, String color, Engine engine) {
        super(marca, modelo, color, engine);
    }
    
    public static void main(String[] args) {
        Engine electricEngine = new Engine("Electric");
        ElectricCarDebil electricCarDebil = new ElectricCarDebil("Tesla", "Model 3", "Red", electricEngine);
        System.out.println(electricCarDebil.toString()); 
        electricCarDebil.encender();
        electricCarDebil.avanzar();
        electricCarDebil.parar();
    }
    
    @Override
    public String toString() {
        return "ElectricCar [marca=" + getMarca() + ", modelo=" + getModelo() + 
            ", color=" + getColor() + ", motor=" + getEngine().toString() + "]";
    }
    
}
