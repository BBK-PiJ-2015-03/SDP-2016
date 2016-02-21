package exercises.Week05.StratedgyDesignPattern.strategy;

/**
 * Text editor factory, assigns format to text.
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
