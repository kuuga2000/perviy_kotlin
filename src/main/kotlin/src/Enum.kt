fun main(args: Array<String>) {
    /*for (direction in Direction.values()) {
        println(direction)
    }*/
    /*for (direction in Direction.values()) {
        println(direction.direction+" == "+direction.distance)
    }*/
    Direction.WEST.printData()
    Direction.WEST.printData()

    //val dr = Direction.NORTH
    val dr = Direction.valueOf("East".uppercase())
    when(dr) {
        Direction.NORTH -> {
            println("the direction is NORTH")
        }
        Direction.SOUTH -> {
            println("the direction is SOUTH")
        }
        Direction.EAST -> {
            println("the direction is EAST")
        }
        Direction.WEST -> {
            println("the direction is WEST")
        }
    }
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("Go to NORTH", 10),
    SOUTH("Go to SOUTH", 20),
    EAST("Go to EAST",30),
    WEST("Go to WEST",40);

    fun printData() {
        println("Direction =$direction and Distance=$distance");
    }
}