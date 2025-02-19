package patrones.patron_observer;

import java.util.ArrayList;
import java.util.List;

public class Sujeto{
    private String state;
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador observador){

        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador){
        observadores.remove(observador);
    }

    public void eliminarObservadores(){
        observadores.clear();
    }

    public void notificarObservadores(String mensaje){

        for (Observador observador : this.observadores){
            observador.notifica(this.getState(), this);
        }

    }

    //Metodo para simular un cambio de estado
    public void cambiarEstado(String nuevoEstado) {

        setState(nuevoEstado);
        System.out.println("Sujeto cambió de estado a: " + nuevoEstado);
        notificarObservadores(nuevoEstado);
        
    }

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state = state;
    }
}