enum class Difficulty {
    EASY, MEDIUM, HARD
}

class Questions<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

fun main() {
    val question1 = Questions<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Questions<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Questions<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    println(question3.difficulty)
    println(question2.difficulty.equals(Difficulty.EASY))
    println(question1.difficulty.equals(Difficulty.HARD))
}