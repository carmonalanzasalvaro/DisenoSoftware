# Proyecto: Sistema de Herencia para un Coche Eléctrico

Este proyecto implementa una estructura de clases en Java para modelar un coche eléctrico utilizando herencia y encapsulación.

## Archivos y Explicación

### 1. `Engine.java`

**Descripción:**
Esta clase representa un motor, con un atributo `tipo` y métodos para acceder y modificar su valor. Además, cuenta con un método `encender()` para simular el encendido del motor.

**Código relevante:**
```java
public class Engine {
    String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Engine(String tipo) {
        this.tipo = tipo;
    }

    public void encender() {
        System.out.println("Motor encendido");
    }
}
```

**Explicación:**
- Se usa encapsulación para manejar el tipo de motor.
- Se define un constructor para inicializar el tipo de motor.
- Se proporciona un método para encender el motor.

**Razón del diseño:**
Se separa el motor en su propia clase para favorecer la reutilización y modularidad, permitiendo que diferentes coches usen distintos motores sin duplicar código.

---

### 2. `Car.java`

**Descripción:**
Esta clase representa un coche genérico, con atributos para la marca, modelo, color y un motor. También incluye métodos para encender, avanzar y frenar.

**Código relevante:**
```java
public class Car {
    private String marca;
    private String modelo;
    private String color;
    private Engine engine;

    public Car(String marca, String modelo, String color, Engine engine) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.engine = engine;
    }

    public void avanzar() {
        System.out.println("Coche avanzando");
    }
    public void parar() {
        System.out.println("Coche frenando");
    }
    public void encender() {
        engine.encender();
    }
}
```

**Explicación:**
- Se encapsulan los atributos con métodos `getter` y `setter`.
- Se asocia un `Engine` con el coche, promoviendo la composición en lugar de herencia para el motor.
- Métodos `avanzar()`, `parar()` y `encender()` definen el comportamiento básico del coche.

**Razón del diseño:**
Se utiliza la composición para que el coche tenga un motor, en lugar de heredar sus funcionalidades, facilitando la escalabilidad.

---

### 3. `ElectricCar.java`

**Descripción:**
Esta clase representa un coche eléctrico, pero actualmente está vacía.

```java
public class ElectricCar {
    
}
```

**Explicación:**
Es probable que esta clase deba extender `Car` y modificar ciertos comportamientos, pero aún no está implementada.

---

### 4. `HerencyElectricCar.java`

**Descripción:**
Extiende `Car` para representar un coche eléctrico con herencia. En su `main()`, instancia un motor eléctrico y un coche eléctrico, probando sus métodos.

**Código relevante:**
```java
public class HerencyElectricCar extends Car {

    public HerencyElectricCar(String marca, String modelo, String color, Engine engine) {
        super(marca, modelo, color, engine);
    }
    
    public static void main(String[] args) {
        Engine engine = new Engine("Electric");
        HerencyElectricCar electricCar = new HerencyElectricCar("Tesla", "Model S", "Red", engine);
        electricCar.encender();
        electricCar.avanzar();
        electricCar.parar();
    }
}
```

**Explicación:**
- Se extiende `Car` para aprovechar su funcionalidad.
- Se utiliza un `Engine` de tipo "Electric".
- Se prueba la funcionalidad con un `main()`.

**Razón del diseño:**
Se usa herencia para especializar la clase `Car`, representando un coche eléctrico con el mismo comportamiento básico.

---

## Conclusión
Este proyecto ilustra la composición (`Car` tiene un `Engine`) y herencia (`HerencyElectricCar` extiende `Car`). Esta estructura modular facilita la escalabilidad y el mantenimiento del código.