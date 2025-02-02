package Introduccionjava.Programa1String;

public class Main {
    public static void main(String[] args) {
        
        String miNombre = "Álvaro";
        System.out.println("Hola, mi nombre es " + miNombre);
        System.out.println("---------------------------");

        // 📌 Métodos para obtener información de la cadena
        System.out.println("Longitud de la cadena: " + miNombre.length());
        System.out.println("Carácter en la posición 3: " + miNombre.charAt(3));
        System.out.println("Subcadena desde la posición 3: " + miNombre.substring(3));
        System.out.println("Subcadena entre 3 y 5: " + miNombre.substring(3, 5));
        System.out.println("---------------------------");

        // 📌 Métodos para búsqueda en la cadena
        System.out.println("Posición de la primera 'a': " + miNombre.indexOf("a"));
        System.out.println("Posición de la última 'a': " + miNombre.lastIndexOf("a"));
        System.out.println("---------------------------");

        // 📌 Métodos para comparación de cadenas
        System.out.println("¿Es igual a 'Álvaro'?: " + miNombre.equals("Álvaro"));
        System.out.println("¿Es igual a 'álvaro' (ignorando mayúsculas)?: " + miNombre.equalsIgnoreCase("álvaro"));
        System.out.println("---------------------------");

        // 📌 Métodos para modificar la cadena
        System.out.println("En mayúsculas: " + miNombre.toUpperCase());
        System.out.println("En minúsculas: " + miNombre.toLowerCase());
        System.out.println("Reemplazar 'á' por 'a': " + miNombre.replace('á', 'a'));
        System.out.println("---------------------------");

        // 📌 Métodos para eliminar espacios
        String cadenaConEspacios = "   Hola Mundo   ";
        System.out.println("Cadena con espacios: [" + cadenaConEspacios + "]");
        System.out.println("Cadena sin espacios: [" + cadenaConEspacios.trim() + "]");
        System.out.println("---------------------------");

        // 📌 Métodos para comprobar contenido
        System.out.println("¿Comienza con 'Ál'?: " + miNombre.startsWith("Ál"));
        System.out.println("¿Termina con 'ro'?: " + miNombre.endsWith("ro"));
        System.out.println("¿Contiene 'lva'?: " + miNombre.contains("lva"));
        System.out.println("¿Está vacía?: " + miNombre.isEmpty());
        System.out.println("---------------------------");

        // 📌 Método para dividir una cadena en partes
        String cadenaDividir = "Hola Mundo Java";
        String[] subcadenas = cadenaDividir.split(" ");
        System.out.println("Subcadenas:");
        for (String subcadena : subcadenas) {
            System.out.println("- " + subcadena);
        }
        System.out.println("---------------------------");

        // 📌 Método para unir cadenas con un delimitador
        String[] palabras = {"Hola", "Mundo", "Java"};
        String cadenaUnida = String.join(" ", palabras);
        System.out.println("Cadena unida: " + cadenaUnida);
        System.out.println("---------------------------");

        // 📌 Métodos para convertir valores en cadenas
        int numero = 123;
        double numeroDecimal = 3.14;
        boolean valorBooleano = true;

        System.out.println("Número entero convertido a String: " + String.valueOf(numero));
        System.out.println("Número decimal convertido a String: " + String.valueOf(numeroDecimal));
        System.out.println("Booleano convertido a String: " + String.valueOf(valorBooleano));
    
    }
}