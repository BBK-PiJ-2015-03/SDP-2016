package exercises.Week02.di.src.decoupledwithfactory;

public interface MessageRenderer {

	public void render();

	public void setMessageProvider(MessageProvider provider);

	public MessageProvider getMessageProvider();
}
