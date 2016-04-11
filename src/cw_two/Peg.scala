package cw_two

/**
  * Created by J2FX on 06/04/2016.
  */
abstract class Peg(colour: Char) {
  val name = colour
}

class Red extends Peg('R')

class Blue extends Peg('B')

class Green extends Peg('G')

class Orange extends Peg('O')

class Purple extends Peg('P')

class Yellow extends Peg('Y')

