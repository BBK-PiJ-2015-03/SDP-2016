// Given the following code:
import exercises.atomicscala.src.com.atomicscala.AtomicTest._  //Import is not working... cannot answer the questions.

class Cup {
  var percentFull = 0
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    percentFull // Return this value
  }
}

val cup = new Cup
cup.add(45) is 45
cup.add(-15) is 30
cup.add(-50) is -20