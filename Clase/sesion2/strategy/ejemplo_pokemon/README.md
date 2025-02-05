# Patrón Strategy aplicado a Ataques en un Juego de Pokémon

## 🎯 Introducción
Este proyecto implementa el **Patrón de Diseño Strategy** para manejar diferentes tipos de ataques en un juego de Pokémon. En lugar de que cada Pokémon tenga una lógica fija de ataque, utilizamos estrategias intercambiables para que pueda cambiar su comportamiento en tiempo de ejecución.

## 📂 Estructura del Proyecto
El código está organizado de la siguiente manera:

1. **Interfaz `AttackStrategy`** → Define el método que todas las estrategias de ataque deben implementar.
2. **Estrategias concretas de ataque:**
   - `PhysicalAttack` → Ataque basado en fuerza física.
   - `SpecialAttack` → Ataque basado en poder especial.
   - `StatusAttack` → No hace daño, pero aplica un estado alterado.
3. **Clase `Pokemon` (Contexto)** → Contiene la estrategia de ataque y puede cambiarla dinámicamente.
4. **Clase `Main`** → Prueba el patrón creando un Pokémon y cambiando sus ataques en tiempo de ejecución.

---

## 🛠 Implementación

### 1️⃣ **Interfaz `AttackStrategy` (Define las estrategias)**
```java
interface AttackStrategy {
    void attack(String pokemonName);
}
```
**Explicación:**
- Define el método `attack(String pokemonName)`, que todas las estrategias deben implementar.

---

### 2️⃣ **Estrategias de Ataque Concretas**

#### `PhysicalAttack.java` (Ataque Físico)
```java
class PhysicalAttack implements AttackStrategy {
    @Override
    public void attack(String pokemonName) {
        System.out.println(pokemonName + " usó un ataque FÍSICO. ¡Golpe poderoso!");
    }
}
```
**Explicación:**
- Implementa `AttackStrategy`.
- Representa un ataque basado en fuerza física.

#### `SpecialAttack.java` (Ataque Especial)
```java
class SpecialAttack implements AttackStrategy {
    @Override
    public void attack(String pokemonName) {
        System.out.println(pokemonName + " lanzó un ataque ESPECIAL. ¡Una explosión de energía!");
    }
}
```
**Explicación:**
- Implementa `AttackStrategy`.
- Representa un ataque basado en poder especial.

#### `StatusAttack.java` (Ataque de Estado)
```java
class StatusAttack implements AttackStrategy {
    @Override
    public void attack(String pokemonName) {
        System.out.println(pokemonName + " usó un ataque de ESTADO. ¡El enemigo está paralizado!");
    }
}
```
**Explicación:**
- Implementa `AttackStrategy`.
- Representa un ataque que aplica un estado alterado sin hacer daño.

---

### 3️⃣ **Clase `Pokemon` (Contexto que usa la estrategia)**
```java
class Pokemon {
    private String name;
    private AttackStrategy attackStrategy; // Se guarda la estrategia actual

    public Pokemon(String name, AttackStrategy attackStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void performAttack() {
        attackStrategy.attack(name);
    }
}
```
**Explicación:**
- `Pokemon` recibe un `AttackStrategy` en su constructor.
- El método `setAttackStrategy()` permite cambiar de ataque en tiempo de ejecución.
- `performAttack()` ejecuta el ataque usando la estrategia actual.

---

### 4️⃣ **Clase `Main` (Cliente que prueba el patrón)**
```java
public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", new PhysicalAttack());
        pikachu.performAttack(); // Pikachu usó un ataque FÍSICO.

        pikachu.setAttackStrategy(new SpecialAttack());
        pikachu.performAttack(); // Pikachu lanzó un ataque ESPECIAL.

        pikachu.setAttackStrategy(new StatusAttack());
        pikachu.performAttack(); // Pikachu usó un ataque de ESTADO.
    }
}
```
**Explicación:**
- Se crea un Pokémon (`Pikachu`) con un ataque físico inicial.
- Luego cambia su estrategia a un ataque especial y después a un ataque de estado.
- Se demuestra cómo cambiar dinámicamente el comportamiento sin modificar `Pokemon`.

---

## 🎯 **¿Por qué usar el Patrón Strategy en Pokémon?**
✅ **Permite cambiar el tipo de ataque sin modificar la clase `Pokemon`.**
✅ **Código más limpio y flexible:** No necesitamos condicionales `if-else` en `Pokemon`.
✅ **Cumple el Principio Abierto/Cerrado (OCP):** Podemos agregar nuevos ataques sin modificar las clases existentes.
✅ **Fácil de expandir:** Si queremos un ataque nuevo (`PoisonAttack`), solo creamos una nueva clase sin modificar `Pokemon`.

---

## 🚀 **Conclusión**
Este proyecto demuestra cómo aplicar el **Patrón Strategy** para manejar diferentes ataques en un juego de Pokémon. Gracias a este patrón, podemos cambiar el ataque de un Pokémon en **tiempo de ejecución** sin modificar su código interno.
