package Week2.springdi.src.di;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {

        return "Hello World!";
    }

}