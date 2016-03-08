import exercises.atomicscala.src.com.atomicscala.AtomicTest._

object PatternMatching extends App {
  forecast(100) is "Sunny"
  forecast(80) is "Mostly Sunny"
  forecast(50) is "Partly Sunny"
  forecast(20) is "Mostly Sunny"
  forecast(0) is "Cloudy"
  forecast(15) is "Unknown"


  // Question 1;
  def forecast(temp: Int): String = temp match{
    case 100 => "Sunny"
    case 80 => "Mostly Sunny"
    case 50 => "Partly Sunny"
    case 20 => "Mostly Sunny"
    case 0 => "Cloudy"
    case _ => "Unknown"
  }

  // Question 2;
  val forecastVector = Vector(100,80,50,20,0,15)

  for(num <- forecastVector){
    println(forecast(num))
  }

}