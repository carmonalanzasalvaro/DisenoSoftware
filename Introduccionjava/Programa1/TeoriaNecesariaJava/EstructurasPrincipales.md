# Curso de Java 🚀

## **Tipos de datos (primitivos)**
    
### **Enteros**
- `int`: 4 Bytes. (Desde -2,000M hasta 2,000M).
- `short`: 2 Bytes. (Desde -32,000 hasta 32,000).
- `long`: 8 Bytes. (Desde -9T hasta 9T).
- `byte`: 1 Byte.  (Desde -128 hasta 127).

### **Coma flotante**
- `float`: 4 Bytes. (6/7 cifras decimales).
- `double`: 8 Bytes. (15 cifras decimales).

### **Caracteres**
- `char`: 2 Bytes. Usa código Unicode.

### **Booleanos**
- `boolean`: 1 Bit. Solo puede ser `true` o `false`.

---

## **Tipos de datos (no primitivos)**
Los tipos de datos no primitivos son objetos que almacenan datos y proporcionan métodos adicionales.

### **1. Strings (Cadenas de texto)**
```java
String mensaje = "Hola, mundo!";
System.out.println(mensaje.length()); // Longitud del string
System.out.println(mensaje.toUpperCase()); // Convierte a mayúsculas
System.out.println(mensaje.charAt(0)); // Obtiene el primer carácter
```

### **2. Arrays (Arreglos)**
```java
int[] numeros = {1, 2, 3, 4, 5};
System.out.println(numeros[0]); // Acceder al primer elemento

String[] nombres = new String[3]; // Array con 3 espacios
nombres[0] = "Juan";
nombres[1] = "Ana";
nombres[2] = "Pedro";
```

### **3. Clases Envolventes (Wrapper Classes)**
| Tipo primitivo | Clase envolvente |
|---------------|-----------------|
| `int`        | `Integer`       |
| `double`     | `Double`        |
| `char`       | `Character`     |
| `boolean`    | `Boolean`       |

```java
Integer numero = 42;
Double precio = 9.99;
Boolean esVerdadero = true;
```

### **4. Listas (`ArrayList`)**
```java
import java.util.ArrayList;

ArrayList<String> lista = new ArrayList<>();
lista.add("Java");
lista.add("Python");
lista.add("C++");

System.out.println(lista.get(0)); // Obtener el primer elemento
lista.remove(1); // Eliminar "Python"
System.out.println(lista.size()); // Tamaño de la lista
```

---

## **Variables en Java** 🔢
Espacio en memoria donde se almacena un valor que puede cambiar durante la ejecución del programa.

📌 **Reglas:**
- Java es fuertemente tipado, por lo que todas las variables deben declararse con un tipo.
- Java no permite el uso de variables sin inicializar.

Ejemplo:
```java
int edad = 25;
double precio = 10.99;
boolean esMayor = true;
```

---

## **Constantes en Java** 🔒
Se definen usando `final`. Su valor no puede ser modificado después de ser asignado.

```java
final double PI = 3.1416;
```

---

## **Clase en Java** 🏗️
Se entiende por **clase** a una estructura que define atributos (variables) y métodos (funciones) que serán utilizados por sus instancias (objetos).  
Actúa como un molde para crear objetos con características y comportamientos específicos.  
A diferencia de un `struct` en C, una **clase** puede incluir tanto datos como lógica de programación, además de admitir conceptos avanzados como **herencia, encapsulamiento y polimorfismo** en lenguajes orientados a objetos.

```java
class Persona {
    String nombre;
    int edad;
}
```

---

## **Modificadores de acceso** 🔐
Definen la visibilidad de los atributos y métodos de una clase.

| Modificador       | Misma clase | Mismo paquete | Subclases | Otras clases |
|------------------|------------|--------------|-----------|--------------|
| `public`        | ✅         | ✅           | ✅        | ✅           |
| `private`       | ✅         | ❌           | ❌        | ❌           |
| `protected`     | ✅         | ✅           | ✅        | ❌           |
| *(Sin modificador)* | ✅    | ✅           | ❌        | ❌           |

```java
public class Persona {
    String nombre;
    int edad;
}
```

---

## **Métodos en Java** 🛠️
📌 **Reglas:**
- Pueden devolver un valor o ser `void` si no devuelven nada.
- Pueden tener parámetros.
- Se pueden sobrecargar (mismo nombre, diferente cantidad/tipo de parámetros).

Ejemplo:
```java
public class Operaciones {
    public int sumar(int a, int b) {
        return a + b;
    }
}
```

---

## **Constructores en Java** 🏗️
Son métodos especiales que se ejecutan para inicializar un objeto con una serie de valores predeterminados (si es que los tiene).

```java
public class Persona {
    String nombre;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
```

---

## **Herencia y POO en Java** 🏛️
Java soporta los principios de la Programación Orientada a Objetos:

- **Encapsulamiento**: Protege los datos con modificadores de acceso.
- **Herencia**: Permite reutilizar código mediante la palabra clave `extends`.
- **Polimorfismo**: Métodos con el mismo nombre, pero diferente comportamiento.
- **Abstracción**: Definir clases base sin implementación.

Ejemplo de **herencia**:
```java
class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}
```

---

## **Interfaces y Clases Abstractas** 🔄
📌 **Interfaces**: Son como contratos que las clases deben implementar.

```java
interface Vehiculo {
    void acelerar();
}
```

📌 **Clases abstractas**: Pueden tener métodos implementados y sin implementar.

```java
abstract class Figura {
    abstract void dibujar();
}
```

---

## **Excepciones en Java** ⚠️
📌 **Manejo de errores** usando `try-catch-finally`.

```java
try {
    int resultado = 10 / 0; // Provoca error
} catch (ArithmeticException e) {
    System.out.println("Error: división por cero.");
} finally {
    System.out.println("Este bloque siempre se ejecuta.");
}
```

---

## 🚀 **Extras recomendados**
✔️ Bucles (`for`, `while`, `do-while`).  
✔️ Estructuras condicionales (`if`, `switch`).  
✔️ Programación funcional en Java (`Streams`, `Lambdas`).  
✔️ Introducción a bases de datos con JDBC.  
✔️ Introducción a Spring Boot.  

---
💡 **Consejo para tu curso en GitHub**  
- Usa archivos `.md` organizados por temas.  
- Incluye ejemplos prácticos.  
- Agrega ejercicios al final de cada tema.  
- Utiliza imágenes y diagramas para explicar mejor.  

📚 **¡Felicidades por tu curso!** 🚀😊
