package exercises.Week3.FactoryMethodDesignPattern;

/**
 * Created by J2FX on 19/01/2016.
 */
public class MetalCreator implements Creator{
    @Override
    public Product createProduct() {
        return () -> System.out.println("I am a metal product");
    }
}
