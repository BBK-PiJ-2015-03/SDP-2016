package exercises.Week05.strategy;

/**
 * Capital Text Formatter
 */
public class CapTextFormatter implements TextFormatter{

    /**
     * Prints the parsed text in capital letters.
     * @param text to be converted to capitals.
     */
    @Override
    public void format(String text) {
        System.out.println("[CapTextFormatter]: " + text.toUpperCase());
    }
}
