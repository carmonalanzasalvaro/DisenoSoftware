# 🚗 Explicación: `Coche.java`

## 📜 **¿Qué es `Coche.java`?**
`Coche` es una subclase de `Vehiculo` que representa un tipo específico de vehículo.  
Esta clase define atributos y métodos específicos para coches, como la marca.  

✔️ **Hereda de `Vehiculo`** para reutilizar atributos y métodos.  
✔️ **Agrega el atributo `marca`** para almacenar información adicional.  
✔️ **Incluye métodos `getMarca()` y `setMarca()`** para acceder y modificar la marca.  

---

## 📌 **Clase `Coche` (Implementación)**
```java
public class Coche extends Vehiculo {
    private String marca;

    public Coche(int bastidor) {
        super(bastidor);
    }

    @Override
    public String getTipoVehiculo() {
        return "Turismo";
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
}
```

---

## 📌 **Explicación de los Métodos**
### **🔹 `Coche(int bastidor)`**
```java
public Coche(int bastidor) {
    super(bastidor);
}
```
✔️ **Llama al constructor de `Vehiculo` usando `super(bastidor)`.**  
✔️ **Verifica que el número de bastidor no esté repetido en `Vehiculo`.**  

---

### **🔹 `getTipoVehiculo()`**
```java
@Override
public String getTipoVehiculo() {
    return "Turismo";
}
```
✔️ **Obliga a `Coche` a definir el tipo de vehículo.**  
✔️ **El método es obligatorio porque `Vehiculo` es abstracto.**  

---

### **🔹 `getMarca()` y `setMarca()`**
```java
public String getMarca() { return marca; }
public void setMarca(String marca) { this.marca = marca; }
```
✔️ **`getMarca()` devuelve la marca actual del coche.**  
✔️ **`setMarca()` permite modificar la marca del coche.**  

---

## 🚀 **¿Por qué `Coche` no maneja la creación de coches?**
📌 **La creación de coches se gestiona en `CocheFactory`.**  
Antes, `Coche` manejaba la entrada del usuario, lo que rompía el **principio de cohesión**.  
Ahora, `Coche` solo **define atributos y métodos**, dejando la creación a `CocheFactory`.

🔍 **Ver más sobre `CocheFactory`:**  
[📂 Explicación de `CocheFactory.java`](https://github.com/carmonalanzasalvaro/DisenoSoftware/blob/main/Introduccionjava/Programa3_ClasesYObjetos/Explicaciones/CocheFactory/README.md)

---

🔗 **Volver al README principal:**  
[🔙 Ir al README principal](https://github.com/carmonalanzasalvaro/DisenoSoftware/blob/main/Introduccionjava/Programa3_ClasesYObjetos/README.md)
