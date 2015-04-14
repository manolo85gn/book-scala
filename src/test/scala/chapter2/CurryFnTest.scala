package chapter2

import org.scalatest._
import utils._

class CurryFnTest extends UnitSpec {

  "curry method" should "evaluates sequence of functions with one arguments" in {
    def sum = CurryFn.curry( (a:Int, b: Int)=> a + b )
    def sum5 = sum(5)
    assert( sum5(2) === 7 )
  } 

  "uncurry method" should "be the defunctionalization of curry" in {
    def sum = CurryFn.curry( (a:Int, b: Int) => a + b )
    def sumUncurry = CurryFn.uncurry(sum)
    assert( sumUncurry(5, 2) === 7 )
  }
}
