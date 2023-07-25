/** Make a reusable class with generics */

/**
 * FillInTheBlankQuestion
 * TrueOrFalseQuestion
 * NumericQuestion
 * are
 * Manual class/basic class
 */

data class FillInTheBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
)

data class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
)

data class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)

/**
 * Question is Generic Class
 * the T is the type, can be set anything
 * when it's called
 */

/**
 * Many of the classes you've worked with so far,
 * such as subclasses of Activity,
 * have several methods to perform different actions.
 * These classes don't just represent data,
 * but also contain a lot of functionality.
 *
 * Classes like the Question class,
 * on the other hand, only contain data.
 * They don't have any methods that perform an action.
 * These can be defined as a data class.
 * Defining a class as a data class allows the Kotlin compiler
 * to make certain assumptions,
 * and to automatically implement some methods.
 * For example,
 * toString() is called behind the scenes by the println() function.
 * When you use a data class, toString()
 * and other methods are implemented automatically
 * based on the class's properties.
 *
 * To define a data class, simply add the data keyword before the class keyword.
 * data class 'class nama' ( ... )
 */
data class Question<T>(
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