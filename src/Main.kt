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

//my  vars that mean stuff
val squares = mutableListOf<String>()
var p2n = " "
var p1n = " "
var lowbored = 0
var highbored = 14
var playerconter = 0
var chikinedinner = 0
var done = 0


//my sick ass title and where all the fuctiks go
fun main() {
    //rules
    println()
    println()
    println("Players take turns. You may not skip your turn \n".col(159, 235, 665) +
            "\n" +
            "On your turn you must do exactly one of the following: \n".col(159, 235, 665) +
            "\n" +
            "Move one of your counters exactly one square left or right into an empty square \n".col(159, 235, 665) +
            "\n" +
            "Swap one of your counters with an adjacent opponent counter, moving your counter into their square and their counter into yours, but… \n".col(159, 235, 665) +
            "\n" +
            "You may not swap an opponent counter into a danger zone square (the end squares) \n".col(159, 235, 665) +
            "\n" +
            "After both players have taken their turn, the board shrinks - the square at each end is removed. Any counter on a removed square is ‘crushed’ and eliminated \n".col(159, 235, 665) +
            "\n" +
            "Win Condition \n".col(159, 235, 665) +
            "\n" +
            "The last player with at least one counter remaining on the board wins ".col(159, 235, 665))
    println()
    println()
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
        if (done == 1)
            break
        val action = player1answer()
        playerconter ++

        //lower and upcase for left right and swap
        when (action) {

            'L' -> left()

            'R' -> right()

            'S' -> swap()

            'l' -> left()

            'r' -> right()

            's' -> swap()
        }
        whatplayer2do()



    }
}


fun whatplayer2do() {
// done means end game and if it 1 it stopes this code
    while (true) {
        if (done == 1)
            break
        val action2 = player2answer()
        playerconter --
        when (action2) {

//lower and upcase for left right and swap
            'L' -> left()

            'R' -> right()

            'S' -> swap()

            'l' -> left()

            'r' -> right()

            's' -> swap()
        }
        boreadshrink()
        showboreod()
whatplayer1do()


    }
}



//makes the 15 sqaures
fun creatbored(){
    while (squares.size < 15) {
        squares.add  (".")

    }
}

//design and show the boread
fun showboreod(){

//the numbers for the boxs
    println("  1   2   3   4   5   6   7   8   9  10  11  12  13  14  15".col(323,451,130))

//the sides of books
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
while (true) {
    //to tell them where the rules are
    println("scroll up for the rules".col(159, 235, 665))
    println("player one what is your name?".col(159, 235, 665))
    p1n = readln()

    //to keep it from being blank
    if (p1n.isNotBlank()) break
}
    println("what a dumb ass name, oh and you are Purple:) aka p".col(159, 235, 665))
    println()
    while (true){
    println("player two surely you have a better name?".col(159, 235, 665))
    p2n = readln()

        //to keep it from being blank
    if (p2n.isNotBlank()) break
    println("dam it some how worse!, oh u Green:( aka g".col(159, 235, 665))

}
}

fun player1answer(): Char{
    //asking what move it whats to do
    println("what you want to do $p1n?".col(555,99,4343))
    println("move [L]eft".col(555,99,4343))
    println("move [R]ight".col(555,99,4343))
    println("[S]wap".col(555,99,4343))
    println()

    //for caps and lower of what can be piked
    val goodchoise = listOf("L, R, S, l, r, s")
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

    //for caps and lower of what can be piked
    val goodchoise = listOf("L, R, S, l, r, s")
    while (true) {
        print("choose: ".col(22,777,99))
        val choice = readlnOrNull()?.firstOrNull()
        if (choice != null) return choice
    }
}
fun setupconters(){
    val p1Con = "p ".col(555,99,4343)
    val p2Con = "g ".col(22,777,99)

    //where p and g conters go
    squares[6] = p1Con
    squares[4] = p1Con
    squares[8] = p1Con
    squares[9] = p2Con
    squares[7] = p2Con
    squares[5] = p2Con
}
//swap two conters
fun swap() {
    var cont1 = 0
    var cont2 = 0
    while (true) {
        print("switch pick 1 : ".col(13, 551, 161))
        cont1 = readln().toInt() - 1

//if they pick thsese two it wont let them
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


//gets them and assign them then swaps places
    val place1 = squares[cont1 ]
    val place2 = squares[cont2 ]


    squares[cont1 ] = place2
    squares[cont2 ] = place1
        println()
        showboreod()


}



//move right
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

//move left
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
// this shrekins the boread with x
fun boreadshrink(){
println("board will shrink".col(888,99,71))

//highbored shriks from the right
    squares[highbored] = "x ".blue()
    highbored --

    //lowbored shriks from the left
    squares[lowbored] = "x ".blue()
    lowbored ++

//if it gets to 7 it puts the winner winner code into action
    chikinedinner ++
    if (chikinedinner == 7){
        winnerwinner()
    }
}
//show who won
fun winnerwinner(){
//if purple win
    if (squares[9] == "p")
        println("well done $p1n you smart ass ".col(555,99,4343))

//if green win
    else
        println("good boy/girl $p2n you the best".col(22,777,99))

    //once one of these messege are sida it will plus one onto done and trigger game to end
    done ++
}
