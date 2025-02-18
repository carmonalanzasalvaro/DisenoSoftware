package patrones.patron_strategy.caso_de_estudio;
//Estrategia de patrón strategy que se encarga de realizar una consulta genérica con el doctor correspondiente en caso de que no sea día 15 o 28
public class StrategyGenerica implements Strategy{ //implementamos la interfaz Strategy para añadir una abstracción más. Así guardería no tiene nocion de los métodos contenidos en realizarConsulta.
    @Override
    public void examinar(){
        System.out.println("Examinando a dia <sin especificar> con el doctor correspondiente");
    }
    @Override
    public void enviarFactura(){
        System.out.println("Enviando factura a dia <sin especificar> con el doctor correspondiente");
    }	
    @Override
    public void enviarResultado(){
        System.out.println("Enviando resultado a dia 28 con el doctor correspondiente");
    }   
    @Override
    public void realizarConsulta() {
        this.examinar();
        this.enviarFactura();
        this.enviarResultado();
    }
}
