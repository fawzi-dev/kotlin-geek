import java.util.*

fun main() {
    val number = 19


    val result:String = if (number in 10..20) {
        "Number is between 10 and 20"
    } else if (number in 21..30) {
        "Number is between 21 and 30"
    } else {
        "Number is outside the specified ranges"
    }

    println(result)

}
