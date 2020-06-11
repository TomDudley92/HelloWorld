import org.scalatest.{Matchers, WordSpec}

class HelloWorldSpec extends WordSpec with Matchers {

  "HelloWorld" when {

    "provided with 'EN'" should {

      "return Hello World!" in {

        val result = HelloWorld.printHelloWorld("EN")

        result shouldBe "Hello World!"

      }
    }

    "provided with 'en'" should {

      "return Hello World!" in {

        val result = HelloWorld.printHelloWorld("en")

        result shouldBe "Hello World!"
      }
    }

    "provided with 'FR'" should {

      "return 'Bonjour le monde!'" in {

        val result = HelloWorld.printHelloWorld("fr")

        result shouldBe "Bonjour le monde!"

      }
    }

    "provided with 'HU" should {

      "return 'Helló Világ!" in {

        val result = HelloWorld.printHelloWorld("hu")

        result shouldBe "Helló Világ!"
      }
    }

  }

}
