package cw_two
import com.softwaremill.macwire._

/**
  * Created by J2FX on 06/04/2016.
  */

object PegFactory {

  def getInstance(colour : String) : Peg = colour match {
    case "Red" => wire[Red]
    case "Blue" => wire[Blue]
    case "Green" => wire[Green]
    case "Purple" => wire[Purple]
    case "Orange" => wire[Orange]
    case "Yellow" => wire[Yellow]
    case _ => throw new IllegalArgumentException("Unknown colour " + colour)
  }
}