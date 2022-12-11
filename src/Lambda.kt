/*
* lambda operation
* */
fun main(args: Array<String>) {
    val printMessage = { message: String -> println(message) }

    printMessage("Welcome")

    val sumA = { x: Int, y: Int -> x + y }
    println(sumA(5, 3))

    val sumB: (Int, Int) -> Int = {x,y->x+y}

    fun downloadData(url: String, completion: ()->Unit) {
        //sent a download request
        //we got back data
        //there were no network error
        completion()
    }

    //call downloadDataFunction
    downloadData("fakeUrl.com",{
        println("cannot run, will only run" +
                "after the completion()")
    })

    fun downloadCarData(url: String, completion: (Car)->Unit) {
        val car = Car("Tesla","ModelX","Blue")
        completion(car)
    }

    /*downloadCarData("fakeUrl.com") {car ->
        println(car.color)
        println(car.make)
    }*/

    downloadCarData("fakeUrl.com") {
        println("it:")
        println(it.color)
        println(it.make)
    }

    fun downloadTruckData(url: String, completion: (Truck?,Boolean) -> Unit) {
        //make the web request
        //we got the result back

        val webRequestSuccess = false;
        if(webRequestSuccess) {
            //recieved truck data
            val truck = Truck("Ford","F-150",10000)
            completion(truck, true)
        }else{
            completion(null,false)
        }
    }

    downloadTruckData("fakeUrl.com") { truck, success ->
        if(success==true) {
            //do something with our truck
            truck?.tow()
        }else{
            println("Something went wrong!")
        }

    }



    /*fun printMessage(message: String) {
        println(message)
    }*/
    //printMessage("kjhjkhkjh")
}