package Week3.TheSingletonDesignPattern;

/**
 * Long form questions
 * Question 2 - The Singleton Design Pattern
 */
public class Singleton {

    private static Singleton instance = null;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
