package auto

/*sealed class Menu {
    data class PIZZA(val quantity: Int, val size: String, val name: String) : Menu()
    data class BURGER(val quantity: Int, val size: String) : Menu()
    data class CHICKEN(val name: String, val pieces: Int) : Menu()
}
enum class Menux (val quantity: Int) {
    PIZZA(6),
    BURGER(4),
    CHICKEN(8)
}*/
fun main(args: Array<String>) {
    val menu: Menu = Menu.PIZZA(
        name = "Pizza",
        size = "XL",
        quantity = 20
    )


    logMenu(menu)


}


sealed interface DinnerMenu
sealed interface LunchMenu

sealed class Menu {
    data class PIZZA(val name: String, val size: String, val quantity: Int) : Menu(), DinnerMenu
    data class BURGER(val quantity: Int, val size: String) : Menu(), LunchMenu
    data class CHICKEN(val quantity: Int, val pieces: String) : Menu(), LunchMenu
}

fun logMenu(menu: Menu) {
    when (menu) {
        is Menu.PIZZA -> print(menu.quantity)
        is Menu.BURGER -> print("burger")
        is Menu.CHICKEN -> print("chicken")
    }
}

fun logLunchMenu(menu: LunchMenu) {
    when (menu) {
        is Menu.BURGER -> print("burger")
        is Menu.CHICKEN -> print("chicken")
    }
}

fun logDinnerMenu(menu: DinnerMenu) {
    when (menu) {
        is Menu.PIZZA -> print("pizza")
    }
}
