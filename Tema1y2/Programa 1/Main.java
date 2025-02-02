class FormaDeJuego{

    public void muestraFigura(){

        System.out.println("Mostrando forma genérica");

    }

}

class PiezaDeJuego extends FormaDeJuego {

    public void muevePieza(){

        System.out.println("Moviendo pieza de juego");

    }

}
class PiezaDama extends PiezaDeJuego {
    @Override
    public void muestraFigura(){

        System.out.println("Mostrando Dama");

    }

}

public class Main{

    public static void main(String[] args) {
        FormaDeJuego objeto1 = new PiezaDeJuego();
        FormaDeJuego objeto2 = new PiezaDama();
        
        objeto1.muestraFigura();
        objeto2.muestraFigura();
        ((PiezaDama)objeto2).muevePieza();
    }

}