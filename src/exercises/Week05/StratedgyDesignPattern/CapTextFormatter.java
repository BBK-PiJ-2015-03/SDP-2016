package exercises.Week05.StratedgyDesignPattern;

/**
 * Created by J2FX on 02/02/2016.
 */
public class CapTextFormatter implements TextFormatter{

    @Override
    public void format(String text) {
        System.out.println(text.toUpperCase());
    }
}
