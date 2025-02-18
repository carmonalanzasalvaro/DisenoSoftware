package Clase.sesion2.strategy.ejemplo_txt;

public class TestStrategyPattern { //Clase para testear
    public static void main(String[] args) {
    
    TextFormatter formatter; //Se crea un objeto de tipo TextFormatter, que es una interfaz que tiene un método format  
    TextEditor editor;       //Se crea un objeto de tipo TextEditor, que tiene un método format que recibe un texto y lo formatea
    
    formatter = new CapTextFormatter(); //Se implementa el método format de la interfaz TextFormatter
    editor = new TextEditor(formatter); //Recibe un objeto de tipo TextFormatter, esto se hace para que el editor pueda formatear el texto
    editor.format("Testing text in caps formatter"); 

    formatter = new LowerTextFormatter(); //Formatter recibe la accion que se debe realizar
    editor = new TextEditor(formatter); //editor recibe el nuevo formatter que se debe aplicar
    editor.format("Testing text in lower formatter");
    }
}
