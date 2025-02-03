# 🚗 **Gestor de Vehículos en Java**
Este proyecto demuestra el uso de **Programación Orientada a Objetos (POO) en Java**, aplicando **herencia, clases abstractas y encapsulación**. Se permite **crear, modificar y visualizar coches**, asegurando que cada coche tenga un **bastidor único**.

---

## 📌 **1. Descripción del Proyecto**
El programa permite gestionar una lista de coches con los siguientes atributos:
- **Bastidor (único por coche).**
- **Motor (cc).**
- **Peso (kg).**
- **Dimensiones (Largo y Ancho).**
- **Marca.**

Los coches se gestionan mediante un **menú interactivo** donde se pueden:

1️⃣ **Crear coches.**  
2️⃣ **Modificar datos de un coche según su bastidor.**  
3️⃣ **Mostrar todos los coches registrados.**  
4️⃣ **Salir.**  

🔍 [📂 Explicación Detallada](https://github.com/carmonalanzasalvaro/DisenoSoftware/blob/main/Introduccionjava/Programa3_ClasesYObjetos/Explicaciones/Descripcion_Proyecto/README.md)

---

## 🔹 **2. `Vehiculo.java` (Clase Abstracta)**
`Vehiculo` es la **clase base abstracta** de la que heredan todos los tipos de vehículos.

```java
public abstract class Vehiculo {
    private int motor;
    private int peso;
    private int largo;
    private int ancho;
    private final int bastidor;
    private static final List<Integer> bastidoresUsados = new ArrayList<>();

    protected Vehiculo(int bastidor) {
        if (bastidoresUsados.contains(bastidor)) {
            throw new IllegalArgumentException("El bastidor ya está en uso");
        }
        this.bastidor = bastidor;
        bastidoresUsados.add(bastidor);
    }

    public abstract String getTipoVehiculo();

    public int getBastidor() { return bastidor; }
    public int getMotor() { return motor; }
    public void setMotor(int motor) { this.motor = motor; }
}

```
🔍 [📂 Explicación Detallada](https://github.com/carmonalanzasalvaro/DisenoSoftware/blob/main/Introduccionjava/Programa3_ClasesYObjetos/Explicaciones/Vehiculo/README.md)

### **🛠️ Características:**
✔️ `abstract` impide crear instancias de `Vehiculo` directamente.  
✔️ `final` en `bastidor` evita modificaciones.  
✔️ `static List<Integer> bastidoresUsados` asegura que no haya números de bastidor repetidos.  
✔️ `getTipoVehiculo()` es **abstracto** para obligar a subclases a definirlo.  

---

## 🔹 **3. `Coche.java` (Subclase de `Vehiculo`)**
`Coche` extiende `Vehiculo` y agrega atributos propios como `marca`.

```java
public class Coche extends Vehiculo {
    private String marca;
    public Coche(int bastidor, Scanner sc) {
        super(bastidor);
        System.out.print("Introduce la marca del coche: ");
        this.marca = sc.nextLine();
    }
    @Override
    public String getTipoVehiculo() {
        return "Coche";
    }
}
```

### **🛠️ Características:**
✔️ Llama a `super(bastidor);` para inicializar la superclase `Vehiculo`.  
✔️ Implementa `getTipoVehiculo()` obligatorio por ser `abstract`.  
✔️ Usa `Scanner` para capturar la marca del coche al crearlo.  

---

## 🔹 **4. `Main.java` (Menú de Gestión de Coches)**
Este archivo gestiona la **interacción con el usuario**.

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Coche> coches = new ArrayList<>();
        int option = 0;

        while (option != 4) {
            menu();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Introduce el bastidor: ");
                    int bastidor = sc.nextInt();
                    coches.add(new Coche(bastidor, sc));
                    break;
                case 2:
                    System.out.println("Función de modificar datos en desarrollo...");
                    break;
                case 3:
                    for (int i = 0; i < coches.size(); i++) {
                        System.out.println("Bastidor: " + coches.get(i).getBastidor());
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
        }
        sc.close();
    }
    public static void menu() {
        System.out.println("1. Crear coche");
        System.out.println("2. Modificar datos");
        System.out.println("3. Mostrar coches");
        System.out.println("4. Salir");
    }
}
```

### **🛠️ Características:**
✔️ Usa `Scanner` para capturar entradas del usuario.  
✔️ **Menú interactivo** con opciones de crear, modificar y mostrar coches.  
✔️ Almacena coches en una `List<Coche>`.  
✔️ **Evita bastidores duplicados** gracias a `Vehiculo.bastidoresUsados`.  

---

## ✅ **Objetivos**
✔️ **Uso correcto de POO:** Aplicación de **herencia, clases abstractas y encapsulación**.  
✔️ **Evitar errores lógicos:** Cada coche tiene un bastidor único y datos validados.  
✔️ **Menú interactivo:** Permite gestionar coches de forma dinámica.  
✔️ **Fácil escalabilidad:** Se pueden añadir otras clases como `Moto`, `Camion`, etc.  


