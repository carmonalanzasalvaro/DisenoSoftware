package patrones.patron_strategy.ejemplo_pokemon;

class SpecialAttack implements AttackStrategy {
    @Override
    public void attack(String pokemonName) {
        System.out.println(pokemonName + " lanzó un ataque ESPECIAL. ¡Una explosión de energía!");
    }
}
