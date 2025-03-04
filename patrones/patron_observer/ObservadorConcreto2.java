package patrones.patron_observer.;

public class ObservadorConcreto2 implements Observador{
    
    private String nombre;

    public ObservadorConcreto2(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notifica(String mensaje, Sujeto sujeto) {
        System.out.println(nombre + " recibió actualización notificada por el observador 2: " + mensaje);
    }
}
