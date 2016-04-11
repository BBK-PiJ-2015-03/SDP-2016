package AttemptInJava;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PegFactory {

    public static Peg getInstance(String colour){
        BeanFactory context = new ClassPathXmlApplicationContext("AttemptInJava/Beans.xml");
        return (Peg) context.getBean(colour+"Peg");
    }
}
