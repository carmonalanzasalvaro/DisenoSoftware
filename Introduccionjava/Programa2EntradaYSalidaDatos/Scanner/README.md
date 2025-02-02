# 📌 **Uso de `Scanner` en Java**
La clase `Scanner` permite leer **datos de entrada** desde la consola, permitiendo capturar diferentes tipos de valores (`String`, `int`, `double`, `boolean`, etc.).

---

## **🔹 1. Crear un objeto `Scanner`**
📌 Para leer datos desde la consola, primero debemos crear un objeto `Scanner` que use `System.in`.

```java
Scanner scanner = new Scanner(System.in);
```
📌 **No olvides cerrar el Scanner al final del programa para liberar recursos:**
```java
scanner.close();
```

---

## **🔹 2. Leer una cadena de texto (`nextLine()`)**
📌 `nextLine()` permite leer una línea completa de texto, incluyendo espacios.
```java
System.out.print("Introduce tu nombre: ");
String nombre = scanner.nextLine();
System.out.println("Hola, " + nombre + "!");
```

---

## **🔹 3. Leer un número entero (`nextInt()`)**
📌 `nextInt()` lee un número entero de la entrada estándar.
```java
System.out.print("Introduce tu edad: ");
int edad = scanner.nextInt();
System.out.println("Tienes " + edad + " años.");
```

---

## **🔹 4. Leer un número decimal (`nextDouble()`)**
📌 `nextDouble()` lee un número con decimales.
```java
System.out.print("Introduce tu altura en metros: ");
double altura = scanner.nextDouble();
System.out.println("Tu altura es " + altura + " metros.");
```

---

## **🔹 5. Leer un solo carácter (`charAt(0)`)**
📌 Java no tiene un método `nextChar()`, por lo que debemos leer una cadena con `nextLine()` y extraer el primer carácter.
```java
scanner.nextLine(); // Consumir la línea pendiente
System.out.print("Introduce la inicial de tu apellido: ");
char inicial = scanner.nextLine().charAt(0);
System.out.println("Tu inicial es: " + inicial);
```

---

## **🔹 6. Leer un valor booleano (`nextBoolean()`)**
📌 `nextBoolean()` permite leer valores `true` o `false`.
```java
System.out.print("¿Eres mayor de edad? (true/false): ");
boolean mayorDeEdad = scanner.nextBoolean();
System.out.println("Mayor de edad: " + mayorDeEdad);
```

---

## **🔹 7. Leer múltiples palabras (`nextLine()`)**
📌 Si queremos leer una línea completa después de `nextInt()` o `nextDouble()`, **debemos consumir el salto de línea** con `scanner.nextLine();`
```java
scanner.nextLine(); // Consumir la línea pendiente
System.out.print("Introduce tu ciudad y país: ");
String ciudadYPais = scanner.nextLine();
System.out.println("Vives en: " + ciudadYPais);
```

---

## ✅ **Conclusión**
✔️ `Scanner` es la forma más común de **leer entrada desde la consola en Java**.  
✔️ Puede leer diferentes tipos de datos (`String`, `int`, `double`, `boolean`).  
✔️ Es importante **manejar correctamente los saltos de línea** (`nextLine()`) después de leer números.  
✔️ **Siempre recuerda cerrar el `Scanner`** con `scanner.close();` para evitar fugas de memoria.  


