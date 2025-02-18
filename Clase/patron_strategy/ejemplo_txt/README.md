# Patrones de Diseño en Java - Strategy Pattern

## Introducción
El **Patrón Strategy** es un patrón de diseño de comportamiento que permite definir una familia de algoritmos, encapsularlos en clases separadas y hacerlos intercambiables sin alterar el código del cliente. En este proyecto, se utiliza este patrón para formatear texto de diferentes maneras (mayúsculas y minúsculas) sin modificar la clase principal `TextEditor`.

Este documento explica en detalle cómo funciona este patrón en nuestro código y cómo se implementa en Java.

---

## Estructura del Proyecto

El código está organizado en varias clases que siguen el **Patrón Strategy**:

1. **`TextFormatter` (Interfaz Strategy):** Define el método que todas las estrategias deben implementar.
2. **`CapTextFormatter` (Estrategia Concreta 1):** Convierte el texto a mayúsculas.
3. **`LowerTextFormatter` (Estrategia Concreta 2):** Convierte el texto a minúsculas.
4. **`TextEditor` (Contexto):** Usa un objeto `TextFormatter` para aplicar la estrategia deseada.
5. **`TestStrategyPattern` (Cliente):** Prueba las diferentes estrategias de formateo.

---

## Implementación y Explicación

### 1. Interfaz `TextFormatter` (Definición de Strategy)
```java
public interface TextFormatter {
    public void format(String text);
}
```
**Explicación:**
- Define el método `format(String text)`, que debe ser implementado por todas las estrategias concretas.

---

### 2. Implementaciones de Estrategias Concretas

#### `CapTextFormatter.java`
```java
public class CapTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("[CapTextFormatter]: " + text.toUpperCase());
    }
}
```
**Explicación:**
- Implementa `TextFormatter`.
- Convierte el texto a mayúsculas y lo imprime con un prefijo identificador.

#### `LowerTextFormatter.java`
```java
public class LowerTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("[LowerTextFormatter]: " + text.toLowerCase());
    }
}
```
**Explicación:**
- Implementa `TextFormatter`.
- Convierte el texto a minúsculas y lo imprime con un prefijo identificador.

---

### 3. Clase `TextEditor` (Contexto que usa la estrategia)
```java
public class TextEditor {
    private TextFormatter textFormatter;

    public TextEditor(TextFormatter textFormatter){
        this.textFormatter = textFormatter;
    }

    public void format(String text){
        textFormatter.format(text);
    }
}
```
**Explicación:**
- `TextEditor` recibe un objeto `TextFormatter` en su constructor, permitiendo cambiar la estrategia en tiempo de ejecución.
- El método `format(String text)` delega el formateo a la estrategia asignada.

---

### 4. Clase `TestStrategyPattern` (Cliente que prueba el patrón)
```java
public class TestStrategyPattern {
    public static void main(String[] args) {
        TextFormatter formatter = new CapTextFormatter();
        TextEditor editor = new TextEditor(formatter);
        editor.format("Testing text in caps formatter");

        formatter = new LowerTextFormatter();
        editor = new TextEditor(formatter);
        editor.format("Testing text in lower formatter");
    }
}
```
**Explicación:**
- Crea una instancia de `CapTextFormatter` y la asigna a `TextEditor`, formateando un texto en mayúsculas.
- Luego cambia a `LowerTextFormatter`, formateando otro texto en minúsculas.
- Demuestra cómo cambiar dinámicamente el comportamiento sin modificar `TextEditor`.

---

## ¿Por qué usar el Patrón Strategy?

1. **Flexibilidad:** Permite cambiar algoritmos en tiempo de ejecución sin modificar el código del cliente.
2. **Código limpio y mantenible:** Evita múltiples condicionales en el código.
3. **Principio de Abierto/Cerrado:** `TextEditor` no necesita cambios para soportar nuevos formatos, solo se agregan nuevas estrategias.

---

## Conclusión
Este proyecto ilustra el uso del **Patrón Strategy** en Java para aplicar diferentes estrategias de formateo de texto. Gracias a este patrón, podemos agregar fácilmente nuevos tipos de formateo sin modificar la estructura existente.

