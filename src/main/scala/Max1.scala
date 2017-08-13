object DividePuzzle {

  def main(args: Array[String]): Unit = {

    println(findMaxSquare(6, 3, 2)) //should return 36
    println(findMaxSquare(5, -7, -3)) //should return 49
    println(findMaxSquare(5, -8, 8)) //should return 64

  }

  /**
    * Napisz funkcje ktora zwraca najwieksza liczbe z podanych x, y, z
    */
  def max(x: Int, y: Int, z: Int): Int = ???

  /**
    * Napisz funkcje ktora zwraca kwadrat liczby x
    */
  def square(x: Int): Int = ???


  /**
    * Napisz funkcje ktora zwraca najwieksza liczbe bedaca kwadratem liczby x, y, z
    */
  def findMaxSquare(x: Int, y: Int, z: Int): Int = ???


}
