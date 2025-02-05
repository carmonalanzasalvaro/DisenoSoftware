package Clase.sesion2;

public class Wind extends Instrument {
    // Implementación del método abstracto play()
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    // Sobrescritura del método what()
    @Override
    public String what() {
        return "Wind";
    }
}

