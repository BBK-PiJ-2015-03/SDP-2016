package exercises.Week05.abstractfactory;

public class LondonFeedbackXML implements XMLParser {
    @Override
    public String parse(){
        System.out.println("London Parsing feedback XML...");
        return "London feedback XML Message";
    }
}
