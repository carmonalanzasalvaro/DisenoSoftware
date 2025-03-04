package Observadores;
import Sujeto.Observer;
import Sujeto.AlarmaLibro;
import Book.Book;

public class Administracion implements Observer {
    @Override
    public void update(Object obj, AlarmaLibro alarmaLibro) {
        if (obj instanceof Book) { 
            System.out.println("[Administración Push] Se registra un libro en mal estado: " + (Book) obj);
        } else { 
            System.out.println("[Administración Pull] Último libro consultado: " + alarmaLibro.getUltimoLibro());
        }
    }
}
