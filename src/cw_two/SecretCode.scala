package cw_two

import scala.util.Random

/**
  * Created by J2FX on 06/04/2016.
  */
object SecretCode {

  def generate() : Array[Peg] = {
    var result = new Array[Peg](GameConstants.noOfPegs)
    var r = scala.util.Random
    for(i <- 0 until GameConstants.noOfPegs) {
      val rNum = r.nextInt(GameConstants.colours.length)
      result(i) = PegFactory.getInstance(GameConstants.colours(rNum))
    }

    result
  }

}
//
//val zipped = array1.zip(array2)
//
//zipped(1)._1 == zipped(1)._2