package Tema1y2.Programa3;
//Crear una clase Engine con un atributo tipo que sea asignado mediante su constructor
//Añadir un método encender que imprima por cosola un mensaje tipo + " encendido"
public class Engine {
    private String tipo;

 	public Engine(String tipo) {
 		this.tipo = tipo;
 	}
 
 	public void encender() {
 		System.out.println(tipo + " encendido");
 	}

    //getter y setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}