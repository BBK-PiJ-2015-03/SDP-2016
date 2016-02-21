package exercises.Week05.StratedgyDesignPattern.abstractfactory;

public class LondonFactory implements AbstractParserFactory{

    @Override
    public XMLParser getParserInstance(String parserType) {
        if(parserType.equals("LondonFEEDBACK")) {
            return new LondonFeedbackXML();
        }
        if(parserType.equals("LondonORDER")) {
            return new LondonOrderXMLParser();
        }
        if(parserType.equals("LondonRESPONSE")) {
            return new LondonResponseXMLParser();
        }
        if(parserType.equals("LondonERROR")) {
            return new LondonErrorXMLParser();
        }
        return null;
    }

}
