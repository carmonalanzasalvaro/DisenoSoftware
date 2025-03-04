package Sujeto;
import Book.Book;
import java.util.ArrayList;
import java.util.List;

public class AlarmaLibro {
    private List<Observer> observers = new ArrayList<>();
    private Book ultimoLibro; 

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Book book) {
        ultimoLibro = book; 
        for (Observer observer : observers) {
            observer.update(book, this); // Push
        }
    }

    public Book getUltimoLibro() { // Pull
        return ultimoLibro;
    }
}
