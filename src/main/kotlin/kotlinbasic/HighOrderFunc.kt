package kotlinbasic

var lambda = {
    println("Hello World! from lambda expression")
}

//func returning unit
fun higherOrder(lmbd: () -> Unit) {
    lmbd()
}

fun main() {
    higherOrder(lambda)
}