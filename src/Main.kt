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


val squares = mutableMapOf<String,Int>()

fun main() {
   println("=================")
    println("=               =")
    println("= the squeeze   =")
    println("=               =")
    println("=================")
println()
    println()
showboreod()
}
fun creatbored(){
    while (squares.size < 6) {
        squares.add("EMPTY")
    }
}


fun showboreod(){


    println("   cell1    cell2    cell3    cell4    cell5    cell6")

    print("╭--------".repeat(squares.size))
    println("╮")
    for (square in squares) {

        print("|  $square".padEnd(9))
    }
    println("|")
    print("╰--------".repeat(squares.size))
    println("╯")

}

