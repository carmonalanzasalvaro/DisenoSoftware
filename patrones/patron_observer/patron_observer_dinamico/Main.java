package patrones.patron_observer.patron_observer_dinamico;

public class Main {
    public static void main(String[] args) {

        Sujeto sujeto = new Sujeto();

        // Agregar listeners dinámicamente
        sujeto.agregarListener("estadoCambiado", estado -> System.out.println("Listener 1: El estado cambió a " + estado));
        sujeto.agregarListener("estadoCambiado", estado -> System.out.println("Listener 2: Notificado del cambio a " + estado));

        // Simular cambios de estado
        sujeto.cambiarEstado("Activo");
        sujeto.cambiarEstado("Inactivo");

    }
}

