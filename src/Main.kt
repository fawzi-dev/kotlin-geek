import java.util.*

fun main() {
    when (val number:Int = -1) {
        in 1..10 -> println("The number $number is between 1 and 10")
        in 11..20 -> println("The number $number is between 11 and 20")
        else -> println("The number $number is outside the range 1 to 20")
    }

}
