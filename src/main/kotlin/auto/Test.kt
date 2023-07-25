enum class CupcakeScreen(val title: String = "1") {
    Start(title = "Asd"),
    Flavor(title = "x"),
    Pickup(title = "z"),
    Summary(title = "c")
}
enum class Color(val colorName: String, val rgb: String) {
    RED("Red", "#FF0000"),
    ORANGE(
        "Orange",
        "#FF7F00"
    ),
    YELLOW("Yellow", "#FFFF00")
}

fun findByRgb(rgb: String): Color? = Color.entries.find { it.rgb == rgb }

fun main() {
    val a = findByRgb("#FF0000");
    println(Color.entries.find{ it.rgb == "#FF0000"} )
}
