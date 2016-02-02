package exercises.Week02.springdi.src.di;


public interface MessageRenderer {

    void render();
    
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
