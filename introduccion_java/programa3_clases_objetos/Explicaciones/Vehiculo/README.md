# 🚗 Explicación: `Vehiculo.java`

## 📜 ¿Qué es `Vehiculo.java`?
Es la **clase base abstracta** que define la estructura común para todos los vehículos.  
Se usa **herencia** para que otras clases (`Coche`, `Moto`, etc.) extiendan su funcionalidad.

---

## 📌 **¿Por qué `Vehiculo` es una clase `abstract`?**
✔️ **Evita instancias directas de `Vehiculo`**, asegurando que siempre se cree un tipo específico (`Coche`).  
✔️ **Obliga a las subclases** a implementar el método `getTipoVehiculo()`, asegurando que cada vehículo tenga su propio tipo.  
✔️ **Sirve como una plantilla** que define atributos comunes sin tener una implementación concreta.

```java
public abstract class Vehiculo { // 🔹 Clase base abstracta
    private int motor;
    private int peso;
    private int largo;
    private int ancho;
    private final int bastidor;
    private static final List<Integer> bastidoresUsados = new ArrayList<>();
```

---

## 📌 **¿Por qué `bastidor` es `final` y cómo funciona la validación?**
✔️ `final` asegura que **una vez asignado el bastidor, no puede cambiar**.  
✔️ Se usa una **lista estática `bastidoresUsados`** para garantizar que **no haya bastidores duplicados**.

```java
protected Vehiculo(int bastidor) {
    if (bastidoresUsados.contains(bastidor)) {
        throw new IllegalArgumentException("El bastidor ya está en uso");
    }
    this.bastidor = bastidor;
    bastidoresUsados.add(bastidor); // 🔹 Se añade a la lista global de bastidores usados
}
```
📌 **Si un bastidor ya está en la lista, el constructor lanza una excepción `IllegalArgumentException`**  
y evita que se cree un coche con el mismo número de bastidor.

---

## 📌 **¿Por qué algunos atributos son `private` y otros `protected`?**
✔️ `private` impide que **subclases accedan directamente a los atributos**.  
✔️ `protected` permite que **las subclases (`Coche`, `Moto`) accedan sin necesidad de métodos `get/set`**.

| **Modificador**  | **Misma Clase** | **Subclases** | **Mismo Paquete** | **Otras Clases** |
|-----------------|---------------|---------------|----------------|----------------|
| `private`      | ✅ Sí         | ❌ No        | ❌ No         | ❌ No         |
| `protected`    | ✅ Sí         | ✅ Sí        | ✅ Sí         | ❌ No         |

📌 **Ejemplo:**
```java
protected int motor;  // ✅ Visible para `Coche`
private int bastidor; // ❌ No accesible en `Coche`
```

---

## 📌 **Método `abstract getTipoVehiculo()`**
Este método obliga a **todas las subclases** a implementar su propio tipo de vehículo.

```java
public abstract String getTipoVehiculo();
```
✔️ `Coche` implementa este método así:
```java
@Override
public String getTipoVehiculo() {
    return "Turismo";
}
```

---

🔗 **Volver al README principal:**  
[🔙 Ir al README principal](https://github.com/carmonalanzasalvaro/DisenoSoftware/blob/main/introduccion_java/programa3_clases_objetos/README.md)
