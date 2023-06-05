/**
 * When working with Compose,
 * you may have noticed some interesting syntax
 * when specifying the size of UI elements.
 * Numeric types, such as Double,
 * appear to have properties like dp and sp specifying dimensions.
 * padding(16.dp)
 */
object StudentProgressBasic {
    var total: Int = 10
    var answered: Int = 3
}

class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", "medium")
    val question2 = Question<Boolean>("The sky is green. True or false", false, "easy")
    val question3 = Question<Int>("How many days are there between full moons?", 28, "hard")
    companion object StudentProgress {
        var total: Int = 15
        var answered: Int = 10
    }
}

/**
 * Add an extension property
 * Note: Extension properties can't store data, so they must be get-only.
 */
val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered."

/**
 * Add an extension function
 */
fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) {
        print("▓")
    }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressText)
}

fun main() {
    println("${StudentProgressBasic.answered} of ${StudentProgressBasic.total} answered.")
    /**
     * object with companion
     */
    println("${Quiz.answered} of ${Quiz.total} answered.")

    println(Quiz.progressText)

    Quiz.printProgressBar()

    print("test"); print("ab")
}
