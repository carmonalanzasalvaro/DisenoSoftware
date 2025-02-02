### 📌 **¿`String` en Java es un objeto o un tipo primitivo?**

En Java, **`String` es un objeto, no un tipo primitivo**, pero tiene un comportamiento especial gracias al **String Pool**.

---

### 🔹 **¿Qué es el String Pool?**
Es una zona especial de memoria donde **Java almacena y reutiliza cadenas de texto** para optimizar el rendimiento.

---

### 🔹 **¿Cuál es la diferencia entre declarar un `String` con `new` y sin `new`?**

```java
String nombre1 = "Antonio";  // Usa el String Pool (Recomendado ✅)
String nombre2 = new String("Antonio"); // Crea un nuevo objeto innecesario ❌
```

📌 **Explicación:**
- `nombre1` **se guarda en el String Pool**, por lo que si otra variable usa `"Antonio"`, Java reutiliza el mismo objeto.
- `nombre2` **crea un nuevo objeto en memoria**, incluso si `"Antonio"` ya existe en el String Pool.

---

### 🔹 **Comparación de Strings en Java**
```java
String a = "Hola";
String b = "Hola";
System.out.println(a == b); // true (Mismo objeto en el String Pool)
System.out.println(a.equals(b)); // true (Mismo contenido)

String c = new String("Hola");
System.out.println(a == c); // false (Son objetos diferentes)
System.out.println(a.equals(c)); // true (Mismo contenido)
```

📌 **Reglas de comparación:**
- **Usa `==`** solo para comprobar si son el mismo objeto.
- **Usa `equals()`** para comparar su contenido.

---

### ✅ **Conclusión**
✔️ **Siempre usa `String nombre = "Texto";`** en lugar de `new String("Texto")` para aprovechar el **String Pool** y ahorrar memoria.  
✔️ **Usa `.equals()`** para comparar el contenido de los Strings.  

🚀 **¡Así optimizas el uso de memoria en Java!** 🔥
