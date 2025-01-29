package Introduccionjava.Programa1;
import java.util.Scanner;

public class CalculadoraDeEdad {

    public void CalcularEdad() {
        
        int year;

        Scanner scanner = new Scanner(System.in);	
        System.out.println("Ingrese su año de nacimiento: ");
    
        year = scanner.nextInt();
        System.out.println("Su edad es: " + (2024 - year));

        scanner.close();

    }

}