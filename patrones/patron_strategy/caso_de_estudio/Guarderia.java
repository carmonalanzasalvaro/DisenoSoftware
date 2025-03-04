package patrones.patron_strategy.caso_de_estudio;
//contexto: Se entiende por contexto al objeto que variará su comportamiento en función de la estrategia que se le pase.
public class Guarderia{

    private Strategy strategy;
    
    public Guarderia(Strategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    //Cuando se llame a este método, guardería en verdad no sabe qué está haciendo,
    // solo que está llamando al método que casualmente tiene el mismo nombre,
    // perteneciente a la clase del objeto instanciado previamente. 
    public void realizarConsulta(){
       strategy.realizarConsulta();
    }
}
