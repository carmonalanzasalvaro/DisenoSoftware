package Clase.sesion2.strategy.ejemplo_txt;

public class CapTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("[CapTextFormatter]: " + text.toUpperCase());
    }
    
}
