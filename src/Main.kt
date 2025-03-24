import java.util.*

fun main(){
    var myString:String = "Hello World!"
    println(myString.uppercase()) // HELLO WORLD!
    println(myString.lowercase()) // hello world!
    println(myString.replaceFirstChar { it.lowercase(Locale.getDefault()) }) // hello World!
    println(myString.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }) // Hello world!
    println(myString.length) // 12
    println(myString.get(0)) // H
    println(myString[0]) // H
    println(myString.substring(6)) // World!
    println(myString.substring(6, 11)) // World
    print("$myString: ${myString.length}")
}