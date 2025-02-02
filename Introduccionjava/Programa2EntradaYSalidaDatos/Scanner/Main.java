package Introduccionjava.Programa2EntradaYSalidaDatos.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // 📌 Crear un objeto Scanner para leer datos desde la consola
        Scanner scanner = new Scanner(System.in);

        // 📌 Leer un texto introducido por el usuario
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre + "!");

        // 📌 Leer un número entero
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Tienes " + edad + " años.");

        // 📌 Leer un número decimal
        System.out.print("Introduce tu altura en metros: ");
        double altura = scanner.nextDouble();
        System.out.println("Tu altura es " + altura + " metros.");

        // 📌 Leer un solo carácter (se debe consumir el salto de línea antes)
        scanner.nextLine(); // Consumir la línea pendiente
        System.out.print("Introduce la inicial de tu apellido: ");
        char inicial = scanner.nextLine().charAt(0);
        System.out.println("Tu inicial es: " + inicial);

        // 📌 Leer un valor booleano (true o false)
        System.out.print("¿Eres mayor de edad? (true/false): ");
        boolean mayorDeEdad = scanner.nextBoolean();
        System.out.println("Mayor de edad: " + mayorDeEdad);

        // 📌 Leer múltiples palabras separadas por espacios
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Introduce tu ciudad y país: ");
        String ciudadYPais = scanner.nextLine();
        System.out.println("Vives en: " + ciudadYPais);

        // 📌 Cerrar el Scanner (importante para liberar recursos)
        scanner.close();
    }
}
