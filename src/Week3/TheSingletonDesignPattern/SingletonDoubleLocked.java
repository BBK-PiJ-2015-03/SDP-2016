package Week3.TheSingletonDesignPattern;

/**
 * Long form questions
 * Question 2 - The Singleton Design Pattern
 */
public class SingletonDoubleLocked {

    private static SingletonDoubleLocked instance = null;

    public static SingletonDoubleLocked getInstance(){
        if(instance == null){
            synchronized (new Object()){
                if(instance == null){
                    instance = new SingletonDoubleLocked();
                }
            }
        }
        return instance;
    }

}
