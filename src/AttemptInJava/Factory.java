package AttemptInJava;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Factory {

    public static Game getInstance(Class c, Boolean b){
        BeanFactory context = new ClassPathXmlApplicationContext("AttemptInJava/Beans.xml");

        return b? (Game) context.getBean(c.getName()+"_Easy"):(Game) context.getBean(c.getName()+"_Hard");
    }
}
