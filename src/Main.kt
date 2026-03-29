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
   println("=================".col(159,235,665))
    println("=               =".col(159,235,665))
    println("= the squeeze   =".col(159,235,665))
    println("=               =".col(159,235,665))
    println("=================".col(159,235,665))
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


    println("   1        2        3        4        5        6       7        8        9        10        11        12       13       14       15".col(323,451,130))

    print("╔════════".repeat(squares.size).col(323,451,130))
    println("╗".col(323,451,130))
    for (square in squares) {

        print("║  $square".padEnd(9).col(323,451,130))
    }
    println("║".col(323,451,130))
    print("╚════════".repeat(squares.size).col(323,451,130))
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
        print("chosie: ")
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
println("switch pick 1")
    val cont1 = readln().toInt()

    println("switch pick 2")
    val cont2 = readln().toInt()

    val place1 = squares[cont1 - 1]
    val place2 = squares[cont2 - 1]


    squares[cont1 - 1] = place2
    squares[cont2 - 1] = place1
    println()
    showboreod()
}

fun right(){


}


fun left(){


}

fun boreadshrink(){

}