//import TeacherProtocol._
//import akka.actor.Actor
//
///*
// * Your Teacher Actor class.
// *
// * The class could use refinement by way of
// * using ActorLogging which uses the EventBus of the Actor framework
// * instead of the plain old System out
// *
// */
//  class TeacherActor extends Actor {
//
//    var quotes = List(
//      "Moderation is for cowards",
//      "Anything worth doing is worth overdoing",
//      "The trouble is you think you have time",
//      "You never gonna know if you never even try")
//
//    def receive = {
//
//      case QuoteRequest => {
//
//        import util.Random
//
//        //Get a random Quote from the list and construct a response
//        val quoteResponse = QuoteResponse(quotes(Random.nextInt(quotes.size)))
//
//        println(quoteResponse)
//
//      }
//
//      case AddQuote(quote:String) => {
//        if(quotes.contains(quote)) {
//          println("Quote Already In List - Not Added")
//          throw new IllegalArgumentException("Illegal Imigrant ")
//
//        }else {
//          quotes = quotes ::: List(quote) // Add to a list
//          val addQuoteResponse = AddQuoteResponse(quote)
//          println(addQuoteResponse)
//        }
//    }
//
//
//
//    }
//}
