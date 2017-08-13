object IfExercise {
    
    /* tu masz metode uruchamiajaca kod - wynika ze ze specyfiki scali 
        w srodku mozesz pisac wykonania metod
    */
    def main(args: Array[String]):Unit = {
        
        println(calculate(10, 11))
        println(calculate(1, 4))
        println(calculate(100, 4))
        
    }
    
    /* a tu masz sygnature metody do zaimplementowania
        znaczek ??? oznacza ze metoda oczekuje na implementacje ale jest akceptwany 
        przez jedzyk i nie powoduje bledu na kompilacji a dopiero na uruchomieniu
        rzuca blad ze metoda nie jest zaimplementowana
    */
    def calculate(x: Int, y: Int): Int = ???
}

//def sum (i: Int, j: Int): Int=  i + j
//
//def min (i: Int, j: Int):Int = i - j
//
//val i = 5
//val j = 10
//
//if (i < 10) {min (i,  j)
//} else
//sum (i , j )
//
//// wersja 2
//
//def sum (i: Int, j: Int): Int=  i + j
//
//def min (i: Int, j: Int):Int = i - j
//
//val i = 5
//val j = 10
//
//if (i < 10) {
//println ( min (i,  j))
//} else
//println ( sum (i , j ) )
