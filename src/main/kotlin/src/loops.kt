fun main (args: Array<String>) {
    val skills = arrayListOf("Rupture", "Blinks", "Gust")
    val hasSkills = hashMapOf("Monkey King" to "Jinggu Mastery", "Riki Maru" to "Blink Strike")

    //only return value
    for (skill in skills) {
        println(skill)
    }

    for ((hero, skill) in hasSkills) {
        println("$hero has $skill")
    }

    //while looping
    /*var n = 10
    while (n > 0) {
        println(n)
        n--
    }*/

    var i=1
    while (i <= 10) {
        println(i)
        i++
    }

}