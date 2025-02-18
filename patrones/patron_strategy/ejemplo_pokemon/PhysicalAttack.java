package patrones.patron_strategy.ejemplo_pokemon;

class PhysicalAttack implements AttackStrategy {
    @Override
    public void attack(String pokemonName) {
        System.out.println(pokemonName + " usó un ataque FÍSICO. ¡Golpe poderoso!");
    }

}