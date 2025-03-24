import java.util.*

fun main(){
   var finalExamScore:String = "4.7 GPA";

   var result:Double? = finalExamScore.toDoubleOrNull()?.plus(1.0);

    println("The final exam score is: $result");
}