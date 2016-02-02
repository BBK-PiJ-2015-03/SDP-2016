package exercises.Week3.FactoryMethodDesignPattern;

/**
 * Created by J2FX on 19/01/2016.
 */
public class MetalProduct implements Product{

    @Override
    public void draw() {
        System.out.println("I am a Metal Product");
    }
}
