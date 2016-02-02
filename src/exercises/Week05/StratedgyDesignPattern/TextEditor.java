package exercises.Week05.StratedgyDesignPattern;

/**
 * Created by J2FX on 02/02/2016.
 */
public class TextEditor {
    private TextFormatter format;

    public TextEditor(TextFormatter format){
        this.format = format;
    }

    public void publishText(String text){
        format.format(text);
    }
}
