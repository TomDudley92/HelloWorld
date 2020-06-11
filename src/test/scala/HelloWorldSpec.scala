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

    "provided with 'fr'" should {

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

    "provided with 'usa'" should {

      "return 'Hello Y'all!'" in {

        val result = HelloWorld.printHelloWorld("usa")

        result shouldBe "Hello Y'all!"
      }
    }


    "provided with an unsupported string" should {

      "return 'Erm... Hello World?!'" in {

        val result = HelloWorld.printHelloWorld("erm")

        result shouldBe "Erm... Hello World?!"
      }
    }
  }
}
