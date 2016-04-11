package cw_two

abstract class GameAbstractImpl extends Game {
  private var showCode: Boolean = false

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
    println("Generating Secret Code...")
    val code = SecretCode.generate

    if(this.showCode){
      println("The secret code is " + code.mkString)
    }

    //12 turns

    //read input
    //compare input
    //print result
    //deduct turns
    //repeat
  }
}

class EasyGame extends GameAbstractImpl(true)

class HardGame extends GameAbstractImpl(false)