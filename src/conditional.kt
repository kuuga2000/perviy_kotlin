import kotlin.math.min

fun main (args: Array<String>) {
    val a = 2
    val b = 1
    if (a == b) {
        println("They are same")
    }

    if (a != b) {
        println("They are not same")
    }

    val balance = 100000
    val price = 50000
    val minimum = 50000
    if(balance >= price) {
        println("Ok")
    }
    if(balance <= price) {
        println("not Ok")
    }
    var balance_after_deduction = balance - price
    println("balace after deduction : $balance_after_deduction")
    if(balance_after_deduction >= minimum){
        println("You Can Take Money")
    } else if (balance_after_deduction < minimum) {
        println("You Cannot Take Money, soldo minimum must be 50000")
    }


    val n = 5

    when( n ) {
        1   -> println("n == 1")
        50  -> println("n == 50")
        else -> println("n is unknown")
    }


}