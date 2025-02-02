# 📌 **Uso de `JOptionPane` en Java**
La clase `JOptionPane` permite mostrar **ventanas emergentes** para interactuar con el usuario en **interfaces gráficas (GUI)** en Java.

---

## **🔹 1. Mostrar un cuadro de diálogo con `showMessageDialog()`**
📌 `showMessageDialog(Component parentComponent, Object message, String title, int messageType)`  
Muestra un mensaje en una ventana emergente.  

```java
JOptionPane.showMessageDialog(null, "Hola, bienvenido!", "Información", JOptionPane.INFORMATION_MESSAGE);
```
📌 **Tipos de mensajes disponibles:**
| Constante | Descripción |
|-----------|------------|
| `JOptionPane.INFORMATION_MESSAGE` | Muestra un mensaje informativo |
| `JOptionPane.WARNING_MESSAGE` | Muestra una advertencia |
| `JOptionPane.ERROR_MESSAGE` | Muestra un mensaje de error |
| `JOptionPane.QUESTION_MESSAGE` | Muestra un mensaje de pregunta |
| `JOptionPane.PLAIN_MESSAGE` | Muestra un mensaje sin icono |

---

## **🔹 2. Capturar entrada de texto con `showInputDialog()`**
📌 Permite al usuario introducir datos mediante un cuadro de texto.
```java
String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
```
El valor ingresado se almacena como **String**.

---

## **🔹 3. Capturar números (Enteros y Decimales)**
📌 Como `showInputDialog()` devuelve un **String**, si queremos capturar un **número entero o decimal**, debemos convertirlo:
```java
int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad:"));
double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu altura en metros:"));
```

---

## **🔹 4. Mostrar cuadro de confirmación con `showConfirmDialog()`**
📌 Muestra un cuadro con botones `Sí`, `No`, `Cancelar`.
```java
int respuesta = JOptionPane.showConfirmDialog(null, "¿Te gustaría continuar?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);
```
📌 **Valores devueltos:**
| Constante | Valor |
|-----------|------|
| `JOptionPane.YES_OPTION` | 0 |
| `JOptionPane.NO_OPTION` | 1 |
| `JOptionPane.CANCEL_OPTION` | 2 |

📌 **Ejemplo de uso:**
```java
if (respuesta == JOptionPane.YES_OPTION) {
    JOptionPane.showMessageDialog(null, "Has seleccionado Sí.");
} else if (respuesta == JOptionPane.NO_OPTION) {
    JOptionPane.showMessageDialog(null, "Has seleccionado No.");
} else {
    JOptionPane.showMessageDialog(null, "Has cancelado la operación.");
}
```

---

## **🔹 5. Mostrar un cuadro con opciones personalizadas**
📌 `showInputDialog(Component parentComponent, Object message, String title, int messageType, Icon icon, Object[] options, Object initialValue)`  
Permite mostrar una lista de opciones personalizadas para que el usuario elija una.

```java
String[] opciones = {"Rojo", "Azul", "Verde"};
String colorElegido = (String) JOptionPane.showInputDialog(null, "Elige un color:", 
    "Selector de color", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

JOptionPane.showMessageDialog(null, "Has elegido: " + colorElegido);
```

---

## ✅ **Conclusión**
✔️ `JOptionPane` facilita la **interacción con el usuario** en aplicaciones gráficas.  
✔️ Permite mostrar mensajes, capturar información y confirmar decisiones de forma sencilla.  
✔️ Es una **alternativa rápida a la consola (`Scanner`)** en Java.  

🚀 **¡Ahora puedes usar `JOptionPane` para crear programas interactivos en Java!** 🔥🎯
