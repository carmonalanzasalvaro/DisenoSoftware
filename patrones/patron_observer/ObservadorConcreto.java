package patrones.patron_observer;

public class ObservadorConcreto implements Observador {

    private String nombre;

    public ObservadorConcreto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notifica(String mensaje, Sujeto sujeto) {
        System.out.println(nombre + " recibió actualización notificada por el observador 1: " + mensaje);
    }

}
