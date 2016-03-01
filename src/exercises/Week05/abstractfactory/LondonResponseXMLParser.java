package exercises.Week05.abstractfactory;

public class LondonResponseXMLParser implements XMLParser {
    @Override
    public String parse(){
        System.out.println("London Parsing response XML...");
        return "London response XML Message";
    }
}
