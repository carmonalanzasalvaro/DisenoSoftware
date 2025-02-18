package patrones.patron_strategy.ejemplo_pokemon;

class StatusAttack implements AttackStrategy {
    @Override
    public void attack(String pokemonName) {
        System.out.println(pokemonName + " usó un ataque de ESTADO. ¡El enemigo está paralizado!");
    }
}
