# 🏭 Explicación: `CocheFactory.java`

## 📜 **¿Qué es `CocheFactory.java`?**
`CocheFactory` es una clase **centralizada** para la gestión de coches.  
✔️ **Maneja la lista de coches como un atributo estático.**  
✔️ **Encapsula la lógica de creación de coches.**  
✔️ **Evita la dependencia de `Scanner` en `Main.java`.**  

📌 **Antes**, `Main.java` manejaba la lista de coches. Ahora, `CocheFactory` lo hace, permitiendo que `Main.java` solo gestione la interacción con el usuario.

---

## 📌 **Clase `CocheFactory` (Implementación)**
```java
public class CocheFactory {
    private static final List<Coche> coches = new ArrayList<>();

    public static void crearCocheUsuario() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el bastidor del coche: ");
        int bastidor = sc.nextInt();
        Coche coche = new Coche(bastidor);

        System.out.println("Introduce cubicaje del motor: ");
        int motor = sc.nextInt();
        coche.setMotor(motor);

        System.out.println("Introduce peso del coche (kg): ");
        int peso = sc.nextInt();
        coche.setPeso(peso);

        System.out.println("Introduce largo del coche (cm): ");
        int largo = sc.nextInt();
        coche.setLargo(largo);

        System.out.println("Introduce ancho del coche (cm): ");
        int ancho = sc.nextInt();
        coche.setAncho(ancho);

        sc.nextLine();  // Consumir el salto de línea pendiente
        System.out.println("Introduce la marca del coche: ");
        String marca = sc.nextLine();
        coche.setMarca(marca);

        coches.add(coche);
        System.out.println("🚗 Coche creado exitosamente.");
    }

    public static List<Coche> getCoches() {
        return coches;
    }
}
```

---

## 📌 **Explicación de los Métodos**
### **🔹 `crearCocheUsuario()`**
```java
public static void crearCocheUsuario() {
    Scanner sc = new Scanner(System.in);
```
✔️ **Maneja toda la entrada de datos del usuario.**  
✔️ **No devuelve la lista, sino que la actualiza internamente.**  
✔️ **Encapsula la lógica de entrada de datos en un solo método.**  

📌 **Nota:**  
- **No cerramos `Scanner` en este método** para evitar errores en `Main.java`.  

---

### **🔹 `getCoches()`**
```java
public static List<Coche> getCoches() {
    return coches;
}
```
✔️ **Devuelve la lista de coches almacenada en `CocheFactory`.**  
✔️ **Permite que `Main.java` acceda a los coches sin necesidad de manejar listas directamente.**  

---

## 🚀 **¿Por qué `CocheFactory` mejora la estructura del código?**
📌 **Antes:**  
- `Main.java` manejaba la lista de coches y la entrada del usuario.  
- `Coche.java` intentaba interactuar con la consola, lo que **rompía el principio de cohesión**.  

📌 **Ahora:**  
✔️ **`Coche.java` solo define atributos y métodos.**  
✔️ **`CocheFactory` se encarga de la creación y almacenamiento de coches.**  
✔️ **`Main.java` solo gestiona la interfaz del usuario.**  

🔍 **Ver más sobre `Coche.java`:**  
[📂 Explicación de `Coche.java`](https://github.com/carmonalanzasalvaro/DisenoSoftware/blob/main/Introduccionjava/Programa3_ClasesYObjetos/Explicaciones/Coche/README.md)

---

🔗 **Volver al README principal:**  
[🔙 Ir al README principal](https://github.com/carmonalanzasalvaro/DisenoSoftware/blob/main/Introduccionjava/Programa3_ClasesYObjetos/README.md)
