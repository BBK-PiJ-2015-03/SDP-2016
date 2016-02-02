package Week3.TheSingletonDesignPattern;

/**
 * Long form questions
 * Question 2 - The Singleton Design Pattern
 *
 */
public class SingletonMultiThreaded {

    private static SingletonMultiThreaded instance = null;

    public synchronized static SingletonMultiThreaded getInstance(){
        if(instance == null){
            instance = new SingletonMultiThreaded();
        }
        return instance;
    }

}
