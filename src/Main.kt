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
var p2n = " "
var p1n = " "
var lowbored = 0
var highbored = 14
var playerconter = 0
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
        playerconter ++
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
        playerconter --
        when (action2) {

            'L' -> left()

            'R' -> right()

            'S' -> swap()
        }
        boreadshrink()
        showboreod()
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

    println("player one what is your name?".col(159,235,665))
    p1n = readln()

    println("what a dumb ass name, oh and you are Purple:) aka w".col(159,235,665))
    println()
    println("player two surely you have a better name?".col(159,235,665))
    p2n = readln()

    println("dam it some how worse!, oh u Green:( aka b".col(159,235,665))
}

fun player1answer(): Char{
    println("what you want to do $p1n?".col(555,99,4343))
    println("move [L]eft".col(555,99,4343))
    println("move [R]ight".col(555,99,4343))
    println("[S]wap".col(555,99,4343))
    println()
    val goodchoise = listOf("L, R, S")
    while (true) {
        print("choose: ".col(555,99,4343))
        val choice = readlnOrNull()?.firstOrNull()
       if (choice != null) return choice

    }

}


fun player2answer(): Char{
    println("what you want to do $p2n?".col(22,777,99))
    println("move [L]eft".col(22,777,99))
    println("move [R]ight".col(22,777,99))
    println("[S]wap".col(22,777,99))
    println()
    val goodchoise = listOf("L, R, S")
    while (true) {
        print("choose: ".col(22,777,99))
        val choice = readlnOrNull()?.firstOrNull()
        if (choice != null) return choice
    }
}
fun setupconters(){
    val p1Con = "p ".col(555,99,4343)
    val p2Con = "g ".col(22,777,99)
    squares[6] = p1Con
    squares[4] = p1Con
    squares[8] = p1Con
    squares[9] = p2Con
    squares[7] = p2Con
    squares[5] = p2Con
}
fun swap() {
    var cont1 = 0
    var cont2 = 0
    while (true) {
        print("switch pick 1 : ".col(13, 551, 161))
        cont1 = readln().toInt() - 1

        if (squares[cont1] == "." || squares[cont1] == "x") {
            println("invalid move")
            continue
        } else break
    }

    while (true) {
        print("switch pick 2 : ".col(13, 551, 161))
        cont2 = readln().toInt() - 1

        if (squares[cont2] == "." || squares[cont2] == "x") {
            println("invalid move")
            continue
        } else break
    }



    val place1 = squares[cont1 ]
    val place2 = squares[cont2 ]


    squares[cont1 ] = place2
    squares[cont2 ] = place1
        println()
        showboreod()


}

//    if (playerconter == 0) {
//        showboreod()
//        whatplayer2do()
//    } else {
//        showboreod()
//        whatplayer1do()
//    }


fun right(){
    var cont1 = 0

    while (true) {
        println("what one do u want to move to the right?".col(743, 62, 88))
        cont1 = readln().toInt() - 1
        if (squares[cont1 + 1] != ".") {

            println("invalid move".col(743, 62, 88))

            if (playerconter == 0) {
                showboreod()
                whatplayer2do()
            }
            else {
                showboreod()
                whatplayer1do()
            }
        }

        break
    }

    val cont2 = cont1 + 1

    val place1 = squares[cont1 ]
    val place2 = squares[cont2 ]


    squares[cont1 ] = place2
    squares[cont2 ] = place1
println()
    showboreod()
}


fun left(){
    var cont1 = 0

    while (true) {
        println("what one do u want to move to the left?".col(743, 62, 88))
        cont1 = readln().toInt() - 1
        if (squares[cont1 - 1] != ".") {

            println("invalid move".col(743, 62, 88))

            if (playerconter == 0) {
                showboreod()
                whatplayer2do()
            }
            else {
                showboreod()
                whatplayer1do()
            }
        }

        break
    }
    val cont2 = cont1 - 1

    val place1 = squares[cont1 ]
    val place2 = squares[cont2 ]


    squares[cont1 ] = place2
    squares[cont2 ] = place1
    println()
    showboreod()

}

fun boreadshrink(){
println("board will shrink")

    squares[highbored] = "x ".blue()
    highbored --
    squares[lowbored] = "x ".blue()
    lowbored ++
}