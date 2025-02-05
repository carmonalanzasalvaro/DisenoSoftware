# 🎛️ Explicación: `Main.java`

## 📜 **¿Qué hace `Main.java`?**
`Main.java` gestiona la interacción con el usuario a través de un **menú interactivo**,  
donde se pueden **crear, visualizar y modificar coches**.

✔️ **No maneja la lista de coches directamente.**  
✔️ **Utiliza `CocheFactory` para la creación y almacenamiento de coches.**  
✔️ **Separa la lógica de impresión con `mostrarCoches()`.**  

---

## 📌 **Clase `Main` (Implementación)**
```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 4) {
            menu();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    CocheFactory.crearCocheUsuario();
                    break;
                case 2:
                    System.out.println("⚠️ Función de modificar datos en desarrollo...");
                    break;
                case 3:
                    mostrarCoches();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        }
        sc.close();
    }

    public static void mostrarCoches() {
        for (int i = 0; i < CocheFactory.getCoches().size(); i++) {
            System.out.println("=========================================");
            System.out.println("🚗 Coche " + (i + 1) + ":");
            System.out.println("-----------------------------------------");
            System.out.println(
                "       _______\n" +
                "      //  ||\\ \\\n" +
                " ____//___||_\\ \\___\n" +
                " )  _          _    \\\n" +
                " |_/ \\________/ \\___|\n" +
                "___\\_/________\\_/______"
            );
            System.out.println("-----------------------------------------");
            System.out.println("Bastidor: " + CocheFactory.getCoches().get(i).getBastidor());
            System.out.println("Motor: " + CocheFactory.getCoches().get(i).getMotor() + " cc");
            System.out.println("Peso: " + CocheFactory.getCoches().get(i).getPeso() + " kg");
            System.out.println("Largo: " + CocheFactory.getCoches().get(i).getLargo() + " cm");
            System.out.println("Ancho: " + CocheFactory.getCoches().get(i).getAncho() + " cm");
            System.out.println("Marca: " + CocheFactory.getCoches().get(i).getMarca());
            System.out.println("=========================================\n");
        }
    }

    public static void menu() {
        System.out.println("1. Crear coche");
        System.out.println("2. Modificar datos");
        System.out.println("3. Mostrar coches");
        System.out.println("4. Salir");
    }
}
```

---

## 📌 **Explicación de los Métodos**
### **🔹 `menu()`**
```java
public static void menu() {
    System.out.println("1. Crear coche");
    System.out.println("2. Modificar datos");
    System.out.println("3. Mostrar coches");
    System.out.println("4. Salir");
}
```
✔️ **Muestra las opciones disponibles para el usuario.**  
✔️ **El usuario selecciona una opción que se procesa en el `switch`.**  

---

### **🔹 `mostrarCoches()`**
```java
public static void mostrarCoches() {
    for (int i = 0; i < CocheFactory.getCoches().size(); i++) {
        System.out.println("=========================================");
        System.out.println("🚗 Coche " + (i + 1) + ":");
        System.out.println("-----------------------------------------");
        System.out.println(
            "       _______\n" +
            "      //  ||\\ \\\n" +
            " ____//___||_\\ \\___\n" +
            " )  _          _    \\\n" +
            " |_/ \\________/ \\___|\n" +
            "___\\_/________\\_/______"
        );
        System.out.println("-----------------------------------------");
        System.out.println("Bastidor: " + CocheFactory.getCoches().get(i).getBastidor());
        System.out.println("Motor: " + CocheFactory.getCoches().get(i).getMotor() + " cc");
        System.out.println("Peso: " + CocheFactory.getCoches().get(i).getPeso() + " kg");
        System.out.println("Largo: " + CocheFactory.getCoches().get(i).getLargo() + " cm");
        System.out.println("Ancho: " + CocheFactory.getCoches().get(i).getAncho() + " cm");
        System.out.println("Marca: " + CocheFactory.getCoches().get(i).getMarca());
        System.out.println("=========================================\n");
    }
}
```
✔️ **Recorre la lista de coches y muestra la información de cada uno.**  
✔️ **Incluye un dibujo en ASCII para hacerlo más visual.**  

---

## 🚀 **¿Por qué `Main.java` ya no maneja la lista de coches?**
📌 **Antes:**  
- `Main.java` tenía que gestionar la lista de coches manualmente.  
- `Main.java` tenía código repetitivo al crear coches.  

📌 **Ahora:**  
✔️ **La gestión de coches se delega a `CocheFactory`.**  
✔️ **El código de `Main.java` es más limpio y modular.**  
✔️ **`mostrarCoches()` está separado para mejorar la organización.**  

🔍 **Ver más sobre `CocheFactory.java`:**  
[📂 Explicación de `CocheFactory.java`](https://github.com/carmonalanzasalvaro/DisenoSoftware/blob/main/introduccion_java/programa3_clases_objetos/Explicaciones/CocheFactory/README.md)

---

🔗 **Volver al README principal:**  
[🔙 Ir al README principal](https://github.com/carmonalanzasalvaro/DisenoSoftware/blob/main/introduccion_java/programa3_clases_objetos/README.md)
