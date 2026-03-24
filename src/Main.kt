/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   squeeze
 * Project Author: austin
 * GitHub Repo:    GITHUB REPO URL HERE
 * ---------------------------------------------------------------------
 * Notes:
 * PROJECT NOTES HERE
 * =====================================================================
 */


val squares = mutableListOf<String>()
val p2n = String
val p1n = String
fun main() {
   println("=================")
    println("=               =")
    println("= the squeeze   =")
    println("=               =")
    println("=================")
println()
    println()
    creatbored()
    setupconters()
    playername()
showboreod()



    while (true){
        val action = player1answer()

        when (action) {

            'L' -> left()

            'R' -> right()

            'S' ->swap()
        }
        break
    }


    while (true){
        val action2 = player2answer()

        when (action2) {

            'L' -> left()

            'R' -> right()

            'S' ->swap()
        }
    }
}




fun creatbored(){
    while (squares.size < 15) {
        squares.add  ("...")

    }
}


fun showboreod(){


    println("   1        2        3        4        5        6       7        8        9        10        11        12       13       14       15")

    print("╔════════".repeat(squares.size))
    println("╗")
    for (square in squares) {

        print("║  $square".padEnd(9))
    }
    println("║")
    print("╚════════".repeat(squares.size))
    println("╝")

}


fun playername(){

    println("player one what  your name?")
    var p1n = readln()

    println("what a dumb ass name, o and you are white:) aka w")
    println()
    println("player two surely you have a better name?")
    var p2n = readln()

    println("dam it some how worse!, o u black:( aka b")
}

fun player1answer(): Char{
    println("what you what to do white?")
    println("move [L]eft")
    println("move [R]ight")
    println("[S]wap")
    println()
    val goodchoise = listOf("L, R, S")
    while (true) {
        print("chosie: ")
        val choice = readlnOrNull()?.firstOrNull()
        if (choice != null) return choice
    }

}

fun player2answer(): Char{
    println("what you what to do white?")
    println("move [L]eft")
    println("move [R]ight")
    println("[S]wap")
    println()
    val goodchoise = listOf("L, R, S")
    while (true) {
        print("chosie: ")
        val choice = readlnOrNull()?.firstOrNull()
        if (choice != null) return choice
    }
}
fun setupconters(){
    val p1Con = "w"
    val p2Con = "b"
    squares[6] = p1Con
    squares[4] = p1Con
    squares[8] = p1Con
    squares[9] = p2Con
    squares[7] = p2Con
    squares[5] = p2Con
}
fun swap(){
println("under constraction")
}

fun right(){


}


fun left(){


}