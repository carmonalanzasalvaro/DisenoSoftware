package Book;

public class Book {

    String titulo = "Desconocido";
    String autor = "Desconocido";
    BookState estado = BookState.UNKNOWN;

    public Book(String titulo, String autor, BookState estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public BookState getEstado() {
        return estado;
    }

    public void setEstado(BookState estado) {
        this.estado = estado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", estado=" + estado +
                '}';
    }


}
