package exercises.Week02.di.src.decoupled;

public class HelloWorldDecoupled {

	public static void main(String[] args) {
		StandardOutMessageRenderer mr = new StandardOutMessageRenderer();
		HelloWorldMessageProvider mp = new HelloWorldMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
	}
}
