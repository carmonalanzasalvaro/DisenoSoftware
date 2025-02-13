package Clase.sesion2.strategy.ejemplo_pokemon;

public class Main {
    public static void main(String[] args) {
        // Crear un Pokémon con un ataque inicial
        Pokemon pikachu = new Pokemon("Pikachu", new PhysicalAttack());

        // Ataca con su estrategia actual
        pikachu.performAttack(); // Pikachu usó un ataque FÍSICO.

        // Cambiar de estrategia a un ataque especial
        pikachu.setAttackStrategy(new SpecialAttack());
        pikachu.performAttack(); // Pikachu lanzó un ataque ESPECIAL.

        // Cambiar de estrategia a un ataque de estado
        pikachu.setAttackStrategy(new StatusAttack());
        pikachu.performAttack(); // Pikachu usó un ataque de ESTADO.
        
    }
}
