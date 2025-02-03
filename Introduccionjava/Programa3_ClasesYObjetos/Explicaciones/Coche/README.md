# 🚗 Explicación: `Coche.java`

## 📜 ¿Qué es `Coche.java`?
`Coche` es una subclase de `Vehiculo` que representa un tipo específico de vehículo.  
A diferencia de `Vehiculo`, esta clase solicita **datos adicionales al usuario** y permite gestionar características como **motor, peso, dimensiones y marca**.

---

## 📌 **¿Por qué `Coche` extiende `Vehiculo`?**
✔️ **Aprovecha los atributos y métodos de `Vehiculo`** sin tener que repetir código.  
✔️ **Puede acceder a atributos `protected`** de `Vehiculo`, como `motor`, `peso`, etc.  
✔️ **Asegura que `Coche` tenga un bastidor único**, gracias a la validación en `Vehiculo`.

```java
public class Coche extends Vehiculo {
    private String marca;
    public Coche(int bastidor) {
        super(bastidor);
        System.out.println("Creando coche con bastidor: " + bastidor);
```
📌 **`super(bastidor);` llama al constructor de `Vehiculo`, que valida que el bastidor no esté repetido.**

---

## 📌 **¿Por qué `super(bastidor);` es obligatorio?**
Cuando una subclase **hereda de una superclase con un constructor parametrizado (`Vehiculo(int bastidor)`)**,  
el constructor de la subclase **debe llamar a `super(parametros)` explícitamente**.

✔️ Sin `super(bastidor);`, **el código no compilaría** porque `Vehiculo` no tiene un constructor vacío.

---

## 📌 **¿Cómo `Coche` solicita datos adicionales al usuario?**
✔️ Usa `Scanner` para permitir la entrada de datos en tiempo de ejecución.  
✔️ Captura **cubicaje del motor, peso, largo, ancho y marca**.

```java
Scanner sc = new Scanner(System.in);
System.out.println("Introduce cubicaje del motor: ");
int motor = sc.nextInt();
setMotor(motor);
```

📌 **Después de `nextInt()`, se usa `sc.nextLine();` para limpiar el buffer y evitar errores.**  
Sin esto, `sc.nextLine();` en `marca = sc.nextLine();` podría ser ignorado.

```java
System.out.println("Introduce la marca del coche: ");
sc.nextLine();
marca = sc.nextLine();
```

---

## 📌 **¿Por qué `Coche` implementa `getTipoVehiculo()`?**
`Vehiculo` define este método como **abstracto**, por lo que **todas sus subclases deben implementarlo**.

```java
@Override
public String getTipoVehiculo() {
    return "Turismo";
}
```
✔️ **Cada tipo de vehículo (`Coche`, `Moto`, `Camion`) puede definir su propio tipo.**  
✔️ En este caso, `Coche` devuelve `"Turismo"` en `getTipoVehiculo()`.

---

## 📌 **¿Por qué `getters` y `setters` para `marca`?**
✔️ **Encapsulación:** `marca` es `private`, por lo que solo se puede acceder/modificar con métodos.  
✔️ **Permite modificar la marca después de crear el objeto.**

```java
public String getMarca() { return marca; }
public void setMarca(String marca) { this.marca = marca; }
```

---

🔗 **Volver al README principal:**  
[🔙 Ir al README principal](https://github.com/carmonalanzasalvaro/DisenoSoftware/blob/main/Introduccionjava/Programa3_ClasesYObjetos/README.md)
