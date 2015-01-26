package chapter2

import org.scalatest._
import utils._

class FibonacciTest extends UnitSpec {
  
  "a finbonacci method" should "calculate the fibonacci value" in {
     assert( Fibonacci.calculate(0) === 0 )
     assert( Fibonacci.calculate(1) === 1 )
     assert( Fibonacci.calculate(2) === 1 )
     assert( Fibonacci.calculate(3) === 2 )
  } 
}
