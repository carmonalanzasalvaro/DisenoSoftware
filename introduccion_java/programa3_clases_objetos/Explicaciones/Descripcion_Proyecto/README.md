# 📌 Explicación: Descripción del Proyecto

## 📜 ¿Qué es este proyecto?
Este proyecto implementa un **gestor de vehículos en Java** basado en la **Programación Orientada a Objetos (POO)**.  
Permite administrar una lista de coches y aplicar conceptos clave de POO como:
- **Herencia** (Extender clases base en subclases especializadas).
- **Encapsulación** (Protección de atributos con `private` y `protected`).
- **Clases Abstractas** (`Vehiculo` define una estructura común para los coches).
- **Control de errores** (`IllegalArgumentException` para evitar bastidores duplicados).

## 📌 ¿Qué funcionalidades incluye?
✔️ Creación de coches con **atributos específicos** (bastidor, motor, peso, dimensiones, marca).  
✔️ Validación de que **cada bastidor sea único** en todos los vehículos creados.  
✔️ Un **menú interactivo** que permite:  
   - **Crear** un coche.  
   - **Modificar** sus datos.  
   - **Listar** todos los coches registrados.  
   - **Salir** del programa.  

## 🛠️ ¿Cómo funciona?
1️⃣ Se ejecuta `Main.java`, que muestra un menú en consola.  
2️⃣ Se selecciona una opción (1: Crear, 2: Modificar, 3: Mostrar, 4: Salir).  
3️⃣ Si se crea un coche, el programa solicita el **bastidor** y la **marca**.  
4️⃣ Se almacena el coche en una lista de `ArrayList<Coche>`.  
5️⃣ Se evita que dos coches tengan el mismo bastidor.  

📌 **Este proyecto es escalable**, por lo que se pueden agregar nuevas clases como `Moto`, `Camion`, etc.

---
🔗 **Volver a la página principal:**  
[🔙 Ir al README principal](https://github.com/carmonalanzasalvaro/DisenoSoftware/blob/main/introduccion_java/programa3_clases_objetos/README.md)
