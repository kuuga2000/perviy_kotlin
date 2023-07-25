fun main(args: Array<String>) {
    displayText()
    funcWithParam("Wake me up when september's end")
    val getSubtotal = getSubtotal(5,10000)
    println("Subtotal $getSubtotal")
    println("Subtotal ${getSubtotal(10,2000)}")

    var getFeeling = getFeeling();
    println(getFeeling)

}

fun displayText() {
    println("I like to learn kotlin!")
}

fun funcWithParam(line: String) {
    println(line)
}

fun getSubtotal(quantity: Int, price: Int): Int {
    val subtotal = price * quantity
    return subtotal
}

fun getFeeling(mood: String = "Normal"): String {
    return mood
}