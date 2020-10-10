fun main(arg: Array<String>) {
    val str = "Go go Goranger!"
    println(str);
    val str_1 = "Go Go \nRanger Fight \"Monsters\"!!"
    println(str_1)

    val bigString = """ABCABC
        |DEFGHI
        |GISSDF
        |ZZZZZZ
    """.trimMargin()

    println(bigString)

    /*for (char in str) {
        println(char)
    }*/

    val contentEquals = str.contentEquals("Go go Goranger!")
    println(contentEquals)

    val contentEquals_1 = str.contains("goranger",false)
    println(contentEquals_1)

    val uppercase = str.toUpperCase()
    val lowercase = str.toLowerCase()

    println(uppercase)
    println(lowercase);

    var fox = "The quick brown fox jumps over the lazy dog"
    val subSequence = fox.subSequence(4, 15)
    println(subSequence)

    val hero_name = "Morphling";
    val world = "Dota 2"
    println("$hero_name is good hero in $world")

}