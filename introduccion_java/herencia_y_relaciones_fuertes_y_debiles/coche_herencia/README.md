# Proyecto: Modelado de Coches y Motores en Java

Este proyecto tiene como objetivo ilustrar conceptos fundamentales de programación orientada a objetos en Java, como la encapsulación, la herencia y la composición, mediante la simulación de coches y sus motores.

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

1. `Engine`: Representa un motor genérico.
2. `Car`: Representa un coche genérico que utiliza un motor.
3. `HerencyElectricCar`: Representa un coche eléctrico que hereda de `Car`.

A continuación, se detallan cada una de estas clases.

### 1. Clase `Engine`

**Ubicación:** `Clase/sesion2/coche_herencia/Engine.java`

**Descripción:**

La clase `Engine` modela un motor con un atributo `tipo` que indica el tipo de motor (por ejemplo, "Eléctrico", "Gasolina"). Incluye métodos para obtener y establecer el tipo de motor, así como un método para simular el encendido del motor.

**Código:**

```java
package Clase.sesion2.coche_herencia;

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

- **Atributo `tipo`:** Almacena el tipo de motor como una cadena de texto.
- **Constructor:** Inicializa el motor con un tipo específico.
- **Métodos `getTipo` y `setTipo`:** Permiten acceder y modificar el tipo de motor.
- **Método `encender`:** Simula el encendido del motor imprimiendo un mensaje en la consola.

**Razonamiento de Diseño:**

La clase `Engine` está diseñada para ser reutilizable y flexible, permitiendo la creación de diferentes tipos de motores sin necesidad de modificar la clase `Car`. Esto sigue el principio de composición, donde un coche tiene un motor, en lugar de heredar de él.

### 2. Clase `Car`

**Ubicación:** `Clase/sesion2/coche_herencia/Car.java`

**Descripción:**

La clase `Car` modela un coche genérico con atributos como `marca`, `modelo`, `color` y un objeto `Engine`. Incluye métodos para encender el coche, avanzar y detenerse.

**Código:**

```java
package Clase.sesion2.coche_herencia;

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

    public void encender() {
        engine.encender();
    }

    public void avanzar() {
        System.out.println("Coche avanzando");
    }
    
    public void parar() {
        System.out.println("Coche frenando");
    }
}
```

**Explicación:**

- **Encapsulación:** Se utilizan modificadores de acceso `private` para los atributos, protegiendo los datos y proporcionando métodos para su manipulación.
- **Composición:** `Car` tiene un objeto `Engine`, lo que permite cambiar el motor sin afectar la estructura del coche.
- **Métodos:** Se incluyen funcionalidades esenciales como `encender()`, `avanzar()` y `parar()`.

### 3. Clase `HerencyElectricCar`

**Ubicación:** `Clase/sesion2/coche_herencia/HerencyElectricCar.java`

**Descripción:**

Esta clase extiende `Car` para representar un coche eléctrico. Utiliza la herencia para reutilizar funcionalidades y modificar el comportamiento según sea necesario.

**Código:**

```java
package Clase.sesion2.coche_herencia;

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

- **Herencia:** `HerencyElectricCar` hereda de `Car`, aprovechando su estructura base.
- **Comportamiento:** Se prueba en el método `main()` creando un coche eléctrico y utilizando sus métodos.

## Conclusión

Este proyecto demuestra la importancia de la encapsulación, la composición y la herencia en la programación orientada a objetos. Con esta estructura modular, es fácil extender el código para incluir nuevos tipos de coches sin modificar el código existente.

