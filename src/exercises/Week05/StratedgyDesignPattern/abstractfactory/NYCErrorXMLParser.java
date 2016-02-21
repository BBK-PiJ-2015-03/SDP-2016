package exercises.Week05.StratedgyDesignPattern.abstractfactory;

public class NYCErrorXMLParser implements XMLParser{

    @Override
    public String parse(){
        System.out.println("NYC Parsing Error XML...");
        return "NYC Error XML Message";
    }}
