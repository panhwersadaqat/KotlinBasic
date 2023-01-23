package kotlinbasic

object SingletonDemo {
    init {
        println("Hello from init block of Singleton class")
    }

    fun display() {
        println("Hello from display method of Singleton class")
    }
}

fun main() {
    SingletonDemo.display()
}