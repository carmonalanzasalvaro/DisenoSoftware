package introduccionjava.programa1;
import java.util.Scanner;

public class CalculadoraDeEdad {

    public void CalculadoraDeEdad() {
        
        int year;

        Scanner scanner = new sc(System.in)
        System.out.println("Ingrese su año de nacimiento: ");
    
        year = scanner.nextInt();
        System.out.println("Su edad es: " + (2024 - year));

        scanner.close();

    }



}