package kotlinbasic

fun main() {

    /*var string : String? = "Hello"
        print(string.length) -> compiler error because of null check
    */

    var string : String? = "Hello"
    if (string != null) {// smart cast
        print(string.length)
    }
}