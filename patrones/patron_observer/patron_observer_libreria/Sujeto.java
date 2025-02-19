package patrones.patron_observer.patron_observer_libreria;

import java.util.Observable;

public class Sujeto extends Observable {
    private String estado;

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Sujeto cambió de estado a: " + nuevoEstado);
        
        setChanged(); // Marca que hubo un cambio en el sujeto
        notifyObservers(nuevoEstado); // Notifica a los observadores y les pasa el nuevo estado
    }

    public String getEstado() {
        return estado;
    }
}
