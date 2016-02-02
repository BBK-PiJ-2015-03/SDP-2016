package exercises.Week2.springdi.src.helloworld;

public interface MessageRenderer {

    void render();
    
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
