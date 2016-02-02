package exercises.Week02.di.src.decoupledwithfactory;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World!";
    }

}