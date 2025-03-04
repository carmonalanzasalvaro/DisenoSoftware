package Main;
import Sujeto.AlarmaLibro;
import Sujeto.Observer;
import Book.Book;
import Book.BookState;

public class Library {
    private AlarmaLibro alarmaLibro = new AlarmaLibro();

    public void addObserver(Observer observer) {
        alarmaLibro.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        alarmaLibro.removeObserver(observer);
    }

    public void returnBook(Book book) {
        if (book.getEstado() == BookState.BAD) {
            alarmaLibro.notifyObservers(book);
        }
    }
}
