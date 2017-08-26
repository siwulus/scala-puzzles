object DividePuzzle {

  def main(args: Array[String]): Unit = {

    println(divide(10, 11))
    println(divide(10, 0))

    println(divide(10, 11).getOrElse("dzielenie niedozwolone"))
    println(divide(10, 0).getOrElse("dzielenie niedozwolone"))

    //podziel dwie liczby i dodaj do nich 5


    println(divide(20, 6).map(result => result + 5))
    println(divide(20, 0).map(result => result + 5))

    divide(20, 6).map(result => result + 5).foreach(println)
    divide(20, 0).map(result => result + 5).foreach(println)

    println(divide(34, 4).map(result => plus(result, 7)))
    println(divide(34, 4).map(plus(_, 7)))
    println(divide(34, 0).map(result => plus(result, 7)))

    print(combine(22, 0, 45))
    print(combine(22, 1, 5))


  }

  /**
    * Napisz funkcje ktora przyjmuje dwie liczby calkowite i zwraca wynik ich dzielenia jako liczbe zmiennoprzecinkowa Double.
    * Funkcja powinna obsluzyc przypadek niedozwolonego dzielenia przez 0.
    */
  def divide(x: Int, y: Int): Option[Double] = {
    if (y == 0) None
    else Some(x / y.toDouble)
  }

  def plus (x: Double, y: Double):Double = x + y

  def combine(x: Int, y: Int, z: Double): Option[Double] = divide(x, y).map(plus(_, z))
}

// (10 / 1) + 1