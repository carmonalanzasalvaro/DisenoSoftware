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
2️⃣ **Modificar datos de un coche según su bastidor.** *(No implementado)*  
3️⃣ **Mostrar todos los coches registrados con un dibujo ASCII.**  
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

---

## 🔹 **3. `Coche.java` (Subclase de `Vehiculo`)**
`Coche` extiende `Vehiculo` y agrega atributos propios como `marca`.  

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

🔍 [📂 Explicación Detallada](https://github.com/carmonalanzasalvaro/DisenoSoftware/blob/main/Introduccionjava/Programa3_ClasesYObjetos/Explicaciones/Coche/README.md)

---

## 🔹 **4. `CocheFactory.java` (Clase de Creación de Coches)**
`CocheFactory` es una clase que maneja la lista de coches y su creación con entrada del usuario.

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

        System.out.println("Introduce la marca del coche: ");
        sc.nextLine();
        String marca = sc.nextLine();
        coche.setMarca(marca);

        coches.add(coche);
    }

    public static List<Coche> getCoches() {
        return coches;
    }
}
```

🔍 [📂 Explicación Detallada](https://github.com/carmonalanzasalvaro/DisenoSoftware/blob/main/Introduccionjava/Programa3_ClasesYObjetos/Explicaciones/CocheFactory/README.md)

---

## 🔹 **5. `Main.java` (Menú de Gestión de Coches)**
Este archivo gestiona la **interacción con el usuario** y permite administrar los coches mediante un **menú interactivo**.

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
}
```

🔍 [📂 Explicación Detallada](https://github.com/carmonalanzasalvaro/DisenoSoftware/blob/main/Introduccionjava/Programa3_ClasesYObjetos/Explicaciones/Main/README.md)

---

