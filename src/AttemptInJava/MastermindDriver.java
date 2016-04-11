package AttemptInJava;

public class MastermindDriver {

    // Example - change as you need to...
    public static void main(String[] args) {
//        Game g = Factory.getInstance(Game.class, true);
//        g.runGames();
//
//        g = Factory.getInstance(Game.class, false);
//        g.runGames();

        SecretCode sC = SecretCodeFactory.getInstance();
       // System.out.println(sC.getColours());
        System.out.println(sC.getNoOfPegs());

        Peg bluePeg = PegFactory.getInstance("B");

        Peg redPeg = PegFactory.getInstance("R");

        System.out.println("Blue: " +bluePeg.getColour());

        System.out.println("Red: " +redPeg.getColour());
    }
}