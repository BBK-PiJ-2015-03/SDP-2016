package AttemptInJava;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SecretCodeFactory {

    public static SecretCode getInstance(){
        BeanFactory context = new ClassPathXmlApplicationContext("AttemptInJava/Beans.xml");
        return (SecretCode) context.getBean("cw_two.SecretCode");
    }
}
