package patrones.patron_strategy.ejemplo_pokemon;

class Pokemon {
    private String name;
    private AttackStrategy attackStrategy; // Se guarda la estrategia actual

    // Constructor que asigna un ataque por defecto
    public Pokemon(String name, AttackStrategy attackStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
    }

    // Método para cambiar la estrategia de ataque en tiempo de ejecución
    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    // Método para ejecutar el ataque actual
    public void performAttack() {
        attackStrategy.attack(name);
    }
}
