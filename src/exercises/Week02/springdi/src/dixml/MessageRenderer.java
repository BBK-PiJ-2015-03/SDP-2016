package exercises.Week02.springdi.src.dixml;

public interface MessageRenderer {

    void render();

    MessageProvider getMessageProvider();

    void setMessageProvider(MessageProvider provider);
}
