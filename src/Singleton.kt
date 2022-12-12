fun main(args: Array<String>) {
    println(Database)
}

object Database {
    init {
        println("Database Created")
    }
}
/*class Database private constructor() {
    companion object {
        private var instance: Database? = null

        fun getInstance(): Database? {
            if(instance == null) {
                instance = Database()
            }

            return instance
        }
    }
}*/