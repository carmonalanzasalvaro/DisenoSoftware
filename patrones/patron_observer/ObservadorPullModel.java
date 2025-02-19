package patrones.patron_observer;

public class ObservadorPullModel implements Observador{

    private String nombre;
    
    public ObservadorPullModel(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notifica(String mensaje, Sujeto sujeto) {
        System.out.println(nombre + " recibió actualización notificada por el ObservadorPullModel: " + getState(sujeto));
    }

    public String getState(Sujeto sujeto){
        return sujeto.getState();
    }

}
