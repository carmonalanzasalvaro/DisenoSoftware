package Observadores;
import Sujeto.Observer;
import Sujeto.AlarmaLibro;
import Book.Book;

public class Stock implements Observer {
    @Override
    public void update(Object obj, AlarmaLibro alarmaLibro) {
        if (obj instanceof Book) { 
            System.out.println("[Stock Push] Se ha devuelto un libro en mal estado: " + (Book) obj);
        } else { 
            System.out.println("[Stock Pull] Último libro consultado: " + alarmaLibro.getUltimoLibro());
        }
    }
}
