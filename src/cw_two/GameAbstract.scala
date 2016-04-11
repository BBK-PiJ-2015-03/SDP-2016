package cw_two

abstract class GameAbstract extends Game {
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

      print("The secret code is ")
      code.foreach(c => print(c.name))
    }
  }
}

class EasyGameImpl extends GameAbstract(true)

class HardGameImpl extends GameAbstract(false)