val seq = sequence {
    yield(1)
    yield(2)
    yield(3)
}

val seq2 = sequence {
    println("Generating first")
    yield(1)
    println("Generating second")
    yield(2)
    println("Generating third")
    yield(3)
    println("Done")
}

fun main(args: Array<String>){
/*    for(num in seq) {
        print(num)
    }
    println()
    for (numx in seq2) {
        println(numx)
    }*/

    val iterator = seq.iterator()
    println("Starting")
    val first = iterator.next()
    println("First: $first")
    val second = iterator.next()
    println("Second: $second")
    val three = iterator.next()
    println("three: $three")
}