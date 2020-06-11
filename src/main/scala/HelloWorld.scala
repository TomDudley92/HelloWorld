
object HelloWorld {

  def printHelloWorld(language: String): String = {
    language.toLowerCase() match {
      case ("en") => "Hello World!"
      case ("fr") => "Bonjour le monde!"
    }
  }

}
