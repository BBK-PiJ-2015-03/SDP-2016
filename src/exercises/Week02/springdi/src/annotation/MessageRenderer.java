package exercises.Week02.springdi.src.annotation;

public interface MessageRenderer {

	void render();
	
	// autowiring will deal with these
	// public void setMessageProvider(MessageProvider provider);
	// public MessageProvider getMessageProvider();
}
