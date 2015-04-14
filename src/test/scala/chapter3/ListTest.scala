package chapter3

import org.scalatest._
import utils._

class ListTest extends UnitSpec {
 
  "tail methos" should " remove the first element of a list" in {
    assert( List.tail( List(1, 2, 3, 4) )  === List(2, 3, 4) )
    assert( List.tail( Nil ) == Nil )
  }

  "set head method" should "replace the first element of a list" in {
    assert( List.setHead( List(1, 2, 3, 4), 100 ) === List(100, 2, 3, 4) )
    assert( List.setHead( Nil, 100) === Nil )
  }

  "drop method" should "remove the first nth elements from a list" in {
    assert( List.drop( List(1, 2, 3, 4, 5), 2) === List(3, 4, 5) )
    assert( List.drop( List(1, 2, 3, 4, 5), 1) === List(2, 3, 4, 5) )
    assert( List.drop( List(1, 2, 3, 4, 5), 0) === List(1, 2, 3, 4, 5) )
    assert( List.drop( Nil, 2) === Nil )
  }

  "drop while method" should "remove the elements who match with the predicate" in {
    assert( List.dropWhile( List(1, 4, 2, 3, 4, 5, 4), ( (x: Int) => x == 4) ) === List(1, 2, 3, 5) )
  }
} 
