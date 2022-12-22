package kotlinbasic

class Student {
    fun isPassed(marks: Int) : Boolean {
        return marks>40
    }
}

fun Student.isExcellent(marks: Int) : Boolean {
    return marks>95
}

fun main(args: Array<String>) {
    val student = Student()

    val passedStatus = student.isPassed(45)
    println("Student passing status is $passedStatus")

    val excellentStatus = student.isExcellent(45)
    println("Student excellent status is $excellentStatus")

}