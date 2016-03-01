package exercises.Week05.abstractfactory;

public class NYCFactory implements AbstractParserFactory{

    @Override
    public XMLParser getParserInstance(String parserType) {
        if(parserType.equals("NYCORDER")) {
            return new NYCOrderXMLParser();
        }
        if(parserType.equals("NYCERROR")) {
            return new NYCErrorXMLParser();
        }
        if(parserType.equals("NYCRESPONSE")) {
            return new NYCResponseXMLParser();
        }
        if(parserType.equals("NYCFEEDBACK")) {
            return new NYCFeedbackXML();
        }
        return null;
    }

}
