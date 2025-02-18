package patrones.patron_strategy.ejemplo_txt;
//Para qué sirve texteditor: para formatear texto con diferentes formatos (mayúsculas, minúsculas, etc) 
public class TextEditor {

    private TextFormatter textFormatter; 
    public TextEditor(TextFormatter textFormatter){
    this.textFormatter = textFormatter;
    }
    public void format(String text){
    textFormatter.format(text);
    }

}