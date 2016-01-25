package Week2.springdi.src.dixmlcons;


public interface MessageRenderer {

    void render();

    MessageProvider getMessageProvider();

    void setMessageProvider(MessageProvider provider);
}
