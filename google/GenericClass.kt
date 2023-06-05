/** Make a reusable class with generics */

/**
 * FillInTheBlankQuestion
 * TrueOrFalseQuestion
 * NumericQuestion
 * are
 * Manual class/basic class
 */

class FillInTheBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
)

class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
)

class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)

/**
 * Question is Generic Class
 * the T is the type, can be set anything
 * when it's called
 */
class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)

fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", "medium")
    val question2 = Question<Boolean>("The sky is green. True or false", false, "easy")
    val question3 = Question<Int>("How many days are there between full moons?", 28, "hard")

    println(question1.answer)
    println(question2.answer)
    println(question3.answer)
}