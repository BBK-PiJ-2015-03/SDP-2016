package exercises.Week03.FactoryMethodDesignPattern;

/**
 * Created by J2FX on 19/01/2016.
 */
public class ConcreteProduct implements Product {
    @Override
    public void draw() {
        System.out.println("I am a concrete product");
    }
}
