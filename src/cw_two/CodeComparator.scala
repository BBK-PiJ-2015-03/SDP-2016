package cw_two

/**
  * Created by J2FX on 14/04/2016.
  */
class CodeComparator(guess: String, secretCode: String) {

  private val SIZE = GameConstants.noOfPegs
  val zipped = guess.zip(secretCode)
  val blackPegs = Array.fill[Boolean](SIZE)(false)
  val whitePegs = Array.fill[Boolean](SIZE)(false)

  def checkBlacks(): Int = {
    var results = 0
    for(i <- 0 until SIZE) {
      if(zipped(i)._1 == zipped(i)._2){
        results += 1
        blackPegs(i) = true;
      }
    }

    results
  }

  def checkWhites(): Int = {
    var guessTemp = guess.toCharArray
    var codeTemp = secretCode.toCharArray
    var result = 0

    for(i <- 0 until SIZE) {
      if (blackPegs(i)) {
        guessTemp(i) = '@'
        codeTemp(i) = '@'
      }
    }
    for(i <- 0 until SIZE) {
      if(guessTemp(i) != '@') {

        for(j <- 0 until SIZE) {
          if (codeTemp(j) != '@' && guessTemp(i) == codeTemp(j)) {
            result += 1
            guessTemp(i) = '@'
            codeTemp(j) = '@'
          }
        }
      }
    }

    result
  }

}



object CodeComparator {
  var solved = false;

  def apply(guess: String, secretCode: String): String = {
    solved = false;

    val cc = new CodeComparator(guess, secretCode)
    val bNum = cc.checkBlacks()
    val wNum = cc.checkWhites()

    var result: String = " "
    for(i <- 0 until bNum) {
      result += "Black "
    }
    for(i <- 0 until wNum) {
      result += "White "
    }
    if (bNum == GameConstants.noOfPegs) {
      solved = true;
    }
    result
  }
}
