package patrones.patron_observer.patron_observer_libreria;

import java.util.Observable;
import java.util.Observer;

public class ObservadorConcreto implements Observer {

    private String nombre;

    public ObservadorConcreto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(Observable sujeto, Object nuevoEstado) {
        System.out.println(nombre + " recibió actualización: " + nuevoEstado);
    }
}
