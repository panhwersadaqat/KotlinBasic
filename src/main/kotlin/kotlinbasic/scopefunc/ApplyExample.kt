package kotlinbasic.scopefunc

class ApplyExample {
    lateinit var name: String
    lateinit var lname: String
}

fun main() {
    ApplyExample().apply {
        name = "Sadaqat"
        lname = "Panhwer"
        print("$name $lname")
    }
}