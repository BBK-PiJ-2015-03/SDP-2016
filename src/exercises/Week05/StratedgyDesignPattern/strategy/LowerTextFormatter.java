package exercises.Week05.StratedgyDesignPattern.strategy;

/**
 * Lower Case Text Formatter
 */
public class LowerTextFormatter implements TextFormatter{

    /**
     * Prints the parsed text in lower case letters.
     * @param text to be converted to capitals.
     */
    @Override
    public void format(String text) {
        System.out.println("[LowerTextFormatter]: " + text.toLowerCase());
    }
}
