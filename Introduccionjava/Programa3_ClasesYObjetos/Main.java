package Introduccionjava.Programa3_ClasesYObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Coche> coches = new ArrayList<>();        
        // menu para crear coche, modificar datos en función del bastidor, mostrar datos de todos los coches, salir.
        int option=0;
        while (option!=4) {
            menu();
            option = sc.nextInt();
            
            switch (option) {
                case 1: //Crear coche
                   
                    System.out.println("Introduce el bastidor del coche: ");
                    int bastidor = sc.nextInt();
                    Coche coche = new Coche(bastidor);
                    coches.add(coche);

                    break;
                case 2: //Modificar datos
                    System.out.println("Función no implementada");
                    break;
                case 3: //Mostrar datos de todos los coches
                    System.out.println("Mostrando datos de todos los coches...");

                    for(int i=0; i<coches.size(); i++) {

                        System.out.println("Bastidor: " + coches.get(i).getBastidor());
                        System.out.println("\n");
                        System.out.println("Motor: " + coches.get(i).getMotor());
                        System.out.println("Peso: " + coches.get(i).getPeso());
                        System.out.println("Largo: " + coches.get(i).getLargo());
                        System.out.println("Ancho: " + coches.get(i).getAncho());
                        System.out.println("Marca: " + coches.get(i).getMarca());
                        System.out.println("\n\n");
                    }

                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }

    public static void menu() {
        System.out.println("1. Crear coche");
        System.out.println("2. Modificar datos");
        System.out.println("3. Mostrar datos de todos los coches");
        System.out.println("4. Salir");
    }
}

