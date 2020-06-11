
object HelloWorld {

  def printHelloWorld(language: String): String = {
    language.toLowerCase() match {
      case ("en") => "Hello World!"
      case ("fr") => "Bonjour le monde!"
      case ("hu") => "Helló Világ!"
      case ("usa") => "Hello Y'all!"
      case _ => "Erm... Hello World?!"
    }
  }

}
