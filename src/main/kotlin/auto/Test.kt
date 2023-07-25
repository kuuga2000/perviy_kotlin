

enum class CupcakeScreen(val title: String = "1") {
    Start(title = "Asd"),
    Flavor(title = "x"),
    Pickup(title = "z"),
    Summary(title = "c")
}

fun main() {
    println(CupcakeScreen.Start.name)
}