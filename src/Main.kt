import java.util.*

fun main(){
val number = 25

if (number in 10..20) {
    println("Number is between 10 and 20")
} else if (number in 21..30) {
    println("Number is between 21 and 30")
} else {
    println("Number is outside the specified ranges")
}
}
