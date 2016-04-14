package cw_two

abstract class GameAbstract extends Game {
  private var showCode: Boolean = false
  private var noOfGuesses = GameConstants.noOfGuesses

  /**
    * Create a Game object.
    *
    * @param easy If easy is true the secret code will be
    *             revealed at all times when playing the game. If easy is
    *             false the secret code is not revealed until correctly guessed
    *             or the player runs out of turns.
    */
  def this(easy: Boolean) {
    this()
    showCode = easy
  }

  /**
    * Run a one or more game sof mastermind, until the player
    * quits.
    */
  override def runGames: Unit = {

    println(GameConstants.openingMessage)
    var continue = true;
    while (continue) {
      println("Generating Secret Code...")
      val code = SecretCode.generate
      var codeString = ""
      code.foreach(c => codeString += c.name)
      if (this.showCode) {
        println("The secret code is " + codeString)
      }
      do {
        println("You have " + noOfGuesses + " guesses left.")
        val guess = readLine()
        println(guess + " Result: " + CodeComparator(guess, codeString))
        noOfGuesses = noOfGuesses - 1
        if (CodeComparator.solved) {
          println("You solved the puzzle! Good Job")
        }
      } while (noOfGuesses != 0 && !CodeComparator.solved)
      if (!CodeComparator.solved) {
        println("You lose! Bad Job")
      }
      print("Enter Y for another game or anything else to quit: ")
      val choice = readLine()
      continue = choice.equalsIgnoreCase("Y")
      noOfGuesses = GameConstants.noOfGuesses
    }
  }
}

class EasyGameImpl extends GameAbstract(true)

class HardGameImpl extends GameAbstract(false)