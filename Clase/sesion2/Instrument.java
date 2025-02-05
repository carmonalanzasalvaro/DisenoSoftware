package Clase.sesion2;


public abstract class Instrument {
    // Método abstracto que debe ser implementado en las subclases
    public abstract void play(Note n);

    // Método no abstracto, que puede ser sobrescrito en las subclases
    public String what() {
        return "Instrument";
    }
}
