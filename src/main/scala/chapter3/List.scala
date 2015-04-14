package chapter3

sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {

  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(nums: List[Double]): Double = nums match {
    case Nil => 1.0
    case Cons(0.0, _) => 0
    case Cons(x, xs) => x * product(xs)
  }

  def tail[A](as: List[A]): List[A] = as match {
    case Cons(x, xs) => xs
    case _ => Nil
  }

  def setHead[A](as: List[A], value: A) : List[A] = as match {
    case Cons(x, xs) => Cons(value, xs)
    case _ => Nil
  }

  def drop[A](as: List[A], n: Int) : List[A] = n match {
    case 0 => as
    case _ => drop( tail(as), n - 1 )
  }

  def dropWhile[A](as: List[A], f: A => Boolean): List[A] = as match {
    case Nil => as
    case Cons(x, xs) => if( f(x) ) dropWhile(xs, f) else Cons(x, dropWhile(xs, f) ) 
  }

  def apply[A](as: A*): List[A] = {
    if(as.isEmpty)
      Nil
    else
      Cons( as.head, apply(as.tail: _*) )
  }

}
