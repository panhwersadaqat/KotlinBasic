package kotlinbasic.scopefunc

fun main() {
    val list = mutableListOf("Hello")

    list.also {
        it.add("world")
    }

    println(list)
}