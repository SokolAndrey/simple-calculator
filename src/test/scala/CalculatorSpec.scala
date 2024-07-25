import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CalculatorSpec extends AnyFlatSpec with Matchers {
  "Calculator" should "add two numbers correctly" in {
    Calculator.add(1, 2) shouldEqual 3
  }

  it should "subtract two numbers correctly" in {
    Calculator.subtract(5, 3) shouldEqual 2
  }

  it should "multiply two numbers correctly" in {
    Calculator.multiply(3, 4) shouldEqual 12
  }

  it should "divide two numbers correctly" in {
    Calculator.divide(10, 2) shouldEqual 5
  }

  it should "throw an exception when dividing by zero" in {
    an [IllegalArgumentException] should be thrownBy Calculator.divide(10, 0)
  }
}

