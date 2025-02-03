package Introduccionjava.Programa3_ClasesYObjetos;

import java.util.Scanner;

public class Coche extends Vehiculo {

    Scanner sc = new Scanner(System.in);
    private String marca;
    public Coche(int bastidor) {
        
        super(bastidor);

        System.out.println("Creando coche con bastidor: " + bastidor);

        System.out.println("Introduce cubicaje del motor: ");
        int motor = sc.nextInt();
        setMotor(motor);

        System.out.println("Introduce peso del coche: ");
        int peso = sc.nextInt();
        setPeso(peso);

        System.out.println("Introduce largo del coche: ");
        int largo = sc.nextInt();
        setLargo(largo);

        System.out.println("Introduce ancho del coche: ");
        int ancho = sc.nextInt();
        setAncho(ancho);

        System.out.println("Introduce la marca del coche: ");
        sc.nextLine();
        marca = sc.nextLine();
        sc.close();
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
