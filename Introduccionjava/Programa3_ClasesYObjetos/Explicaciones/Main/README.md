# 🎛️ Explicación: `Main.java`

## 📜 ¿Qué hace `Main.java`?
Este archivo **gestiona la interacción con el usuario**, proporcionando un **menú interactivo**  
para la **creación y visualización** de coches.  

⚠️ **Nota:** La opción **"Modificar datos de un coche" aún no está implementada** en el código.

---

## 📌 **¿Cómo funciona el menú interactivo?**
El programa muestra un **menú en consola** donde el usuario puede seleccionar una opción.  
✔️ Se usa un **bucle `while`** para mantener el menú activo hasta que el usuario elija salir.  
✔️ Se usa un **`switch-case`** para manejar cada opción del menú.

```java
int option = 0;
while (option != 4) { // 🔹 Se repite hasta que el usuario elija salir
    menu(); // ✅ Muestra las opciones en consola
    option = sc.nextInt(); // 🔹 Captura la opción seleccionada
```

📌 **El usuario puede elegir:**
1️⃣ **Crear coche** 🏎️  
2️⃣ **Modificar datos de un coche** 🔧 *(No implementado)*  
3️⃣ **Mostrar todos los coches registrados** 📋  
4️⃣ **Salir del programa** 🚪  

---

## 📌 **¿Cómo se crean los coches en `Main`?**
✔️ **El usuario ingresa un número de bastidor** para crear un coche.  
✔️ **`Coche` solicita los datos adicionales al usuario (marca, motor, peso, dimensiones).**  
✔️ **Se almacena en una `List<Coche>` para gestionarlos luego.**  

```java
System.out.print("Introduce el bastidor del coche: ");
int bastidor = sc.nextInt();
Coche coche = new Coche(bastidor);
coches.add(coche);
```

📌 **El coche recién creado se almacena en la lista `coches`.**

---

## 📌 **¿Cómo se muestran todos los coches registrados?**
✔️ **Se recorre la lista `coches` y se imprimen los datos de cada coche.**  
✔️ **Si la lista está vacía, se muestra un mensaje de advertencia.**

```java
if (coches.isEmpty()) {
    System.out.println("⚠️ No hay coches registrados.");
} else {
    for (int i = 0; i < coches.size(); i++) {
        System.out.println("Bastidor: " + coches.get(i).getBastidor());
        System.out.println("Marca: " + coches.get(i).getMarca());
    }
}
```

---

## ⚠️ **Opción "Modificar datos" aún no implementada**
Actualmente, en el código, **la opción 2 del menú (`Modificar datos`) muestra un mensaje pero no realiza ninguna acción.**  

```java
case 2: // Modificar datos (NO IMPLEMENTADO)
    System.out.println("⚠️ Función de modificar datos en desarrollo...");
    break;
```

📌 **Si en el futuro se implementa, el código deberá permitir modificar atributos de un coche existente.**  

---

## 📌 **¿Cómo se maneja el `Scanner`?**
✔️ **`Scanner` se usa para capturar la entrada del usuario.**  
✔️ **Se cierra con `sc.close();` al finalizar el programa.**

```java
Scanner sc = new Scanner(System.in);
sc.close();
```

📌 **Cerrar `Scanner` evita fugas de memoria en el programa.**

---

🔗 **Volver al README principal:**  
[🔙 Ir al README principal](https://github.com/carmonalanzasalvaro/DisenoSoftware/blob/main/Introduccionjava/Programa3_ClasesYObjetos/README.md)
