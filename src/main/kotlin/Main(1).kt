import java.util.*

private val input = Scanner(System.`in`);
private val scrabbleScore = ScrabbleScore();


fun main(args: Array<String>) {
    println(scrabbleScore.letterValues())
    while (true) {

        print(" \n Enter a word and compute the Scrabble Score: ")
        val word = input.nextLine().uppercase()
        println(word + " has a value of " + scrabbleScore.scoreWord(word))
        println("To quit program type 0.")

    }
}



