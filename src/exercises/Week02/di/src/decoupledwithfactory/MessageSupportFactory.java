package exercises.Week02.di.src.decoupledwithfactory;

import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {

	private static MessageSupportFactory instance = null;
	private Properties props = null;
	private MessageRenderer renderer = null;
	private MessageProvider provider = null;

	private MessageSupportFactory() {
		props = new Properties();

		try {
			props.load(new FileInputStream("/Users/J2FX/SDP2016/src/exercises.Week2/di/src/decoupledwithfactory/bean.properties"));
			// get the implementation classes
			String rendererClass = props.getProperty("renderer.class");
			String providerClass = props.getProperty("provider.class");
			renderer = (MessageRenderer) Class.forName(rendererClass)
					.newInstance();
			provider = (MessageProvider) Class.forName(providerClass)
					.newInstance();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	static {
		instance = new MessageSupportFactory();
	}

	public static MessageSupportFactory getInstance() {
		return instance;
	}

	public MessageRenderer getMessageRenderer() {
		return renderer;
	}

	public MessageProvider getMessageProvider() {
		return provider;
	}

}