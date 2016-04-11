package AttemptInJava;

/**
 * Created by J2FX on 10/03/2016.
 */
public class EasyGameImpl extends GameAbstractImpl {
    /**
     * Create a Game object.
     *
     */
    public EasyGameImpl() {
        super(true);
    }

    @Override
    public void runGames() {
    Math.random();
    }
}
