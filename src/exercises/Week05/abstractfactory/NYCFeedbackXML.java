package exercises.Week05.abstractfactory;

public class NYCFeedbackXML implements XMLParser{

    @Override
    public String parse(){
        System.out.println("NYC Parsing feedback XML...");
        return "NYC Feedback XML Message";
    }
}
