package exercises.Week02.springdi.src.helloworld;

public interface MessageRenderer {

    void render();
    
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
