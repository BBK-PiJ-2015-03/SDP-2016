package exercises.Week05.abstractfactory;

/**
 * Added tests for all possible parsers to be sure all work.
 * Did not include javadoc in all files as it is self explanatory.
 */
public class TestAbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NYCFactory");
        XMLParser parser = parserFactory.getParserInstance("NYCORDER");
        String msg = "";
        msg = parser.parse();
        System.out.println(msg);
        System.out.println("************************************");
        parser = parserFactory.getParserInstance("NYCERROR");
        msg = parser.parse();
        System.out.println(msg);
        System.out.println("************************************");
        parser = parserFactory.getParserInstance("NYCRESPONSE");
        msg = parser.parse();
        System.out.println(msg);
        System.out.println("************************************");
        parser = parserFactory.getParserInstance("NYCFEEDBACK");
        msg = parser.parse();
        System.out.println(msg);
        System.out.println("************************************");
        parserFactory = ParserFactoryProducer.getFactory("LondonFactory");
        parser = parserFactory.getParserInstance("LondonFEEDBACK");
        msg = parser.parse();
        System.out.println(msg);
        System.out.println("************************************");
        parser = parserFactory.getParserInstance("LondonERROR");
        msg = parser.parse();
        System.out.println(msg);
        System.out.println("************************************");
        parser = parserFactory.getParserInstance("LondonRESPONSE");
        msg = parser.parse();
        System.out.println(msg);
        System.out.println("************************************");
        parser = parserFactory.getParserInstance("LondonORDER");
        msg = parser.parse();
        System.out.println(msg);
    }
}