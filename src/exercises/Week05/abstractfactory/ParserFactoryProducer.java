package exercises.Week05.abstractfactory;

public abstract class ParserFactoryProducer implements AbstractParserFactory {

    public static AbstractParserFactory getFactory(String factoryType){
        if(factoryType.equals("NYCFactory")){
            return new NYCFactory();
        }
        if(factoryType.equals("LondonFactory")){
            return new LondonFactory();
        }
        return null;
    }
}
