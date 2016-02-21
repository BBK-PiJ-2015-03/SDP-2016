package exercises.Week05.StratedgyDesignPattern.abstractfactory;

/**
 * Factory for implementing concrete factories.
 */
public interface AbstractParserFactory {
    XMLParser getParserInstance(String parserType);
}
