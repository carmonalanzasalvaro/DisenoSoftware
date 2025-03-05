package patron_observer_libreria;

public class Main {
    public static void main(String[] args) {
        Sujeto sujeto = new Sujeto();

        // Crear observadores
        ObservadorConcreto obs1 = new ObservadorConcreto("Observador 1");
        ObservadorConcreto obs2 = new ObservadorConcreto("Observador 2");

        // Registrar observadores en el sujeto
        sujeto.addObserver(obs1);
        sujeto.addObserver(obs2);

        // Simular cambios de estado
        sujeto.cambiarEstado("Activo");
        sujeto.cambiarEstado("Inactivo");
        
    }
}

