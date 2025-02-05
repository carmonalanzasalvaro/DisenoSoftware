package introduccion_java.programa3_clases_objetos;

import java.util.Scanner;

public class Coche extends Vehiculo {

    Scanner sc = new Scanner(System.in);
    private String marca;
    public Coche(int bastidor) {
        
        super(bastidor);

    }
    
    //Constructor con todos los atributos, no se emplea ahora mismo, pero puede resultar útil en un futuro.
    public Coche(int bastidor, int motor, int peso, int largo, int ancho, String marca) {

        super(bastidor);
        this.setMotor(motor); //Llamada al método setMotor de la clase padre.
        this.setPeso(peso); //Llamada al método setPeso de la clase padre.
        this.setLargo(largo); //Llamada al método setLargo de la clase padre.
        this.setAncho(ancho); //Llamada al método setAncho de la clase padre.

        this.marca = marca; 

    }

    //Implementación del método abstracto.
    @Override
    public String getTipoVehiculo() {
        return "Turismo";
    }
    //Getters y Setters de los nuevos atributos
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
