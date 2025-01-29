package Tema1y2.Programa2;

public class Main {
    public static void main(String[] args) {
        
        Coche coche1 = new Coche("Toyota", "Corolla", "Rojo");
        Coche coche2 = new Coche("Honda", "Civic", "Azul");

    
        coche1.imprimir();
        System.out.println();
        coche2.imprimir();
    }
}
