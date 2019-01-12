package creational.singleton

class Main private constructor() {

    companion object {

        @Volatile
        private var instance: Main? = null

        fun getMainInstance(): Main {
            if (instance == null) {
                synchronized(Main::class.java) {
                    if (instance == null) {
                        instance = Main()
                    }
                }
            }

            return instance!!
        }
    }


    fun test() = println("I'm alive")
}

fun main(args: Array<String>) {
    Main.getMainInstance().test()
}