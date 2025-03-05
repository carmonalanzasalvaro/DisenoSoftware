package patron_observer_explicativo;
//Publicador - Suscriptor --> Sujeto - Observador
public class Main {
    public static void main(String[] args) {

        Sujeto sujeto = new Sujeto();

        Observador obs1 = new ObservadorConcreto("Observador 1"); 
        Observador obs2 = new ObservadorConcreto2("Observador 2");
        Observador obs3 = new ObservadorPullModel("ObservadorPull");

        sujeto.agregarObservador(obs1); //Al hacer esto, estamos rellenando un observador en la lista de sujeto.
        sujeto.agregarObservador(obs2);
        sujeto.agregarObservador(obs3);
        
        // Simular un cambio en el sujeto
        sujeto.cambiarEstado("Activo");
        sujeto.cambiarEstado("Inactivo");
        

        sujeto.eliminarObservadores();
        
    }
}
