package Week3.TheSingletonDesignPattern;

/**
 * Created by J2FX on 02/02/2016.
 *
 * There are some other ways to break the singleton pattern:
 • If the class is Serializable.
 • If it is Cloneable.
 • It can be broken by reflection.
 • If the class is loaded by multiple class loaders.
 *
 * I will do some reading up on the above before attempting this.
 *
 */
public class SingletonProtected {

    public static SingletonProtected instance = null;

    public static SingletonProtected getInstance(){
        if(instance == null){
            instance = new SingletonProtected();
        }
        return instance;
    }
}
