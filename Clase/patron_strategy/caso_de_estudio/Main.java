package Clase.patron_strategy.caso_de_estudio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Guarderia guarderia = new Guarderia(new StrategyGenerica());
        //Rol de por defecto (!dia 15 o 28)
        System.out.println("Introduzca el día de hoy (número entero): ");
        int dia = sc.nextInt();
        switch (dia) {

            case 15:

                //Rol de oculista
                guarderia.setStrategy(new StrategyOculista());
                System.out.println("\n--- Día 15: Visita del Oculista ---");
                guarderia.realizarConsulta();
                break;
        
            case 28:
                
                //Rol de logopeda
                guarderia.setStrategy(new StrategyLogopeda());
                System.out.println("\n--- Día 28: Visita del Logopeda ---");
                guarderia.realizarConsulta();
                break;
        
            default:
                guarderia.setStrategy(new StrategyGenerica());
                System.out.println("--- Visita del médico de guardia ---");
                guarderia.realizarConsulta();
                break;

        }
        sc.close();

    }
}
