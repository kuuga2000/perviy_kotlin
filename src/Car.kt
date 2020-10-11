open class Vehicle(val make: String, val model: String) {
    open fun accelerate() {
        println("Ngeeeeng Ngeeeng")
    }

    fun park() {
        println("parking the vehicle")
    }

    fun brake() {
        println("Stop")
    }
}

class Car(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun accelerate(){
        super.accelerate()
        println("GOGOGOGOGOGO")
    }
}

class Truck(make:String,model:String, val towingCapacity: Int): Vehicle(make,model) {
    fun tow(){
        println("Go to mountain xx")
    }
}

fun main(args: Array<String>) {
    val tesla = Car("Tesla", "ModelS", "Red")
    tesla.accelerate()

    var truck = Truck("Ford", "F-150", 10000)
}