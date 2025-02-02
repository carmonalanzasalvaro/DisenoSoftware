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



# 📌 **Métodos de la clase `String` en Java**

En este documento se explican los métodos más utilizados de la clase `String` en Java, utilizando como ejemplo el nombre `"Álvaro"` y otras cadenas de texto.

---

## **🔹 1. Información sobre la cadena**
### **1.1 Obtener la longitud de la cadena**
📌 El método `.length()` devuelve el número de caracteres en la cadena.
```java
String miNombre = "Álvaro";
System.out.println(miNombre.length()); // Devuelve: 6
```

### **1.2 Obtener un carácter en una posición específica**
📌 El método `.charAt(int index)` devuelve el carácter en la posición indicada.
```java
System.out.println(miNombre.charAt(3)); // Devuelve: 'a'
```

### **1.3 Obtener una subcadena desde una posición**
📌 `.substring(int beginIndex)` devuelve la subcadena desde `beginIndex` hasta el final.
```java
System.out.println(miNombre.substring(3)); // Devuelve: "aro"
```

📌 `.substring(int beginIndex, int endIndex)` devuelve la subcadena entre `beginIndex` y `endIndex - 1`.
```java
System.out.println(miNombre.substring(3, 5)); // Devuelve: "ar"
```

---

## **🔹 2. Métodos de búsqueda**
### **2.1 Obtener la posición de la primera ocurrencia de un carácter**
📌 `.indexOf(String str)` devuelve la primera posición donde aparece el carácter o cadena.
```java
System.out.println(miNombre.indexOf("a")); // Devuelve: 3
```

### **2.2 Obtener la posición de la última ocurrencia de un carácter**
📌 `.lastIndexOf(String str)` devuelve la última posición donde aparece el carácter o cadena.
```java
System.out.println(miNombre.lastIndexOf("a")); // Devuelve: 3
```

---

## **🔹 3. Métodos de comparación**
### **3.1 Comparar dos cadenas exactamente (`equals`)**
📌 `.equals(String str)` compara dos cadenas y devuelve `true` si son idénticas.
```java
System.out.println(miNombre.equals("Álvaro")); // Devuelve: true
```

### **3.2 Comparar dos cadenas ignorando mayúsculas/minúsculas (`equalsIgnoreCase`)**
📌 `.equalsIgnoreCase(String str)` compara dos cadenas ignorando diferencias de mayúsculas y minúsculas.
```java
System.out.println(miNombre.equalsIgnoreCase("álvaro")); // Devuelve: true
```

---

## **🔹 4. Métodos de transformación**
### **4.1 Convertir una cadena a mayúsculas**
📌 `.toUpperCase()` convierte toda la cadena a mayúsculas.
```java
System.out.println(miNombre.toUpperCase()); // Devuelve: "ÁLVARO"
```

### **4.2 Convertir una cadena a minúsculas**
📌 `.toLowerCase()` convierte toda la cadena a minúsculas.
```java
System.out.println(miNombre.toLowerCase()); // Devuelve: "álvaro"
```

### **4.3 Reemplazar caracteres**
📌 `.replace(char oldChar, char newChar)` reemplaza todas las ocurrencias de `oldChar` por `newChar`.
```java
System.out.println(miNombre.replace('á', 'a')); // Devuelve: "Alvaro"
```

---

## **🔹 5. Métodos para eliminar espacios**
### **5.1 Eliminar espacios en blanco al principio y al final**
📌 `.trim()` elimina los espacios en blanco alrededor de la cadena.
```java
String cadenaConEspacios = "   Hola Mundo   ";
System.out.println(cadenaConEspacios.trim()); // Devuelve: "Hola Mundo"
```

---

## **🔹 6. Métodos de verificación**
### **6.1 Verificar si una cadena empieza con cierto prefijo**
📌 `.startsWith(String prefix)` devuelve `true` si la cadena comienza con el prefijo dado.
```java
System.out.println(miNombre.startsWith("Ál")); // Devuelve: true
```

### **6.2 Verificar si una cadena termina con cierto sufijo**
📌 `.endsWith(String suffix)` devuelve `true` si la cadena termina con el sufijo dado.
```java
System.out.println(miNombre.endsWith("ro")); // Devuelve: true
```

### **6.3 Verificar si una cadena contiene otra cadena**
📌 `.contains(CharSequence sequence)` devuelve `true` si la cadena contiene la secuencia dada.
```java
System.out.println(miNombre.contains("lva")); // Devuelve: true
```

### **6.4 Verificar si una cadena está vacía**
📌 `.isEmpty()` devuelve `true` si la cadena está vacía.
```java
System.out.println(miNombre.isEmpty()); // Devuelve: false
```

---

## **🔹 7. Métodos para dividir y unir cadenas**
### **7.1 Dividir una cadena en partes (`split`)**
📌 `.split(String regex)` divide la cadena en subcadenas según el delimitador especificado.
```java
String cadenaDividir = "Hola Mundo Java";
String[] subcadenas = cadenaDividir.split(" ");
for (String subcadena : subcadenas) {
    System.out.println(subcadena);
}
// Devuelve: 
// "Hola"
// "Mundo"
// "Java"
```

### **7.2 Unir varias cadenas con un delimitador (`join`)**
📌 `.join(CharSequence delimiter, CharSequence... elements)` une varias cadenas con un separador.
```java
String[] palabras = {"Hola", "Mundo", "Java"};
String cadenaUnida = String.join(" ", palabras);
System.out.println(cadenaUnida); // Devuelve: "Hola Mundo Java"
```

---

## **🔹 8. Métodos para convertir otros tipos en `String`**
### **8.1 Convertir un número entero a `String`**
📌 `.valueOf(int i)` convierte un número entero en una cadena.
```java
int numero = 123;
System.out.println(String.valueOf(numero)); // Devuelve: "123"
```

### **8.2 Convertir un número decimal a `String`**
📌 `.valueOf(double d)` convierte un número decimal en una cadena.
```java
double numeroDecimal = 3.14;
System.out.println(String.valueOf(numeroDecimal)); // Devuelve: "3.14"
```

### **8.3 Convertir un valor booleano a `String`**
📌 `.valueOf(boolean b)` convierte un valor booleano en una cadena.
```java
boolean valorBooleano = true;
System.out.println(String.valueOf(valorBooleano)); // Devuelve: "true"
```

---
