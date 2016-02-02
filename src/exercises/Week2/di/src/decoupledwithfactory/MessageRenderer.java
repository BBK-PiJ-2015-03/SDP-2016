package exercises.Week2.di.src.decoupledwithfactory;

public interface MessageRenderer {

	public void render();

	public void setMessageProvider(MessageProvider provider);

	public MessageProvider getMessageProvider();
}
