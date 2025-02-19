package patrones.patron_observer;

public interface Observador {
    void notifica(String mensaje, Sujeto sujeto);
}
