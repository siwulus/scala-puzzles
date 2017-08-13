object DividePuzzle {

  def main(args: Array[String]): Unit = {

    println(divide(10, 11).getOrElse("dzielenie niedozwolone"))
    println(divide(10, 0).getOrElse("dzielenie niedozwolone"))


  }

  /**
    * Napisz funkcje ktora przyjmuje dwie liczby calkowite i zwraca wynik ich dzielenia jako liczbe zmiennoprzecinkowa Double.
    * Funkcja powinna obsluzyc przypadek niedozwolonego dzielenia przez 0.
    */
  def divide(x: Int, y: Int): Option[Double] = {
    if (y == 0) None
    else Some(x / y.toDouble)
  }

}
