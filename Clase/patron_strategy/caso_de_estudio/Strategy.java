package Clase.patron_strategy.caso_de_estudio;
//Esta interfaz es la que implementarán las clases concretas de cada estrategia, a su vez, esta interfaz extiende de Consulta para que las clases concretas tengan que implementar el método realizarConsulta.
public interface Strategy extends Consulta{
    void examinar();
    void enviarFactura();
    void enviarResultado();


}
//No hay que implementar el método de consulta?? Aunque sea de una manera absttracta??? es decir, sin inicializar ni nada.