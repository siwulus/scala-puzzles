package main.scala

object FindModulo {

  def main(args: Array[String]): Unit = {
    println("findModulo2")
    println(findModulo2(List()))
    println(findModulo2(List(3)))
    println(findModulo2(List(3, 2)))
    println(findModulo2(List(3, 4, 6)))
    println(findModulo2(List(3, 5, 7)))
  }

  def findModulo2(l: List[Int]): Option[Int] = {
    var ls = l
    while (ls.nonEmpty) {
      if (ls.head % 2 == 0) {
        return Some(ls.head)
      }
      ls = ls.tail
    }
    None
  }
}


// 2 % 2 = 0
// 3 % 2 = 1
// 4 % 2 = 0