package chapter2

import org.scalatest._
import utils._

class MyModuleTest extends UnitSpec {

  "method is sorted" should "calculate if a list is sorted" in {

    assert( MyModule.isSorted( Array(1, 2, 3, 4, 5), (a: Int, b: Int) => a < b ) )
    assert( !MyModule.isSorted( Array(1, 2, 3, 4, 5), (a: Int, b: Int) => a > b ) )
    assert( !MyModule.isSorted( Array(1, 4, 3, 4, 5), (a: Int, b: Int) => a < b ) )
    assert( MyModule.isSorted( Array(5, 4, 3, 2, 1), (a: Int, b: Int) => a > b ) )
    assert( !MyModule.isSorted( Array(5, 4, 3, 1, 2), (a: Int, b: Int) => a > b ) )
    assert( MyModule.isSorted( Array(10), (a: Int, b: Int) => a > b ) )
    assert( MyModule.isSorted( Array("a", "bc", "def"), (a: String, b: String) => a.length < b.length ) )
  
  }

}
