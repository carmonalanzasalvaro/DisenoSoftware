package introduccion_java.programa3_clases_objetos;


import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);       
        // menu para crear coche, modificar datos en función del bastidor, mostrar datos de todos los coches, salir.
        int option=0;
        while (option!=4) {
            menu();
            option = sc.nextInt();
            
            switch (option) {
                case 1: //Crear coche

                    CocheFactory.crearCoche();

                    break;
                case 2: //Modificar datos

                    System.out.println("Función no implementada");
                    
                    break;
                case 3: //Mostrar datos de todos los coches

                    mostrarCoches();

                    break;
                case 4: //Salir
                   
                    System.out.println("Saliendo del programa...");
                   
                    break;
                default:

                    System.out.println("Opción no válida");
                
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

    public static void mostrarCoches(){
        System.out.println("Mostrando datos de todos los coches...\n");

        for (int i = 0; i < CocheFactory.getCoches().size(); i++) {
            System.out.println("=========================================");
            System.out.println("Coche " + (i + 1) + ":");
            System.out.println("-----------------------------------------");
            System.out.println(
                "       _______\n" +
                "      //  ||\\ \\\n" +
                " ____//___||_\\ \\___\n" +
                " )  _          _    \\\n" +
                " |_/ \\________/ \\___|\n" +
                "___\\_/________\\_/______"
            );
            System.out.println("-----------------------------------------");
            System.out.println("Bastidor: " + CocheFactory.getCoches().get(i).getBastidor());
            System.out.println("Motor: " + CocheFactory.getCoches().get(i).getMotor() + " cc");
            System.out.println("Peso: " + CocheFactory.getCoches().get(i).getPeso() + " kg");
            System.out.println("Largo: " + CocheFactory.getCoches().get(i).getLargo() + " cm");
            System.out.println("Ancho: " + CocheFactory.getCoches().get(i).getAncho() + " cm");
            System.out.println("Marca: " + CocheFactory.getCoches().get(i).getMarca());
            System.out.println("=========================================\n");
            System.out.println("\n\n");
        }

    }
}

