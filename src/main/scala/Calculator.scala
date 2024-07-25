object Calculator {
  def add(a: Double, b: Double): Double = a + b

  def subtract(a: Double, b: Double): Double = a - b

  def multiply(a: Double, b: Double): Double = a * b

  def divide(a: Double, b: Double): Double = 
    if (b != 0) a / b
    else throw new IllegalArgumentException("Division by zero")
}

