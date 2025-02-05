package Clase.sesion2;

public class MusicTest {
    // Método que afina un instrumento individual
    static void tune(Instrument instrument) {
        instrument.play(Note.DO); // Delegación
    }

    // Método que afina todos los instrumentos en un arreglo
    static void tuneAll(Instrument[] instruments) {
        for (Instrument i : instruments) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        // Crear un arreglo de Instrumentos
        Instrument[] orchestra = {
            new Wind()
        };

        // Afinar todos los instrumentos
        tuneAll(orchestra);
    }
}

