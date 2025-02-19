package patrones.patron_observer.patron_observer_dinamico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

class Sujeto {
    
    private String state;
    
    // Un mapa que asocia eventos con listas de listeners
    private HashMap<String, List<Consumer<String>>> listeners = new HashMap<>();

    // Método para agregar eventos dinámicamente (como addEventListener en JS)
    public void agregarListener(String evento, Consumer<String> listener) {
        listeners.computeIfAbsent(evento, k -> new ArrayList<>()).add(listener);
    }

    // Método para eliminar un listener específico
    public void eliminarListener(String evento, Consumer<String> listener) {
        if (listeners.containsKey(evento)) {
            listeners.get(evento).remove(listener);
        }
    }

    // Método para notificar eventos
    public void emitirEvento(String evento, String mensaje) {
        if (listeners.containsKey(evento)) {
            for (Consumer<String> listener : listeners.get(evento)) {
                listener.accept(mensaje);  // Ejecuta cada listener registrado
            }
        }
    }

    // Método para cambiar estado y notificar a los listeners que escuchan "estadoCambiado"
    public void cambiarEstado(String nuevoEstado) {
        this.state = nuevoEstado;
        System.out.println("Cambio de estado: " + nuevoEstado);
        emitirEvento("estadoCambiado", nuevoEstado); // Notificar a los que escuchan "estadoCambiado"
    }
}
