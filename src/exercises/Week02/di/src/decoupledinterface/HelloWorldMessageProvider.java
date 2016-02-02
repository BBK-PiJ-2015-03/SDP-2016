package exercises.Week02.di.src.decoupledinterface;

public class HelloWorldMessageProvider implements MessageProvider {

	public String getMessage() {
		return "Hello World!";
	}

}