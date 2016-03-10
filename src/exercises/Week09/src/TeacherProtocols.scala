object TeacherProtocol{

  case class QuoteRequest()
  case class QuoteResponse(quoteString:String)
  case class AddQuote(quote:String)
  case class AddQuoteResponse(quote:String)


}