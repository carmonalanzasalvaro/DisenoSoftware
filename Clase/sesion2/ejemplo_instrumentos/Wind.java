package Clase.sesion2.ejemplo_instrumentos;

// Wind.java
public class Wind implements Instrument, ElectricSound {
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void electricPlay(Note n) {
        System.out.println("Wind ElectricSound: " + n + " eléctrico");
    }
}


