package exercises.Week03.FactoryMethodDesignPattern;

/**
 * Created by J2FX on 19/01/2016.
 */
public class ConcreteCreator implements Creator{

    @Override
    public Product createProduct(){
        return () -> System.out.println("I am a concrete product");
    }
}
