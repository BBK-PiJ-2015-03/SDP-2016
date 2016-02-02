package exercises.Week05.StratedgyDesignPattern;

/**
 * Created by J2FX on 02/02/2016.
 */
public class TextStratedgyPattern {
    public static void main(String[] args) {
        TextFormatter formatter = new CapTextFormatter();
        TextEditor editor = new TextEditor(formatter);
        editor.publishText("Testing text in caps formatter");

        formatter = new LowerTextFormatter();
        editor = new TextEditor(formatter);
        editor.publishText("Testing text in lower formatter");
    }
}
