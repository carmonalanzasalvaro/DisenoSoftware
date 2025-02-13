package Clase.patron_strategy.caso_de_estudio;
//contexto
public class Guarderia{

    private Strategy strategy;

    public Guarderia(Strategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void realizarConsulta(){
       strategy.realizarConsulta();
    }
}
