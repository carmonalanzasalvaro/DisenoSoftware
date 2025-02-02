package Introduccionjava.Programa2_EntradaYSalidaDatos.JOptionPane;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        // 📌 Capturar un texto introducido por el usuario
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");

        // 📌 Mostrar un mensaje en ventana emergente
        JOptionPane.showMessageDialog(null, "Hola " + nombre + ", bienvenido!");

        // 📌 Capturar un número entero
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad:"));

        // 📌 Capturar un número decimal
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu altura en metros:"));

        // 📌 Mostrar diferentes tipos de mensajes
        JOptionPane.showMessageDialog(null, "Tu nombre es: " + nombre, "Información", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Tienes " + edad + " años.", "Aviso", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Tu altura es " + altura + " metros.", "Error", JOptionPane.ERROR_MESSAGE);

        // 📌 Confirmación (Sí/No/Cancelar)
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Te gustaría continuar?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);

        // 📌 Interpretar la respuesta del usuario
        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Has seleccionado Sí.");
        } else if (respuesta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Has seleccionado No.");
        } else {
            JOptionPane.showMessageDialog(null, "Has cancelado la operación.");
        }

        // 📌 Selección con opciones personalizadas
        String[] opciones = {"Rojo", "Azul", "Verde"};
        String colorElegido = (String) JOptionPane.showInputDialog(null, "Elige un color:", 
            "Selector de color", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        JOptionPane.showMessageDialog(null, "Has elegido: " + colorElegido);
    }
}
