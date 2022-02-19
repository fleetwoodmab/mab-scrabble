class ScrabbleScore {

    fun scoreWord(word: String): Int{
        //TODO calculate using the scoreLetter method below, the scrabble value of the word passed as a parameter
        for(c in word.toCharArray()) {
           println("$c: " + scoreLetter(c))
        }
        return 0

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