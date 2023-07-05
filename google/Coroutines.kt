import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
fun main() {
    runBlocking {
        println("Weather forecast")
        delay(1000)
        println("Sunny")
    }
}