package Introduccionjava.Programa3_ClasesYObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CocheFactory {

    private static final List<Coche> coches = new ArrayList<>();
    
    public static void crearCocheUsuario() {
        Scanner sc = new Scanner(System.in); //sc.close() en main

        System.out.println("Introduce el bastidor del coche: ");
        int bastidor = sc.nextInt();
        Coche coche = new Coche(bastidor);

        System.out.println("Introduce cubicaje del motor: ");
        int motor = sc.nextInt();
        coche.setMotor(motor);

        System.out.println("Introduce peso del coche (kg): ");
        int peso = sc.nextInt();
        coche.setPeso(peso);

        System.out.println("Introduce largo del coche (cm): ");
        int largo = sc.nextInt();
        coche.setLargo(largo);

        System.out.println("Introduce ancho del coche (cm): ");
        int ancho = sc.nextInt();
        coche.setAncho(ancho);

        System.out.println("Introduce la marca del coche: ");
        sc.nextLine();  // Consumir salto de línea pendiente
        String marca = sc.nextLine();
        coche.setMarca(marca);

        coches.add(coche);
        
    }

    public static List<Coche> getCoches() {
        return coches;
    }
    
}
