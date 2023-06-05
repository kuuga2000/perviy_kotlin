
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
        var answered: Int = 14
    }
}

fun main() {
    println("${StudentProgressBasic.answered} of ${StudentProgressBasic.total} answered.")

    /**
     * object with companion
     */
    println("${Quiz.answered} of ${Quiz.total} answered.")
}
