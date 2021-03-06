package cw_two

/**
  * Created by J2FX on 06/04/2016.
  */

object GameConstants {

  val noOfPegs = 4
  val noOfGuesses = 12
  val colours = Array("Red", "Yellow", "Green", "Orange", "Blue", "Purple")
  val openingMessage = (
    "Welcome to Mastermind.\n\n" +
      "This is a text version of the classic board game Mastermind.\n" +
      "The computer will think of a secret code.\n" +
      "The code consists of "+noOfPegs+" colored pegs.\n" +
      "The pegs may be one of six colors: blue, green , orange, purple, red, or yellow.\n" +
      "A color may appear more than once in the code.\n\n" +
      "You try to guess what colored pegs are in the code and what order they are in\n" +
      "After making a guess the result will be displayed.\n" +
      "A result consists of a black peg for each peg you have exactly correct (color and position) in your guess.\n" +
      "For each peg in the guess that is the correct color, but is out of position, you get a white peg.\n\n" +
      "Only the first letter of the color is displayed. B for Blue, R for Red, and so forth.\n" +
      "When entering guesses you only need to enter the first character of the color as a capital letter.\n\n" +
      "You have 12 to guess the answer or you lose the game."
    )
}