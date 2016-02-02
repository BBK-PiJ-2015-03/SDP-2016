package exercises.Week02.di.src.decoupledinterface;

public interface MessageRenderer {

    void render();
    
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
