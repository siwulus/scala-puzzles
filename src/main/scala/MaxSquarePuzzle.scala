import DividePuzzle.{divide, plus}

object MaxSquarePuzzle {

  def main(args: Array[String]): Unit = {

    println(findMaxSquare(6, 3, 2)) //should return 36
    println(findMaxSquare(5, -7, -3)) //should return 49
    println(findMaxSquare(8, -8, 8)) //should return 64
    //println(max(30, 42, 75))
    //println(max(30, 75, 42))
    //println(max(75, 42, 30))
    //println(square(3))
  }

  /**
    * Napisz funkcje ktora zwraca najwieksza liczbe z podanych x, y, z
    */
  def max(x: Int, y: Int, z: Int): Int = {
    if (x <= y) {
      if (y <= z) z else y
    } else {
      if (x <= z) z else x
    }
  }

  /**
    * Napisz funkcje ktora zwraca kwadrat liczby x
    */
  def square(x: Int): Int = x * x


  /**
    * Napisz funkcje ktora zwraca najwieksza liczbe bedaca kwadratem liczby x, y, z
    */
  def findMaxSquare(x: Int, y: Int, z: Int): Int = max(square(x), square(y), square(z))
  }




