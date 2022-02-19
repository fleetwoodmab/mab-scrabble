import kotlin.system.exitProcess

class ScrabbleScore {
var sum = 0

    fun scoreWord(word: String): Int {

        for(c in word.toCharArray()) {
           println("$c: " + scoreLetter(c))
            sum += scoreLetter(c)
        }
        return sum
    }

    //https://www.codevscolor.com/kotlin-print-each-character-string


    //Reference: https://exercism.org/tracks/kotlin/exercises/scrabble-score/solutions?page=1
    fun scoreLetter(char: Char): Int {
        return when (char) {
            in "AEIOULNRST" -> 1
            in "DG" -> 2
            in "BCMP" -> 3
            in "FHVWY" -> 4
            in "K" -> 5
            in "JX" -> 8
            in "QZ" -> 10
            in "0" -> exitProcess(0) //https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.system/exit-process.html
            else -> error("Unknown character")
        }
    }

    fun letterValues() = """Letter                             Value
  A, E, I, O, U, L, N, R, S, T ----- 1
  D, G  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 2
  B, C, M, P ----------------------- 3
  F, H, V, W, Y  ~~~~~~~~~~~~~~~~~~~ 4
  K  ------------------------------- 5
  J, X ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 8
  Q, Z ---------------------------- 10"""
}


