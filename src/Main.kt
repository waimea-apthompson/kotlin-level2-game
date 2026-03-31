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
    println("=================".col(159, 235, 665))
    println("=               =".col(159, 235, 665))
    println("= the squeeze   =".col(159, 235, 665))
    println("=               =".col(159, 235, 665))
    println("=================".col(159, 235, 665))
    println()
    println()
    creatbored()
    setupconters()
    playername()
    showboreod()
    whatplayer1do()
}


fun whatplayer1do() {

    while (true) {
        val action = player1answer()

        when (action) {

            'L' -> left()

            'R' -> right()

            'S' -> swap()

        }
        whatplayer2do()



    }
}


fun whatplayer2do() {
    while (true) {
        val action2 = player2answer()

        when (action2) {

            'L' -> left()

            'R' -> right()

            'S' -> swap()
        }
        boreadshrink()
whatplayer1do()


    }
}




fun creatbored(){
    while (squares.size < 15) {
        squares.add  (".")

    }
}


fun showboreod(){


    println("  1   2   3   4   5   6   7   8   9  10  11  12  13  14  15".col(323,451,130))

    print("╔═══".repeat(squares.size).col(323,451,130))
    println("╗".col(323,451,130))
    for (square in squares) {

        print("║ $square".padEnd(4).col(323,451,130))
    }
    println("║".col(323,451,130))
    print("╚═══".repeat(squares.size).col(323,451,130))
    println("╝".col(323,451,130))

}


fun playername(){

    println("player one what  your name?".col(159,235,665))
    var p1n = readln()

    println("what a dumb ass name, o and you are white:) aka w".col(159,235,665))
    println()
    println("player two surely you have a better name?".col(159,235,665))
    var p2n = readln()

    println("dam it some how worse!, o u black:( aka b".col(159,235,665))
}

fun player1answer(): Char{
    println("what you what to do white?".col(555,99,4343))
    println("move [L]eft".col(555,99,4343))
    println("move [R]ight".col(555,99,4343))
    println("[S]wap".col(555,99,4343))
    println()
    val goodchoise = listOf("L, R, S")
    while (true) {
        print("chosie: ".col(555,99,4343))
        val choice = readlnOrNull()?.firstOrNull()
        if (choice != null) return choice

    }

}


fun player2answer(): Char{
    println("what you what to do black?".col(22,777,99))
    println("move [L]eft".col(22,777,99))
    println("move [R]ight".col(22,777,99))
    println("[S]wap".col(22,777,99))
    println()
    val goodchoise = listOf("L, R, S")
    while (true) {
        print("chosie: ".col(22,777,99))
        val choice = readlnOrNull()?.firstOrNull()
        if (choice != null) return choice
    }
}
fun setupconters(){
    val p1Con = "w ".col(555,99,4343)
    val p2Con = "b ".col(22,777,99)
    squares[6] = p1Con
    squares[4] = p1Con
    squares[8] = p1Con
    squares[9] = p2Con
    squares[7] = p2Con
    squares[5] = p2Con
}
fun swap(){
println("switch pick 1".col(13,551,161))
    val cont1 = readln().toInt() - 1

    println("switch pick 2".col(13,551,161))
    val cont2 = readln().toInt() - 1

    val place1 = squares[cont1 ]
    val place2 = squares[cont2 ]


    squares[cont1 ] = place2
    squares[cont2 ] = place1
    println()
    showboreod()
}

fun right(){
println("what one do u what to move to the right?".col(92,741,32))
    val cont1 = readln().toInt() - 1

    val cont2 = cont1 + 1

    val place1 = squares[cont1 ]
    val place2 = squares[cont2 ]


    squares[cont1 ] = place2
    squares[cont2 ] = place1
println()
    showboreod()
}


fun left(){
    println("what one do u what to move to the left?".col(743,62,88))
    val cont1 = readln().toInt() - 1

    val cont2 = cont1 - 1

    val place1 = squares[cont1 ]
    val place2 = squares[cont2 ]


    squares[cont1 ] = place2
    squares[cont2 ] = place1
    println()
    showboreod()

}

fun boreadshrink(){
println("boread will shrink")
}