package Introduccionjava.Programa3_ClasesYObjetos;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {

    //Atributos
    private int ruedas; 
    private int largo;
    private int ancho;
    private int motor; //en cc
    private int peso; //en kg
    private final int bastidor; //Si lo dejamos sin inicializar, se podrá asignar un valor en la creación del vehículo pero no será modificable.

    // 📌 Lista estática para almacenar bastidores usados
    private static final List<Integer> bastidoresUsados = new ArrayList<>(); //Static significa que es un atributo de la clase, no del objeto. Por lo que será una variable "Global" para cada objeto.

    //Métodos
    private static boolean comprobarBastidor(int bastidor) {
        return bastidoresUsados.contains(bastidor);
    }
    //Método que definirán posteriormente las clases hijas
    public abstract String getTipoVehiculo();

    //Constructor
    protected Vehiculo(int bastidor) {
        
        if (comprobarBastidor(bastidor)) {
            throw new IllegalArgumentException("El bastidor ya está en uso");
        } else {
            bastidoresUsados.add(bastidor);
        }

        this.ruedas = 4; 
        this.largo = 2000;
        this.ancho = 300;
        this.motor = 1600;
        this.peso = 1000;
        this.bastidor = bastidor;
    }

    //GETTERS Y SETTERS DE TODOS LOS ATRIBUTOS
    public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public int getLargo() {
        return largo;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public int getMotor() {
        return motor;
    }
    public void setMotor(int motor) {
        this.motor = motor;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getBastidor() { //No asignamos un setter para el bastidor ya que no queremos que se pueda modificar una vez creado.
        return bastidor;
    }
    public static List<Integer> getBastidoresUsados() {
        return bastidoresUsados;
    }
}

