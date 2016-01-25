package Week2.FactoryMethodDesignPattern;

/**
 * Created by J2FX on 19/01/2016.
 */
public class RunProduct {
    public static void main(String[] args) {
        ConcreteCreator cc = new ConcreteCreator();
        MetalCreator mc = new MetalCreator();

        Product concrete = cc.createProduct();
        Product metal = mc.createProduct();
        Product ja = mc.createProduct();

        metal.draw();
        concrete.draw();
        ja.draw();
    }
}
