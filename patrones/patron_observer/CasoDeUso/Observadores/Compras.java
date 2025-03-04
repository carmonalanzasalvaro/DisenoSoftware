package Observadores;
import Sujeto.Observer;
import Sujeto.AlarmaLibro;
import Book.Book;

public class Compras implements Observer {
    @Override
    public void update(Object obj, AlarmaLibro alarmaLibro) {
        if (obj instanceof Book) { 
            System.out.println("[Compras Push] Se requiere comprar un nuevo libro: " + (Book) obj);
        } else { 
            System.out.println("[Compras Pull] Último libro consultado: " + alarmaLibro.getUltimoLibro());
        }
    }
}
