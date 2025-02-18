package introduccion_java.herencia_y_relaciones_fuertes_y_debiles.ejemplo_instrumentos;

public class MusicTest {
    // Método que afina un instrumento individual
    static void tune(Instrument instrument) {
        instrument.play(Note.DO);
    }

    // Método que afina todos los instrumentos en un arreglo
    static void tuneAll(Instrument[] instruments) {
        for (Instrument i : instruments) {
            tune(i);
        }
    }

    // Método para probar sonido eléctrico
    static void testElectricSound(Instrument[] instruments) {
        for (Instrument i : instruments) {
            if (i instanceof ElectricSound) {
                ((ElectricSound) i).electricPlay(Note.RE);
            } else {
                System.out.println(i.what() + " no soporta sonido eléctrico.");
            }
        }
    }

    public static void main(String[] args) {
        // Crear un arreglo de Instrumentos
        Instrument[] orchestra = {
            new Wind()
        };

        // Afinar todos los instrumentos
        tuneAll(orchestra);

        // Probar sonido eléctrico
        testElectricSound(orchestra);
    }
}


