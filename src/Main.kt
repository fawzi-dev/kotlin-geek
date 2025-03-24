import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter two integers: ")
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    scanner.close()


    print("Addition: ")
    addition(num1, num2)
    print("Division: ")
    division(num1, num2)
    print("Multiplication: ")
    multiplication(num1, num2)
    print("Subtraction: ")
    subtraction(num1, num2)
}


fun addition(x:Int,y:Int){
    println(x + y)
}

fun division(x:Int,y:Int){
    if(y == 0){
        throw IllegalArgumentException("Division by zero is not allowed")
    }
    println(x / y)
}

fun multiplication(x:Int,y:Int){
    println(x * y)
}

fun subtraction(x:Int,y:Int){
    println(x - y)
}