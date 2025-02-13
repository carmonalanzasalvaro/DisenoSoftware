package Clase.patron_strategy.caso_de_estudio;

//Estrategia de patron Strategy para el oculista (día 15)


public class StrategyOculista implements Strategy{  //implementamos la interfaz Strategy para añadir una abstracción más. Así guardería no tiene nocion de los métodos contenidos en realizarConsulta.
    @Override
    public void examinar(){
        System.out.println("Examinando a dia 15 con el doctor wang, graduando la vista de los niños ");
    }
    @Override
    public void enviarFactura(){
        System.out.println("Enviando factura a dia 15 con el doctor wang");
    }	
    @Override
    public void enviarResultado(){
        System.out.println("Enviando resultado a dia 15 con el doctor wang");
    }
    @Override
    public void realizarConsulta() {
        this.examinar();
        this.enviarFactura();
        this.enviarResultado();
    }
}
