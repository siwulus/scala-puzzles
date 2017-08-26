package main.scala

import scala.annotation.tailrec

object FindMaxPuzzle {

  def main(args: Array[String]): Unit = {


    println("max")
    println(max(List(30)))
    println(max(List(30, 75, 42)))
    println(max(List(34, 42, 30, 111, 345, 443, 4, 56)))

    println("maxRecursive")
    println(maxRecursive(List(30)))
    println(maxRecursive(List(30, 75, 42)))
    println(maxRecursive(List(34, 42, 30, 111, 345, 443, 4, 56)))

    println("maxTailRecursive")
    println(maxTailRecursive(List(30)))
    println(maxTailRecursive(List(30, 75, 42)))
    println(maxTailRecursive(List(34, 42, 30, 111, 345, 443, 4, 56)))
  }

  /**
    * Napisz funkcje ktora zwraca najwieksza liczbe w liscie
    */
  def max(l: List[Int]): Int = {
    var x = l.head
    var t = l.tail
    while (t != Nil) {
      if (x < t.head) {
        x = t.head
      }
      t = t.tail
    }
    x
  }


  def maxRecursive(l: List[Int]): Int = l match {
    case h :: Nil => h
    case h :: t => if (h >= maxRecursive(t)) h else maxRecursive(t)
  }


  def maxTailRecursive(l: List[Int]): Int = {
    @tailrec
    def maxDo(m: Int, lt: List[Int]): Int = lt match {
      case h :: t => if (m < h) maxDo(h, t) else maxDo(m, t)
      case Nil => m
    }

    maxDo(l.head, l.tail)
  }
}




