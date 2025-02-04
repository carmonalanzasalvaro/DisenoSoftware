package Introduccionjava.Programa3_ClasesYObjetos;

import java.util.Scanner;

public class Coche extends Vehiculo {

    Scanner sc = new Scanner(System.in);
    private String marca;
    public Coche(int bastidor) {
        
        super(bastidor);

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
