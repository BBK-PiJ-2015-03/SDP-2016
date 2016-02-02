package exercises.Week2.springdi.src.dixml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringWithDIXMLFile {

    public static void main(String[] args) throws Exception {

        // get the bean factory
        BeanFactory factory = getBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }

    private static BeanFactory getBeanFactory() throws Exception {
        // create a bean factory from beans.xml
        BeanFactory factory = new ClassPathXmlApplicationContext("/Users/J2FX/SDP2016/src/exercises.Week2/springdi/src/dixml/beans.xml");
        return factory;
    }
}