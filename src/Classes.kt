/*class Hero constructor(name: String, item: String) {
    var name = name
    var item = item
}*/

class Hero constructor(val name: String, val item: String, val rule: String?) {
    fun heroRule() {
        println("Low Carry")
    }
    fun details(){
        println("$name is $rule, and usually build $item")
    }
}

class Item(val name: String, val damage: Int) {

}

fun main(args: Array<String>) {
    val hero = Hero("Bloodseeker", "Dagon","Low Carry")
    println(hero.name)
    println(hero.item)
    hero.heroRule()
    hero.details()

    val item = Item("Dagon Lvl 5",8000)

}