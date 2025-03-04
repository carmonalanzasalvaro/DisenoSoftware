package Main;
import Book.Book;
import Book.BookState;
import Observadores.Stock;
import Observadores.Compras;
import Observadores.Administracion;

public class LibraryPullPushObserverTest {
    public static void main(String[] args) {
        Library library = new Library();

        Stock stock = new Stock();
        Administracion administracion = new Administracion();
        Compras compras = new Compras();

        library.addObserver(stock);
        library.addObserver(administracion);
        library.addObserver(compras);

        Book bookBad = new Book("Programar sin patrones", "desconocido", BookState.BAD);
        Book bookGood = new Book("Gang of four Design patterns", "Erich Gamma, Richard Helm", BookState.GOOD);

        System.out.println("Alarma notifica bajo protocolo PULL-PUSH");
        library.returnBook(bookGood);
        library.returnBook(bookBad);

        library.removeObserver(compras);

        System.out.println("Alarma vuelve a notificar bajo protocolo PULL-PUSH");
        Book otherBookBad = new Book("Programar sin pensar", "desconocido", BookState.BAD);
        library.returnBook(otherBookBad);
    }
}
