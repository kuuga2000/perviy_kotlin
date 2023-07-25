fun main() {
    var hs: House<String, Int> = House(name= "The Reds",size=2)
    println(hs.color)
    println(hs.size)
}

class House<T,E>(name: T, size: E) {
    var color:T = name
    var size:E = size
}
